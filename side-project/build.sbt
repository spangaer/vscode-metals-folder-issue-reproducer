scalaVersion := "2.13.8"

lazy val commonSettings = Seq(
  organization := "com.thejipppp.example.metals",
  version := "1.0.0",
  crossPaths := false,
  compileOrder := CompileOrder.JavaThenScala, // allow constants to be safely defined in java
  Compile / doc / sources := Seq.empty // disable doc compile (solves same line problem as above)
)

lazy val modA = project
  .in(file("mod-a"))
  .settings(commonSettings)

lazy val modB = project
  .in(file("mod-b"))
  .dependsOn(modA)
  .settings(commonSettings)
