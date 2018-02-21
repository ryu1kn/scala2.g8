import Dependencies._

lazy val root = (project in file(".")).
  settings(
    name := "$name;format="normalize"$",
    inThisBuild(List(
      organization := "$package$",
      scalaVersion := "2.12.4"
    )),
    libraryDependencies ++= Seq(
      scalaTest % Test
    )
  )
