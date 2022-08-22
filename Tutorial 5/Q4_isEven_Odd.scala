object Q4_isEven_Odd extends App {
  def isEven(y:Int):Boolean = y match{
    case 0 => true
    case _  => isOdd(y-1)
  }

  def isOdd(x:Int):Boolean = !isEven(x)

  println(isEven(8))
  println(isOdd(5))
  println(isEven(7))
  println(isOdd(10))

}
