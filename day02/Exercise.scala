package day02

object Exercise {
  def main(args: Array[String]): Unit = {


    //create list
    val list0 = List(2, 7, 9, 1, 3, 4, 8, 6, 5, 0)
    val list1 = list0.map(_ * 2)
    val list2 = list0.filter(_ % 2 == 0)
    val list3 = list0.sorted
    val list4 = list0.reverse

    val it = list0.grouped(4)
    val list5 = it.toList
    val list6 = list5.flatten


    val lines = List("hello scala hello java", "hello java", "hello python")
//    val words = lines.map(_.split(" "))
//    val flatWords = words.flatten
    val flatWords = lines.flatMap(_.split(" "))

    val arr = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    arr.par.sum = (arr).sum
    val res = (arr).sum
    val res2 = (arr).reduce(_+_)
    val res3 = (arr).fold(10)(_-_)



    val list7 = List(List(1, 2, 3), List(3, 4, 5), List(0))
    val res4 = list7.flatten.reduce(_+_)
    val res5 = list7.aggregate(0)(_+_.sum, _+_)

    val l1 = List(5, 6, 7, 8)
    val l2 = List(1, 2, 3, 4)
    val l12 = l1 union(l2)
    val l121 = l1 intersect(l2)
    val l122 = l1 diff(l2)



    println(list0)
    println(list1)
    println(list2)
    println(list3)
    println(list4)
    println(it.toBuffer)
    println(list5)
    println(list6)
    println(flatWords)
    println(res)
    println(res2)
    println(res3)
    println(res4)
    println(res5)
    println(l12)
    println(l121)
    println(l122)

  }

}
