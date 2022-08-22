
import scala.io.StdIn._

object Q5_EvenSum extends App {
  def evenAdd(y:Int):Int={
    if(y%2==0){
      if(y==0)
        0
      else
        y+evenAdd(y-1)
    }
    else{
      evenAdd(y-1)
    }
  }
  print("Enter a number: ")
  var x=readInt()

  println(evenAdd(x))
}