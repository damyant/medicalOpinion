package medicalOpinion

class HomeController {
    def springSecurityService
    def index() {
        println("0000000000000000000000000000089999999999999")
        if (springSecurityService.getCurrentUser()) {
            println("------------------------------------------")
            def currentUser = springSecurityService.getCurrentUser().getUsername()
            if (UserRole.findByUserAndRole(User.findByUsername(currentUser), Role.findById(3))) {
                println("========================admin")
                redirect(controller: 'admin', action: "home")

            } else if (UserRole.findByUserAndRole(User.findByUsername(currentUser), Role.findById(1))) {
                println("========================patient")
                redirect(controller: 'patient', action: "uploadFile")
            }
            else {
                println("========================doctor")
                redirect(controller: 'doctor', action: "home")
            }
        } else {
            redirect(controller: "login", action: 'auth')
        }
    }
}
