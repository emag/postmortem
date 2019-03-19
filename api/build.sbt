import Dependencies._

inThisBuild(
  Seq(
    organization := "postmortem",
    name := "postmortem-api",
    version := "0.0.1",
    scalaVersion := "2.12.8",
    scalacOptions ++= ScalacOptions.enabled,
    scalacOptions in (Compile, console) --= ScalacOptions.disabledInRepl,
    libraryDependencies ++= Seq(
      ScalaTest.scalatest % Test
    )
  )
)

lazy val command = project

lazy val commandDomain = project in file("command/domain")
