package fileParsers

/**
  * Created by deepdoradla on 08/10/2017.
  */
object CsvParser extends App {

  override def main(args: Array[String]) {

    println("Hello")
    val bufferedSource = io.Source.fromFile("/Users/deepdoradla/local-store/datasets/deepfriends.csv")


    //Use drop for dropping n number of lines. Use it specially when you want to drop a header off the csv file
    for(line <- bufferedSource.getLines().drop(1)){
      println("Value inside line is")
      val cols = line.split(",").map(_.trim)

    }


  }



}
