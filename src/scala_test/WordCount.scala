package scala_test

object WordCount {
    def main(args: Array[String]): Unit = {
        val arr: Array[String] = Array("hello word hello scala hello java", "hello c hello python")

//        val r1 = arr.flatMap((x: String) => x.split(" "))
//                .groupBy(x => x)
//                .mapValues((x) => x.length)
//                .toList.sortBy(x => x._2)

        val r1 = arr.flatMap(_.split(" "))
                        .groupBy(x => x)
                        .mapValues(_.length)
                        .toList.sortBy(- _._2)
//                        .foreach(println)
        println(r1)
    }
}
