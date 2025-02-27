scalaVersion := "2.13.8"

lazy val commonSettings = Seq(
  organization := "com.thejipppp.example.metals",
  version := "1.0.0",
  crossPaths := false,
  compileOrder := CompileOrder.JavaThenScala, // allow constants to be safely defined in java
  Compile / doc / sources := Seq.empty // disable doc compile (solves same line problem as above)
)

lazy val modB = ProjectRef(file("../side-project"), "modB")

lazy val sub = project
  .in(file("subproject"))
  .settings(commonSettings)
  .dependsOn(modB)

lazy val main = project
  .in(file("mainproject"))
  .dependsOn(sub)
  .settings(commonSettings)
