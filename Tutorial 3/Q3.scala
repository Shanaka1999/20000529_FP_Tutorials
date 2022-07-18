object Question_03 extends App{
  var radius:Float=5
  var Pi=3.14

  def Volume(radius:Float , Pi:Double):Double=(4*Pi*radius*radius*radius)/3

  println("Volume of  a sphere with radius 5 = " + Volume(radius,Pi))
}