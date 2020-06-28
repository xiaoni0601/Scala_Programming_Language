package day03.matchdemo

import scala.util.Random

object MatchType {
  def main(args: Array[String]): Unit = {
    val arr = Array("abcde", 100, 3.14, true, MatchType)

    val element = arr(Random.nextInt(arr.length))
    println(element)

    element match {
      case str: String => println(s"match String: $str")
      case int: Int => println(s"match Int: $int")
      case boolean: Boolean => println(s"match Boolean: $boolean")
      case matchTest: MatchTest => println(s"match MatchTest: $matchTest")
      case _: Any => println("not matched")
    }
  }

}

class MatchTest{

}