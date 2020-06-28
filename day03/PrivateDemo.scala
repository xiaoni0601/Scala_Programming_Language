package day03

private [day03] class PrivateDemo private (val gender: Int, var faceValue: Int) {

  private val name = "jingjing"

  private [this] var age = 24

  private def sayHello(): Unit = {
  println(s"jingjing's age is $age")
  }
}

object PrivateDemo {
  def main(args: Array[String]): Unit = {
    val privateDemo = new PrivateDemo(0, 90)
    privateDemo.sayHello()
  }
}

