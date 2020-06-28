package day03

object ClassDemo {
  def main(args: Array[String]): Unit = {
    val human = new Human

    println(human.name)
    println(human.climb)
    println(human.fight)

  }
}

/**
 *
 * 特质
 */
trait Flyable{

  //声明一个没有赋值的字段(也可以赋值)
  val distance: Int

  //声明一个没有实现的方法
  def fight: String

  //声明一个实现的方法
  def fly: Unit = {
    println("I can fly")
  }
}

/**
 * 抽象类
 */
abstract class Animal {
  //声明一个没有赋值的字段
  val name: String

  //声明一个没有实现的方法
  def run(): String

  //声明一个有实现的方法
  def climb: String = {
    "I can climb"
  }
}

class Human extends Animal with Flyable {
  override val name: String = "zhang san"

  //重写来抽象类里面没有实现的方法
  override def run(): String = "I can run"

  //重写了抽象类中有实现的方法
  override def climb: String = "override climb"


  override val distance: Int = 1000
  // 实现了特质里面没有实现的方法，'override'关键字可以写，也可以不写
  override def fight: String = "with tools"
}

