import scala.io.StdIn._
object Q3_Sum extends App {
  def add(a:Int):Int={
    if(a==0)
      0
    else
      a+add(a-1)
  }

  print("Enter a number: ")
  var b=readInt()

  println(add(b))
}