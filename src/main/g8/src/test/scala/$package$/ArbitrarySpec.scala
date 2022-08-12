package $package$

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class ArbitrarySpec extends AnyWordSpec with Matchers {

  "Arbitrary spec" should {
    "pass" in {
      1 shouldEqual 1
    }
  }
}
