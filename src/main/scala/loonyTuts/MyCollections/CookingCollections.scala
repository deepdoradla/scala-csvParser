package loonyTuts.MyCollections

/**
  * Created by deepdoradla on 16/10/2017.
  */
object CookingCollections extends App{

  //Indexed Seqs
  //val indexedSeq = IndexedSeq("Hello","Cool")
  //IndexedSeq is a collection of indexed values that can be accessed randomly with the index value
  val v = IndexedSeq(3,4).map(_ * 2).map(x => println(x))


  //LinearSeq is a collection of sequence of values that are linked with each other. This is used when linearly accessing the values is required
  val linear = List(5,3,2,1).map(_*3).map(x => println(x))

  //Map
  val mapVals = Map(1 -> "Cool", 3 -> "Lol")
  println(mapVals(3))

}
