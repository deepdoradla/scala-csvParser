package simpleTestPackage

import java.lang.Integer

import org.scalatest._
import simplePackage._

/**
  * Created by deepdoradla on 23/09/2017.
  */
class HelloWorldTest extends FlatSpec with Matchers {

  /* Funsuite style
  test("Test for Number"){

    val value = HelloWorld.getVal();

    value should be(3)
  }*/

  //Flat spec style

  /*"The getValInt method" should "return 2" in {
    val value = HelloWorld.getValInt(2)

    value should startWith regex """(\d)"""
  }
*/
  "The getValStr method" should "return Hello" in {
    val  value = HelloWorld.getValStr("hello")

    //value should be("Hello".toLowerCase)

    value should startWith regex """(\w)"""
  }
}
