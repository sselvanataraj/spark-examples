package scala.examples.unit.tests

import org.scalatest.FlatSpec

class SomeUtilSpec extends FlatSpec {

  behavior of "division of two numbers"

  it should "match" in {
    assert(10==SomeUtil.divide(30,3));
  }

  it should "not match" in {
   assertResult(8){
     SomeUtil.divide(30,3)
   }
  }

  //@Ignore
  it should "throw exception" in {
    val str ="hi"
    assertThrows[IndexOutOfBoundsException]  {
      str.charAt(-1);
    }
  }

  it should "should cancel the testcase" in {
     "test cancelled running too long"
  }
}
