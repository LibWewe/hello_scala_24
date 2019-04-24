package scala_test

object HelloWord {
    def main(args: Array[String]): Unit = {
        println("hello word")
        println("hello " + args(0))

        val name = "LiLei"
        var age = 18
        println(s"姓名：$name  年龄：$age")
        age = 20


    }
}
