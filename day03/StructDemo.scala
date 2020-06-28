package day03

/**
 *主构造器的参数列表要放到类名的后面，和类名放在一起
 *val修饰的构造参数具有不可变性，var修饰的构造参数具有可变性
 *此时声明的faceValue: Int只能在本类中调用，伴生对象也无法调用
 *faceValues虽然没有用val或者var修饰，默认是val，不可变性
 * @param name
 * @param age
 * @param faceValue
 */


class StructDemo(val name: String, var age: Int, faceValue: Int = 90) {

  var gender: String = _
  def getFaceValue(): Int = {
    faceValue
  }

  def this(name: String, age: Int, faceValue: Int, gender: String) {
    this(name, age, faceValue)
    this.gender = gender
  }
}

object StructDemo {
  def main(args: Array[String]): Unit = {
    val s = new StructDemo("ningning", 26, 98)
    s.age = 27


    println(s.name)
    println(s.age)
    println(s.getFaceValue())
  }

}
