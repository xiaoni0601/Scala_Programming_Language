package day03

/**
 * apply方法的通常称为注入方法，在伴生对象里做一些初始化的操作
 * apply方法的参数列表不需要和构造器的参数列表统一
 * unapply方法的通常称为提取方法， 使用unapply方法来提取固定数量的对象
 * unapply方法会返回一个序列(Option)，内部生产来一个Some对象来存放一些值
 * apply方法和unapplu方法会被隐士的调用
 * @param name
 * @param age
 * @param faceVaule
 */
class ApplyDemo(val name: String, var age: Int, var faceVaule: Int) {

}

object  ApplyDemo{
  def apply(name: String, age: Int, gender: Int,faceVaule: Int): ApplyDemo =
    new ApplyDemo(name, age, faceVaule)

  def unapply(applyDemo: ApplyDemo): Option[(String, Int, Int)] = {
    if (applyDemo == null) {
      None
    } else {
      Some(applyDemo.name, applyDemo.age, applyDemo.faceVaule)
    }
  }
}

object Test2{
  def main(args: Array[String]): Unit = {
    val applyDemo = ApplyDemo("jingjing", 24, 0, 90)
    applyDemo match {
      case ApplyDemo("jingjing", age, faceValue) => println(s"age: $age")
      case _ => println("No match nothing")
    }
  }
}