package day03.matchdemo

/**
 * 匹配数组，元组，集合
 */

object MatchList {
  def main(args: Array[String]): Unit = {

    //匹配数组
    val arr = Array(3, 2, 5, 7)

    arr match {
      case Array(4, a, b, c) => println(s"case1: $a, $b, $c")
      case Array(_, x, y) => println(s"case2: $x, $y")
      case Array(_, x, y, z) => println(s"case3: $x, $y, $z")
      case _ => println("not matched")

    }

    //匹配元组
    val tup = (2, 3, 4)

    tup match {
      case (2, a, b) => println(s"case1: $a, $b")
      case (_, x, y) => println(s"case2: $x, $y")
      case _ => println("not matched")
    }

    //匹配集合
    val list1 = List(0, 1, 2, 3)

    list1 match {
      case 0 :: Nil => println(s"case1: 0")
      case a :: b :: c :: d :: Nil => println(s"case2: $a, $b, $c, $d")
      case 0 :: a => println(s"case3: $a")
      case _ => println("not matched")
    }
  }
}
