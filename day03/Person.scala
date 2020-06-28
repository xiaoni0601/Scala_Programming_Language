package day03

class Person {
  val id: String = "100"
  var name: String = _
  private var age: Int = _
  private[this] var gender = "male"

}

object Person {
  def main(args: Array[String]): Unit = {
    val p = new Person
    p.name = "ningning"
    p.age = 26

    println(p.id)
    println(p.name)
    println(p.age)

  }

}

object Test1 {
  def main(args: Array[String]): Unit = {
    val p = new Person
    println(p.name)
    println(p.id)
  }

}
