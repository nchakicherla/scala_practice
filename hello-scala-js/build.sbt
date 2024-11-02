// build.sbt
name := "HelloScalaJS"

version := "0.1.0"

scalaVersion := "3.2.2" // Use a compatible Scala 3 version

enablePlugins(ScalaJSPlugin)

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.3.0"