package medicalOpinion

class AdminController {

    def home() {
//        render "At Doctor"
    }

    def addPanel() {
        def specList = Specialist.list(sort: 'specName')
        [specList: specList]


    }

    def savePanel() {
        println(params)
        def panelInst = new Panel(params)
        if (panelInst.save(failOnError: true, flush: true)) {
        def specList=params.speciality
//            println("---------------------"+specList)
            specList.each {
//                println("uuuuuuuuuuuuuuuu    "+it)
                def panInst = new PanelSpeciality()
                panInst.panel = panelInst
                panInst.speciality = Specialist.findById(Long.parseLong(it))
                panInst.save(flush: true)
            }

            flash.message = "Saved Successfully"
        } else {
            flash.message = "Try Again"
        }
        redirect(controller: "admin", action: "addPanel")
    }

    def editPanel() {

    }

    def delPanel() {

    }

    def addSpecialist() {

    }

    def saveSpecialist() {
        def specialInst = new Specialist(params)
        if (specialInst.save(failOnError: true, flush: true)) {
            flash.message = "Saved Successfully"
        } else {
            flash.message = "Try Again"
        }
        redirect(controller: "admin", action: "addSpecialist")

    }

    def editSpecialist() {

    }

    def delSpecialist() {

    }
}
