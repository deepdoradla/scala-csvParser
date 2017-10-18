package loonyTuts

/**
  * Created by deepdoradla on 12/10/2017.
  */


/*
Questions around Constructors
1. Can we do contructor overloading in Scala?
Yes Constructor overloading is possible by using this keyword
In Scala Constructor Overloading is called Auxilory Constructor. And the main constructor is called Primary Constructor
 */

/*
Points to Note
Any parameter going into Class or Method constructor is val (Immutable) by default
 */

class Point(val xc: Int, val yc: Int) {


  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int): Unit ={

    x = x + dx
    y = y + dy


    println(s"Point x location is $x")
    println(s"Point y location is $y")

  }

}



class Location(override val xc: Int, override val yc: Int, zc: Int) extends Point(xc, yc){
  var z: Int = zc

  def oneLineMethod() = {println("Printing one line method")}

  def move(dx: Int, dy: Int, dz: Int): Unit ={
    x = x + dx
    y = y + dy
    z = z + dz


    println(s"Extended location $x")
    println(s"Extended location $y")
    println(s"Extended location $z")

  }


}

object Demo extends App{
  override
  def main(args: Array[String]) {

    println("I am in main class")

    val point = new Location(2,3,5)
    point.move(8,7)
    point.move(8,7,5)
    point.move(5,5)

    val customCooking = new CustomCooking

    customCooking.addSalt(2,true)
    customCooking.addWater("lol")
    customCooking.addWater(3,false)
  }

}