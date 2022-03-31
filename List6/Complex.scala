package List6

class Complex(re: Double, im: Double = 0) {
  val re1 = re
  val im1 = im
  override def toString = {
    if (im1 != 0){
      re1 + (if (im1 < 0 ) " - " + -im1 else " + " + im1 ) + " i"
    }else
      re1.toString
  }

  def +(c:Complex) = new Complex(re1 + c.re1, im1 + c.im1)

  def -(c:Complex) = new Complex(re1 - c.re1, im1 - c.im1)

  def *(c: Complex) = new Complex((re1 * c.re1 - im1 * c.im1), (re1 * c.im1 + im1 * c.re1))

  def conj(): Complex = new Complex(re1, -im1)

  def abs(): Double = (math.sqrt(re1 * re1 + im1 * im1))
}

