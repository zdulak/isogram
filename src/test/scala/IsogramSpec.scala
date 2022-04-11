import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should
import org.scalatest.prop.TableDrivenPropertyChecks._

class IsogramSpec extends AnyFlatSpec with should.Matchers {
  behavior of "The isIsogram method"
  it should "return true for words which are isograms" in {
    val args = Table(
      "word",
      "lumberjacks",
      "background",
      "downstream",
      "six-year-old",
      "six year old"
      )

    forAll(args) {
      word => Isogram.isIsogram(word) shouldBe true
    }
  }

  it should "return false for words which are not isograms" in {
    val args = Table(
      "word",
      "isograms",
      "ala"
      )

    forAll(args) {
      word => Isogram.isIsogram(word) shouldBe false
    }
  }
}
