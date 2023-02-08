val Organization = "me.simin"
val Version = "2.0"
val ScalaVersion = "2.11.8"
val ProjectName = "spatial-spark"

lazy val root: Project = (project in file("."))
  .settings(
    organization := Organization,
    name := ProjectName,
    version := Version,
    scalaVersion := ScalaVersion,
    publishConfiguration := publishConfiguration.value.withOverwrite(true),
    publishLocalConfiguration := publishLocalConfiguration.value.withOverwrite(true),
    isSnapshot := true,
    publishMavenStyle := true
  )

libraryDependencies ++= Dependencies.dependenies
resolvers ++= Seq(
  Resolver.mavenLocal
)
