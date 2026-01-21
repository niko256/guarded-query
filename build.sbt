val scala3Version = "3.7.4"

lazy val root = project
  .in(file("."))
  .settings(
    name := "guarded-query",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq(
      "org.scalameta" %% "munit" % "1.0.0" % Test,
      "org.scalacheck" %% "scalacheck" % "1.19.0" % Test,
      "org.scalameta" %% "munit-scalacheck" % "1.0.0" % Test
    )
  )
