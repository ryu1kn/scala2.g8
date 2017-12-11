lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "io.ryuichi",
      scalaVersion := "2.12.4"
    )),
    name := $name$
  )
