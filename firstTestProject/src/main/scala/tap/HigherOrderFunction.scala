package tap

import scala.annotation.tailrec

object HigherOrderFunction {
  def isEven(x: Int)= x % 2 == 0
  def isOdd(x: Int) = x % 2 != 0
  def square(x: Int) = x * x
  def cube(x: Int) = x * x * x


  def isPrime(x: Int): Boolean = {
    @tailrec
    def isPrimeAux(t: Int): Boolean = {
      t == 1 || t > 1 && x%t != 0 && isPrimeAux(t-1)
    }

    isPrimeAux(x/2)
  }


  def hof(f: Int => Boolean, m: Int => Int, xs: List[Int]): List[Int] = {
    xs.filter(f).map(m)
  }

  def multiply(a:Int)(b:Int):Int = a * b

  def multiply_by_2 = multiply(2)_

  def multiply_by_3 = multiply(3)_
}
