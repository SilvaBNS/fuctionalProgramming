object Q2 {
  def main (args : Array[String]) : Unit = {
    print("Enter the number : ")
    val input=scala.io.StdIn.readInt()
    val output=printOutput(input)
  }
  def printOutput(num: Int): Unit = {
    if (num<=0)
      {
        println("Negative/Zero is input")
      }
    else
      {
        if(num%2==0)
          {
            println("Even number is given")
          }
          else {
            println("Odd number is given")
          }

      }
  }
}
