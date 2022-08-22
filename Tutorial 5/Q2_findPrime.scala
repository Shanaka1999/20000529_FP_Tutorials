import scala.annotation.tailrec
import scala.io.StdIn._
import scala.util.control.Breaks._


object Q2_findPrime extends App {
  @tailrec
  def gcd(a:Int,b:Int):Int=  b match{
    case 0=>a
    case b if b>a =>gcd(b,a)
    case _=>gcd(b,a%b)
  }

  @tailrec
  def isPrime(m:Int, n:Int):Boolean= n match{
    case x if m==x => true
    case x if gcd(m,x)>1 =>false
    case x =>isPrime(m,x+1)
  }

  @tailrec
  def printSeq(x:Int,y:Int){
    if(x==y){
      break
    }
    if(isPrime(y,2)){
      println(y)
    }
    printSeq(x,y+1)
  }

  print("Enter a number: ")
  var p=readInt()

  println(printSeq(p,2))


}