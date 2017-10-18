package loonyTuts

/**
  * Created by deepdoradla on 15/10/2017.
  * Do not use for loops to iterate over Collections. Use HighOrder functions in Scala like foreach, Map, FlatMap
  * While loops
  */
object ForLoopys extends App{

  override
  def main(args: Array[String]) {
    val daysOfWeekList = List("Mon","Tue","Wed","Thu","Fri","Sat","Sun")

    for(day <- daysOfWeekList)
    {
      day match {
        case "Mon" => println("Manic Monday")
        case otherDay => println(otherDay)
      }
    }

    //Adding yield returns a collection of values back to "x". Using keyword yield converts a forloop from statment to an expression because expression has return values and yield returns a value
    val x = for(day <- daysOfWeekList) yield
      {
        day match {
          case "Mon" => "Manic Monday"
          case _ => day
        }
      }

    for(day <- daysOfWeekList) {
      println(day)
    }

    for(i <- 0 until daysOfWeekList.size) {
      println(daysOfWeekList(i))
    }


    for(i <- 0 to daysOfWeekList.size - 1) {
      println(daysOfWeekList(i))
    }


    val y = for(day <- daysOfWeekList) yield
    {
      day match {
        case "Mon" => "Manic Monday"
        case otherDay => otherDay
      }
    }

    //For loops with Pattern guards. Here there is a value binding variable called "day". And this value binding variable is used in if condition within forloop itself
    for(day <- daysOfWeekList if day == "Manic Monday") {
      println(day)
    }

    /*
      Nested For loops
     */
    for{i <- 0 until 7
        j <- 0 to 10}
    {
      println(s"$i,$j")
    }

    for{i <- 0 until 7
        j <- daysOfWeekList}
    {
      println(s"$i,$j")
    }

  }

}
