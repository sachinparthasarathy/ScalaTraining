import scala.collection.mutable.ArrayBuffer


//Generic queue of strings with 'put' and 'get' methods
trait Queue[A] {

  def put(elem: A)

  def get()
}

//Implementation using array
class ArrayQueue[A] extends  Queue[A]
{
  private val arr = ArrayBuffer[A]();

  def put(elem: A) =
  {
    arr :+ elem
  }

  def get() = {
    if(arr.nonEmpty)
      arr.drop(1)
  }
}



