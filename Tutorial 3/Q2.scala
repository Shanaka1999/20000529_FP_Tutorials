object Question_02 extends App{

  var celTemp:Float=35

  def celToFahr(celTemp:Float):Double=(1.8*celTemp)+32

  println("35 C converted to F = " + celToFahr(celTemp))
}