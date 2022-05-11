name := "dfdl-training-lab6"

organization := "owl"

version := "0.0.1"

crossPaths := false

ThisBuild / testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")

ThisBuild / libraryDependencies := Seq(
  "junit" % "junit" % "4.13.2" % "it,test",
  "com.github.sbt" % "junit-interface" % "0.13.3" % "it,test",
  "org.apache.daffodil" %% "daffodil-tdml-processor" % "3.3.0" % "test",
  "org.apache.logging.log4j" % "log4j-core" % "2.17.2"
)

//
// Enforce only specific Java versions.
//

// Compatible version sets include:
// Java 8, 11, 17, Scala 2.12.15 (and above), Daffodil 3.1.0 (and above)
scalaVersion := "2.12.15" // required for Java 17.
val javaVersions = Seq("8", "11", "17")

// sbt will not start if the current java version is not in the javaVersions list.
initialize := {
  val _ = initialize.value // run the previous initialization
  val required = javaVersions
  val current  = sys.props("java.specification.version")
  assert(required.contains(current), s"Unsupported JDK: java.specification.version $current is not in $required")
}

//
// Use flatter simple folder structure.
//
// src directory contains all source files (they are distinguished by file types)
// test directory contains all test files.
//
lazy val root = (project in file("."))
  .settings(
    Project.inConfig(Compile)(flattenSettings("src")),
    Project.inConfig(Test)(flattenSettings("test")),
  )

def flattenSettings(name: String) = Seq(
  unmanagedSourceDirectories := Seq(baseDirectory.value / name),
  unmanagedResourceDirectories := unmanagedSourceDirectories.value,
  unmanagedSources / includeFilter := "*.java" | "*.scala",
  unmanagedResources / excludeFilter := (unmanagedSources / includeFilter).value,
)
