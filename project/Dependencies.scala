import sbt.{ModuleID, _}

object Dependencies {
  lazy val ScalatestVersion = "2.2.4"
  lazy val SparkVersion = "2.3.0"
  lazy val GeoToolsVersion = "27.2"

  /*
  lazy val spatialSpark: Project = Project(
    "spatial-spark",
    file("."),
    settings = buildSettings ++ Seq(
      libraryDependencies <+= scalaVersion("org.scala-lang" % "scala-compiler" % _ % "provided"),
      libraryDependencies ++= Seq(jts, scalaTest, sparkTestingBase, spark, sparkSQL))
  )*/

  lazy val dependenies: Seq[ModuleID] = Seq(
    "org.geotools" % "gt-main" % GeoToolsVersion,
    "org.apache.spark" %% "spark-core" % SparkVersion % "provided",
    "org.apache.spark" %% "spark-sql" % SparkVersion % "provided",
    "org.scalatest" %% "scalatest" % ScalatestVersion % "test"
  )

}
