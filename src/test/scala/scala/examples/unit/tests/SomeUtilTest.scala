package scala.examples.unit.tests

import org.junit.Assert.assertEquals
import org.junit.Test

class SomeUtilTest {

  @Test
  def test1(): Unit = {

    val expected: Int = 10;
    val actual: Int = SomeUtil.divide(30,3);

    assertEquals(expected, actual);
  }

}
