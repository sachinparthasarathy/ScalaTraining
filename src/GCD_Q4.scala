import scala.annotation.tailrec

//GCD using tail recursion
@tailrec
def gcd(a: Int, b: Int): Int =
  if (b == 0) a else gcd(b, a % b)





