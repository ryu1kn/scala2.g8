lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "$package$",
      scalaVersion := "2.12.4"
    )),
    name := "$name;format="normalize"$"
  )
