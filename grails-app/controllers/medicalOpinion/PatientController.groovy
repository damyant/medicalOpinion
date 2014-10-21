package medicalOpinion

import grails.converters.JSON
import grails.plugins.springsecurity.Secured
import grails.plugin.mail.*

class PatientController {

    def springSecurityService
    def mailService

    def newUser() {}

    def saveUser() {
        def userInst = new User()
        userInst.name = params.name
        userInst.username = params.username
        userInst.password = params.password
        userInst.address = params.address
        userInst.email = params.email
        userInst.phoneNo = params.phoneNo
        userInst.enabled = true
        userInst.accountExpired = false
        userInst.accountLocked = false
        userInst.passwordExpired = false
        if (userInst.save(failOnError: true, flush: true)) {
            def userRoleInst = new UserRole()
            userRoleInst.user = userInst
            userRoleInst.role = Role.findById(1)
            if (userRoleInst.save(failOnError: true, flush: true)) {
                flash.message = "Sign Up Successfully"
            }
        } else {
            flash.message = "Try Again"
        }

        redirect(controller: "login", action: "index")

    }
    @Secured(["ROLE_PATIENT","ROLE_ADMIN"])
    def uploadFile() {
        def newIns=null

        def panelTypeList = Panel.list()
        def panSpecList = PanelSpeciality.list()


            [newIns:newIns, panelTypeList: panelTypeList,panSpecList:panSpecList]



    }

    def saveFile() {
        def currentUser = springSecurityService.getCurrentUser()
        def success=false
        def f = request.getFile('file')
        println("======================" + currentUser)
        if (f.originalFilename) {

            f.transferTo(new File(servletContext.getRealPath("/") + '/Angiofolder' + System.getProperty('file.separator') + f.originalFilename))
            File newFile = new File(servletContext.getRealPath("/") + '/Angiofolder' + System.getProperty('file.separator') + f.originalFilename)
            if (newFile.exists()) {

                def fileInst = new Patient()
                fileInst.userId = currentUser
                fileInst.description = params.description
                fileInst.fileName = newFile.absolutePath
                def panSpecInst=PanelSpeciality.findByPanelAndSpeciality(Panel.findById(Long.parseLong(params.panel)),Specialist.findById(Long.parseLong(params.speciality)))
                fileInst.psd=PanelSpecialDoctor.findByPanSpecAndName(panSpecInst,User.findById(Long.parseLong(params.doctor)))
                if (fileInst.save(failOnError: true, flush: true)) {
                    def email=User.findById(Long.parseLong(params.doctor)).email
                    println("=================="+email)
                    if(email != null)
                    {
                        try
                        {

                            mailService.sendMail {
                                to email
                                subject "Alert!New Document Uploaded"
                                body "Hello,"+fileInst.userId.name+" has Uploaded a new Document."
                            }
                            success=true

                        }
                        catch(Exception e)
                        {
                            e.printStackTrace()
                            success=false
                        }
                    }
                    else
                    {
                        success=false
                    }

                    flash.message = "Saved Successfully"
                } else {
                    flash.message = "Not Saved "
                }
            }
        }
        redirect(action: 'uploadFile')
    }
    @Secured(["ROLE_DOCTOR","ROLE_ADMIN"])
    def viewFile() {
        def currentUser = springSecurityService.getCurrentUser()
        println("======================="+currentUser.id)
        def psdInst=PanelSpecialDoctor.findByName(User.findById(currentUser.id))
        def fileList = Patient.findAllByPsd(psdInst)

        def filePath = servletContext.getRealPath("/") + '/Angiofolder' + System.getProperty('file.separator')
        [fileList: fileList, filePath: filePath]
    }

    def download = {
        def file = new File(params.fileName)
        def fileInputStream = new FileInputStream(file)
        def outputStream = response.getOutputStream()
        byte[] buffer = new byte[4096];
        int len;
        while ((len = fileInputStream.read(buffer)) > 0) {
            outputStream.write(buffer, 0, len);
        }
        outputStream.flush()
        outputStream.close()
        fileInputStream.close()
        redirect(action: 'viewFile')
    }
    @Secured(["ROLE_ADMIN"])
    def delUser() {
        def roleList = []
//
        def userList = UserRole.findAllByRoleNotEqual(Role.findById(3)).user.unique()
        userList.each {
            if (UserRole.findByUser(it).role.id == 1)
                roleList << "Patient"
            else if (UserRole.findByUser(it).role.id == 2)
                roleList << "Doctor"
        }
        [userList: userList, roleList: roleList]
    }

    def delete() {

       def userInst = User.findById(Long.parseLong(params.userInstId))
        def patientList = Patient.findAllByUserId(userInst)
        patientList.each {
            it.delete()
        }
        def userRoleList = UserRole.findByUser(userInst)
        userRoleList.each {
            it.delete()
        }
        userInst.delete()
        if (!User.exists(userInst.id)) {

            flash.message = "Delete Successfully"
        }
        redirect(controller: "patient", action: "delUser")

    }
    def loadSpeciality={
        def specList=PanelSpeciality.findAllByPanel(Panel.findById(Long.parseLong(params.panel))).speciality
        render specList  as JSON
    }

    def loadDoctor={
        def docList= PanelSpecialDoctor.findAllByPanSpec(PanelSpeciality.findByPanelAndSpeciality(Panel.findById(Long.parseLong(params.panel)),Specialist.findById(Long.parseLong(params.speciality)))).name
        println("doclist---------------------------"+docList.name)
        render docList as JSON
    }

}
