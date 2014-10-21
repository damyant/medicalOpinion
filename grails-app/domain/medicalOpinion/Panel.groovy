package medicalOpinion

class Panel {
    String panelName
//       static hasMany = [specialist:Specialist]



    static constraints = {
        panelName blank: false, unique: true
    }
}
