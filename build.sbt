import Dependencies._

scalaVersion     := "2.11.7"
version          := "0.1"

lazy val root = (project in file("."))
  .settings(
    name := "akka-slick-rest",
    libraryDependencies ++= rootDeps
  )

// ???
// enablePlugins(DebianPlugin)
// maintainer in Linux := "SoftTelecom"
// packageDescription := "Scala Rest API Example"