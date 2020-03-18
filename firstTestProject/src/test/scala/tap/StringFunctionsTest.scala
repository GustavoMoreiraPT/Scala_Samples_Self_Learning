package tap
import org.scalatest.FunSuite

class StringFunctionsTest extends FunSuite {
  test("removeDigits on a blank string should result in a blank string") {
    assert(StringFunctions.removeDigits("")==="")
  }

  test("removeDigits on abc95def0ghi should result in abcdefghi ") {
    assert(StringFunctions.removeDigits("abc95def0ghi")==="abcdefghi")
  }
  test("removeDigits on a null should throw an exception") {
    val e = intercept[NullPointerException] {
      StringFunctions.removeDigits(null)
    }
    assert(e != null)
  }
}
