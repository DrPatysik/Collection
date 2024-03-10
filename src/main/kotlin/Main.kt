fun main(args: Array<String>) {
 /*var array = ArrayOfList()
    array.add("Hello0")
    array.add("Help1")
    array.add("Super2")
    array.add("Go3")
    array.add("Go4")
    array.add("Go5")
    array.add("Go6")
    array.add("Go7")
    array.add("Go8")
    array.add("Hi9")
    array.add("Go10")
    array.add("End11")
 //println(array.getIndexValue(0))
 //println(array.getIndexValue(2))
 //println(array.getIndexValue(1))
 //println(array.getIndexValue(11))
 //println(array.size())
   // array.removeElement("Go4")

   //println(array.getIndexValue(11))
   //println(array.size())
   println(array.removeElement("End11"))
   println(array.removeElement("Go5"))
   //println( array.removeAtIndex(5) )
   println( array.getIndexValue(0) )
   println( array.getIndexValue(1) )
   println( array.getIndexValue(2) )
   println( array.getIndexValue(3) )
   println( array.getIndexValue(4) )
   println( array.getIndexValue(5) )
   println( array.getIndexValue(6) )
   println( array.getIndexValue(7) )
   println( array.getIndexValue(8) )
   println(array.size())*/

       ///задание с 3мя коллекциями, объединение 1го и второго в 3м

    val numbers = arrayListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val members = arrayListOf<String>(
        "Vova", "Eva",
        "Dima", "Elena",
        "Alena", "Polina",
        "Olga", "Tima",
        "Egor", "Kolya"  )
    val membersWithNumber = numbers.zip(members){number,member -> "$number - $member"}
    println(membersWithNumber)

    members.forEach { member -> print("$member, ") }


}