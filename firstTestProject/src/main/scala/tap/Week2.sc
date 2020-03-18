import tap.HigherOrderFunction.{cube, hof, isEven, isOdd, isPrime, multiply, multiply_by_2, multiply_by_3}
import tap.FunSets._
import tap.HigherOrderFunction._

val s1 = singletonSet(5)
print(s1)
val s = map(s1, x => x*2)



print(s)

