package day03

/**
 *与类名相同，并且用object修饰的对象叫做伴生对象
 *类和其伴生对象之间可以互相访问私有的方法和属性
 */
class Dog {
  private var name = "二哈"
  def printName():Unit = {
    println(Dog.CONSTANT + name)
  }

}

/**
 * 伴生对象
 */
object Dog {
  private val CONSTANT = "汪汪汪:"

  def main(args: Array[String]): Unit = {
    val p = new Dog

    println(p.name)
    p.name = "大黄"

    p.printName()
  }
}