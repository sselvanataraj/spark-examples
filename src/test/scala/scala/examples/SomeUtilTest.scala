package scala.examples

import org.junit.Test
import org.junit.Assert.assertEquals

class SomeUtilTest {

  @Test
  def test1(): Unit = {

    val expected: Int = 10;
    val actual: Int = SomeUtil.divide(30,3);

    assertEquals(expected, actual);
  }

}
