package tap
import org.scalatest.FunSuite
import HigherOrderFunction._


class HigherOrderFunctionTest extends FunSuite {
  test("testIsPrime") {
    val l = (1 to 30).filter(isPrime(_))
    assert( l === List(2, 3, 5, 7, 11, 13, 17, 19, 23, 29))
  }
  test("testHof") {
    val l = (1 to 5).toList
    assert( hof( isEven, square, l ) === List(4, 16) )
    assert( hof( isOdd, cube, l ) === List(1, 27, 125) )
    assert( hof(isPrime, square, l ) === List(4, 9, 25) )
  }
  test("isEven") {
    assert(( 1 to 15 ).filter( isEven ) === List(2, 4, 6, 8, 10, 12, 14))
  }
  test("isOdd") {
    assert(( 1 to 15 ).filter( isOdd ) === List(1, 3, 5, 7, 9, 11, 13, 15))
  }
  test("square") {
    assert(( 1 to 6 ).map( square ) === List( 1, 4, 9, 16, 25, 36))
  }

  test("isOddAnonymous") {
    assert(( 1 to 15 ).filter(a => a%2 != 0) === List(1, 3, 5, 7, 9, 11, 13, 15))
  }
  test("squareAnonymous") {
    assert(( 1 to 6 ).map(a => a*a) === List( 1, 4, 9, 16, 25, 36))
  }

  test("multiplyBy2"){
    assert(multiply_by_2(5) === 10)
  }

  test("multiplyBy3"){
    assert(multiply_by_3(5) == 15)
  }
}
