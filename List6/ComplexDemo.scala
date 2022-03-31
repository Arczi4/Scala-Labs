package List6

import scala.Byte.MaxValue.+
import scala.concurrent.duration.Duration.Inf.+

object ComplexDemo {


  def main(args: Array[String]) = {
    val zA = new Complex(-6,1)
    val zB = new Complex(5, 1)
    val zC = new Complex(3.0)
    println("zC: " + zC)

    //    println(a.toString())
    println("a+b: " + (zA + zB))
    println("a-b: " + (zA - zB))
    println("a*b: " + (zA * zB))
    println("a * conj(a): " + (zA * zA.conj()))

    val res = (new Complex(5) * zA) + (new Complex(7) * zB)
    println("abs(5.0 * a + 7.0 * b): " + res.abs())
  }
}
