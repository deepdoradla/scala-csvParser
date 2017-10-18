package loonyTuts

/**
  * Created by deepdoradla on 13/10/2017.
  */
abstract class CookingMethods {

  def addSalt(quant: Int, x: Boolean)
  def addChilli(quant: Int, x: Boolean)

  def addWater(quant: Int, x: Boolean): Unit ={

    var default = 2
    println("I am in addWater")

    default = default*quant

    println(s"Amount of water to add is $default Liters")
  }
}

trait CookingSkeleton1 {

  def addMasala(quant: Int, x: Boolean)
  def addCurd(quant: Int, x: Boolean)

  def addWater(quant: Int, x: Boolean): Unit ={

    var default = 2
    println("I am in addWater")

    default = default*quant

    println(s"Amount of water to add is $default Liters")
  }
}

trait CookingSkeleton2 {
  def lightGas(quant: Int)
  def serveOnPlate(quant: Int)
}