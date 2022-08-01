object Q_2 extends App {

  def PatternMatching(var1: Int) = var1 match {

    case zero if (var1 <= 0 )=>println("Negative/Zero")
    case even if var1 % 2 == 0 => println("even")
    case odd =>println("odd")
  }
  var num:Int=0
  print("Enter number: ")
  num = scala.io.StdIn.readInt()

  PatternMatching(num)
}