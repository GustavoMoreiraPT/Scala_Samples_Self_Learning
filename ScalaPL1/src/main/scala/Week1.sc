import scala.annotation.tailrec

def lessThan(x: Int, y: Double): Boolean = x < y

lessThan(5,7)
lessThan(5,5)
lessThan(5,4)
lessThan(-1, -3)
lessThan(-5, -4)

def and(x: Boolean, y: Boolean): Boolean = {
  if(x == true)y else false
}
def or(x: Boolean, y: Boolean): Boolean = {
  if(x == false) y else x
}

and(true, true)
and(true, false)
and(false, true)
and(false, false)

assert(and(true, true)==true)
assert(and(true, false)==false)
assert(and(false, true)==false)
assert(and(false, false)==false)
assert(or(false, false)==false)
assert(or(true, true)==true)
assert(or(true, false)==true)
assert(or(false, true)==true)

def fatorial(x: BigInt): BigInt = {

  @tailrec
  def fatorial_acum(x: BigInt, Acum: BigInt): BigInt =
  {
    if(x <= 1) Acum else fatorial_acum(x - 1, x * Acum)
  }

  fatorial_acum(x, 1)
}

fatorial(12345)


def sumDown(x: Int, sum: Int) : Int =
  if(x == 0) sum else x + sumDown(x-1, sum)

sumDown(5, 0)
assert(sumDown(5,0) == 15)

@tailrec
def nSymbol(i: Int, c: Char, s: String) : String= {
  if(i == 0) s else nSymbol(i-1, c, c+s)
}

assert(nSymbol(5,'*',"") == "*****")


def mult(x: Int, y: Int): Int = {
  if(x == 0 || y == 0) 0
  else if (x == 1) y
  else if(x < 0) -y - mult(x + 1, -y)
  else y + mult(x -1, y)
}

mult(3, -4)


assert(mult(4,3) == 12)
assert(mult(0,0) == 0)
assert(mult(0,1) == 0)
assert(mult(1,0) == 0)
assert(mult(-3,-3) == 9)
assert(mult(-3,4) == -12)
assert(mult(3, -4) == -12)

@tailrec
def gcd(a: Int, b: Int) : Int = {
  if(b == 0)
    a
  else if(b > a)
    gcd(b, a)
  else
    gcd(b, a % b)
}

assert(gcd(15, 25) == 5)

assert(gcd(16, 28) == 4)

assert(gcd(0, 25) == 25)

assert(gcd(206, 40) == 2)


