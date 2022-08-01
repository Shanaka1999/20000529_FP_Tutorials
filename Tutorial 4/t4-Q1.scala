object Q_1 extends App{

  def interestCal(deposit:Double):Double = deposit match{
    case x if(x>0 && x<=20000) => x * 0.02
    case x if(x>20000 && x<=200000) => x * 0.04
    case x if(x>200000 && x<=2000000) => x * 0.035
    case x if(x>2000000) => x * 0.065
  }

  var deposit:Double = 0
  println("Enter Deposited Amount (Rs ) :  ");
  deposit= scala.io.StdIn.readDouble();

  println("Interest per year : Rs."+ interestCal(deposit));
}

