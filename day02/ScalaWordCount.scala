package day02

object ScalaWordCount {
  def main(args: Array[String]): Unit = {
    val lines = List("hello java hello python", "hello scala", "hello scala hello java hello scala")

    val words = lines.flatMap(_.split(" "))
    val tuples = words.map((_, 1))
    val grouped = tuples.groupBy(_._1)
    val sums = grouped.mapValues(_.size)
    val sorted = sums.toList.sortBy(_._2)
    val res = sorted.reverse

    println(tuples)
    println(grouped)
    println(res)

  }

}
