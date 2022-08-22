import scala.annotation.tailrec
import scala.io.StdIn._


object Q1_isPrime extends App {
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

  print("Enter a number: ")
  var p=readInt()

  println(isPrime(p,2))

}