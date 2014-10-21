package medicalOpinion

import grails.plugins.springsecurity.Secured

class DoctorController {
@Secured(["ROLE_ADMIN"])
    def newDoctor() {
    def newIns=null

    def panelTypeList = Panel.list()

    [newIns:newIns, panelTypeList: panelTypeList]
    }

    @Secured(["ROLE_ADMIN"])
    def saveDoctor() {
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
            def psdInst=new PanelSpecialDoctor()
            psdInst.name= userInst
            psdInst.panSpec=PanelSpeciality.findByPanelAndSpeciality(Panel.findById(Long.parseLong(params.panel)),Specialist.findById(Long.parseLong(params.speciality)))
            psdInst.save(failOnError: true, flush: true)
            def userRoleInst = new UserRole()
            userRoleInst.user = userInst
            userRoleInst.role = Role.findById(2)
            if (userRoleInst.save(failOnError: true, flush: true)) {
                flash.message = "Sign Up Successfully"
            }
        } else {
            flash.message = "Try Again"
        }
        redirect(controller: "login", action: "index")
    }



    def home() {}
}
