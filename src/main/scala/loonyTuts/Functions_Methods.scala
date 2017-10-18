package loonyTuts

/**
  * Created by deepdoradla on 16/10/2017.
  */
object Functions_Methods extends App{

  //Scala does not allow to store the method to the function value
  //Creating a function
  val getRectangleArea = (length:Double, breadth:Double) => {length * breadth}:Double

  println(getRectangleArea(2,3))

  def getCircleArea(r:Double) : Double = {
    2.15
  }

  case class Person(firstName:String, lastName:String)

  val person1 = Person("Deep","Doradla")
  val person2 = Person("Deep1","Doradla1")
  val person3 = Person("Deep2","Doradla2")
 // val person4 = Person("Vitthal","Srinivasan")



  person1 match {
    case Person("Deep","Doradla") => "Huh Matched"
    case x => x.firstName
  }

  println(person1.firstName)

  /*case class Person(firstName:String, lastName:String)

  val person1 = Person("Vitthal","Srinivasan")
  val person2 = Person("Janani","Ravi")

  person1.firstName

  person1 match {
    case Person("Vitthal","Srinivasan") => "Humpty-Dumpty"
    case x => x.firstName
  }

  println(person1.firstName)*/
}
