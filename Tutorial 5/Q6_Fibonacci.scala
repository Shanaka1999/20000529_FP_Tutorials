import scala.io.StdIn._

object Q6_Fibonacci extends App{
  def fibonacci(a:Int):Int= a match{
    case a if a==0 =>0
    case a if a==1 =>1
    case a => fibonacci(a-1)+fibonacci(a-2)
  }

  def printFibonacci(b:Int):Any ={
    if(b>0) printFibonacci(b-1)
    println(fibonacci(b))
  }

  print("Enter a number: ")
  var p=readInt()

  printFibonacci(p)
}