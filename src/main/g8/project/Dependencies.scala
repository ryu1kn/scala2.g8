import sbt._

object Dependencies {
  lazy val scalaTest = maven(org.scalatest, scalatest_2.12, stable)
}
