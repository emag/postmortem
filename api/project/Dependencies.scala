import sbt._

object Dependencies {

  object Versions {
    val scalaTest = "3.0.6"
  }

  object ScalaTest {
    val scalatest = "org.scalatest" %% "scalatest" % Versions.scalaTest
  }

}
