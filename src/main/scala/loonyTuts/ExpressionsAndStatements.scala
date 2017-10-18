package loonyTuts

/**
  * Created by deepdoradla on 15/10/2017.
  * This has
  * Expression blocks
  * Match Expressions
  */
object ExpressionsAndStatements extends App{

  override
  def main(args: Array[String]) {

    //Area is an expression block. We can event print, add more variables inside the expression block
    val area = {
      val pi = 3.14
      println(pi)
      5+pi
    }

    println(area)

    //Nested scopes in Expression block


    //Match Expressions with Value Pattern Binding
    val dayOfWeek = "Sunday"
    val typeOfDay = dayOfWeek match{
      case "Monday" => "Return Monday matched"
      case "Tuesday" | "Wednesday" | "Thursday" | "Friday" => "Returns just another day" // These are or-ed expressions
      case someOtherDay => {
        println(s"Some other day and it is $someOtherDay")
        someOtherDay //This returns and assigns value to dayOfWeek
        }
      }
    println(dayOfWeek)

    //Match Expressions with WildCard _
    val dayOfWeek1 = "Sunday1"
    val typeOfDay1 = dayOfWeek1 match{
      case "Monday" => "Return Monday matched"
      case "Tuesday" | "Wednesday" | "Thursday" | "Friday" => "Returns just another day" // These are or-ed expressions
      case _ => { // _ means wildcard match. This will be executed if no other matches occur.
        println(s"Some other day and it is $dayOfWeek1")
      }
    }

    val radius:Any = "10"

    val typeOfRadius = radius match{
      case radius:Int => "Integer"
      case radius:String => "String"
      case radius:Double => "Double"
      case _ => "Any"
    }

    println(typeOfRadius)

  }

}
