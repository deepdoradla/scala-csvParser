package csvprocessor

/**
  * Created by deepdoradla on 18/10/2017.
  */
trait SalesReader {
  def readSales(): Seq[Sale]
}

case class Sale(year:String, name:String, county:String, sex:String, count:Integer)