import medicalOpinion.Role
import medicalOpinion.User
import medicalOpinion.UserRole

class BootStrap {

    def init = { servletContext ->
        def patient = Role.findByAuthority('ROLE_PATIENT') ?: new Role(authority: 'ROLE_PATIENT').save(failOnError: true)
        def doctor = Role.findByAuthority('ROLE_DOCTOR') ?: new Role(authority: 'ROLE_DOCTOR').save(failOnError: true)
        def admin = Role.findByAuthority('ROLE_ADMIN') ?: new Role(authority: 'ROLE_ADMIN').save(failOnError: true)
        def adminUser = User.findByUsername('admin') ?: new User(
                username: 'admin',
                password: 'admin',
                email: 'admin@damyant.com',
                address:'address',
                name:'admin',
                phoneNo:'0000000000',
                enabled: true).save(failOnError: true)

        if (!adminUser.authorities.contains(admin)) {
            UserRole.create adminUser, admin
        }


    }
    def destroy = {
    }
}
