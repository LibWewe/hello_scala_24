package scala_test

class Teacher(private[scala_test] var name: String) {
    var age: Int = _
    var sex: String = _
    var pro: String = _

    def this(name: String, age: Int) = {
        this(name)
        this.age = age
    }

    def this(name: String, age: Int, sex: String) = {
        this(name, age)
        this.sex = sex
    }

    def this(name: String, age: Int, sex: String, pro: String) = {
        this(name, age, sex)
        this.pro = pro
    }
}
