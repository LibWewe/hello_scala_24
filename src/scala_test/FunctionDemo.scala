package scala_test


object FunctionDemo {
    /**
      * 普通方法
      *
      * @param a 参数a
      * @param b 参数b
      * @return
      */
    def add(a: Int, b: Int): Int = {
        a + b
    }

    /**
      * 将函数作为参数传入的方法
      *
      * @param f 参数f，将要传入的方法或者函数
      * @param a 参数a
      * @param b 参数b
      * @return
      */
    def add2(f: (Int, Int) => Int, a: Int, b: Int): Int = {
        f(a, b)
    }

    def add3(f: (Int) => Int, a: Int, b: Int): Int = {
        f(a) + b
    }

    /**
      * 定义可变参数的方法
      * @param ints 可变参数
      * @return
      */
    def add4(ints: Int*): Int = {
        var sum = 0
        for (v <- ints) {
            sum += v
        }
        sum
    }

    def method_test: ((Int) => Int, Int, Int) => Int = (f, a, b) => {
        a + b + f(a)
    }

    val f1 = (a: Int, b: Int) => {
        a + b
    }
    val f2: (Int) => Int = (x) => {
        x * 10
    }
    val f3: (String) => Unit = (s) => {
        println(s)
    }


    def main(args: Array[String]): Unit = {
        var r1 = add(6, 8 + 8)
        println(r1)
        r1 = add2(add, 6, 8 + 9)
        println(r1)
        r1 = f1(33, 44)
        println(r1)
        r1 = f2(22)
        println(r1)
        r1 = add2(f1, 2, 4)
        println(r1)
        r1 = add3(f2, 2, 6)
        println(r1)
        f3("hello word")
        r1 = method_test(f2, 12, 38)
        println(r1)
    }
}

