

//Trait modified behavior to reverse String
trait ReverseQueue extends Queue[String]
{
  override def put(elem: String): Unit = super.put(elem.reverse)

}
