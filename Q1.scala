object Q1 {
  def main(args: Array[String]) : Unit = {

    print("Enter the value you wish to deposit : ")
    val deposit = scala.io.StdIn.readInt()
    val interest = calculateInterest(deposit)
    println("Interest per year for your deposite is "+interest)

  }

  def calculateInterest(value: Int):Double ={
      if(value<20000)
        {
          return value*0.02
        }
      else if(value<200000)
        {
          return value*0.04
        }
      else  if(value<2000000)
        {
          return value*0.35
        }
      else
        {
          return value*0.65
        }
  }

}
