```scala
class MyClass[T](val value: T) {
  def this() = this(implicitly[DefaultValue[T]].defaultValue) //Use default value
}

trait DefaultValue[T] {
  def defaultValue: T
}

object DefaultValue {
  implicit object StringDefaultValue extends DefaultValue[String] {
    override def defaultValue: String = ""
  }

  implicit object IntDefaultValue extends DefaultValue[Int] {
    override def defaultValue: Int = 0
  }

  // Add other implicit DefaultValue instances as needed
}
```