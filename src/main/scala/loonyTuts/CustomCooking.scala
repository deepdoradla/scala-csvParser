package loonyTuts

/**
  * Created by deepdoradla on 13/10/2017.
  */
/*
Abstract Class vs Traits
Abstract class is used when a base class is required and the base class has to initialise the parameters via constructor. In short Abstract class can have constructors
Traits on the other hand cannot have constructors.
 */
class CustomCooking extends CookingMethods{

  override def addSalt(quant: Int, x: Boolean): Unit = {

    println(s"I am in salt method and I will add $quant amount of salt")

  }

  override def addChilli(quant: Int, x: Boolean): Unit = ???

  def addWater(quant: String): Unit ={

    println(s"I am in addWater String method and I got $quant")
  }
}

class CustomCookingWithTraits {

}

object executeCustomCooking extends App{

  override
  def main(args: Array[String]) {
    val customCooking = new CustomCooking

    customCooking.addSalt(2,true)
    customCooking.addWater("lol")
    customCooking.addWater(3,false)

  }
}
