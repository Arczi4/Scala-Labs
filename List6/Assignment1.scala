package List6

object Assignment1 {
  def main(args: Array[String]): Unit ={
    val range = 2 to 100
    val first = for (i <- range if i%2 !=0; if i%3 != 0; if i%5 != 0) yield (i * i)
    val second = for (i <- range if i%2 !=0; j <- range if j%2==0) yield(i, j)

    val firstWithoutLoops = range.filter(x => x%2 != 0).filter(x => x%3 != 0).filter(x => x%5 != 0).map(x => x*x)
    val secondWithoutLoops = range.filter(i => i%2 != 0).map(i => range.filter(j => j%2==0).map(j => (i,j))).flatten
    println(first == firstWithoutLoops)
    println(second == secondWithoutLoops)


  }
}
