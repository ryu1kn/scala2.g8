package example

import org.scalatest._

class MainSpec extends FlatSpec with Matchers {

  it should "pass" in {
    1 shouldEqual 1
  }

}
