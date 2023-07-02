object Q3 {
  def main(args : Array[String]) : Unit={
    print("Enter the input string1 : ")
    val input1 = scala.io.StdIn.readLine()
    val result1=toUpper(input1)
    println(result1)
    println("")
    print("Enter the input string2 : ")
    val input2 = scala.io.StdIn.readLine()
    val result2 = toLower(input2)
    println(result2)
    println("")
    val input3 = scala.io.StdIn.readLine()
    val result3 = toLower(input3)
    println(result3)
    println("")

  }
  def toUpper(str : String) : String={
    val upper=str.toUpperCase()
    return upper
  }

  def toLower(str : String) : String={
    val lower=str.toLowerCase()
    return lower
  }

  /*def formatNames(name: String)(formatFunc: String => String): String = {
    formatFunc(name)
  }

  def formatFunc(name : String) : String ={
    val editedName = name.capitalize

  }*/


}
