object Question_01 extends App{
  var radius:Float=5
  var Pi=3.14

  def areaDisk(radius:Float , Pi:Double):Double=Pi*radius*radius

  println("Area of Disk with Radius 5 = " + areaDisk(radius,Pi))
}