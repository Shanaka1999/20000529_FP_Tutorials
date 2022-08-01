object Q3 {

  def toUpper(str:String):String= str.toUpperCase()
  def toLower(str :String): String= str.toLowerCase()

  def formatNames(name: String)(idxList: Int*)(func: String => String): String={
    if(idxList.isEmpty){
      return func(name)
    }
    var temp1 =""
    var i=0

    while(i<name.length){
      if(idxList.contains(i)) temp1= temp1 + func(name.charAt(i).toString)
      else temp1=temp1+name.charAt(i).toString
      i=i+1
    }
    temp1
  }

  def main(args: Array[String]): Unit = {
    println(formatNames("Benny")()(toUpper))
    println(formatNames("Niroshan")(0,1)(toUpper))
    println(formatNames("Saman")()(toLower))
    println(formatNames("Kumara")(5)(toUpper))
  }
}