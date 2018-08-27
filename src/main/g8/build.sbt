
lazy val root = (project in file(".")).
  settings(
    name := "$name;format="normalize"$",
    inThisBuild(List(
      organization := "$package$",
      scalaVersion := "2.12.6"
    )),
    libraryDependencies ++= Seq(
      $scalatest_version$ % Test
    )
  )
