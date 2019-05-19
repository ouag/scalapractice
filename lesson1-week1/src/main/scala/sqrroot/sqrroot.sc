import scala.annotation.tailrec


//def sqrtIter(guess:Double, x:Double): Double =
//  if (isGoodEnough(guess, x)) guess else sqrtIter(improve(guess, x), x)
@tailrec
def fact(n:Int, r:Int):Int =
  if (n == 0) r
  else {
    println(r)
    val acc = n * r;
    fact(n-1, acc)
  }

@tailrec
def facto(n:Int):Int = {
  if (n == 0) acc
  else {
    loop()
  }
  def loop(x:Int, r:Int):Int = 
}

fact(4,1)
fact(654654,1)









