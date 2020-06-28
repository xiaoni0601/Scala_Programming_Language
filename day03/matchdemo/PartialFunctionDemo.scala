package day03.matchdemo

/**
 * PartialFunction[A, B],其中A是参数类型，B是返回值类型
 * PartialFunction(偏函数)常用作输入模式匹配
 */
object PartialFunctionDemo {

  def m1: PartialFunction[String, Int] = {
    case "one" => {
      println("case 1")
      1
    }
    case "two" => {
      println("case 2")
      2
    }
  }

  //m1是进化版本，其等价原生写法
  def m2(num: String): Int = num match {
    case "one" => 1
    case "two" => 2
    case _ => 0
  }

  def main(args: Array[String]): Unit = {
    println(m1("one"))
    println(m2("two"))
  }
}
