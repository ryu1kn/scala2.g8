package $package$

import org.scalatest._

class ArbitrarySpec extends WordSpec with Matchers {

  "Arbitrary spec" should {
    "pass" in {
      1 shouldEqual 1
    }
  }
}
