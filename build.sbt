name := "Knolkart-scala-test"

version := "0.1"

scalaVersion := "2.12.4"

lazy val commonSettings = Seq(
  name := "Knolkart-scala-test",

  version := "0.1",

  scalaVersion := "2.12.4" ,

  libraryDependencies += "log4j" % "log4j" % "1.2.17",
  libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.4" % Test,

)

lazy val account = (project in file("account")).settings(commonSettings).dependsOn(model)
lazy val apiResources = (project in file("apiresources")).settings(commonSettings).dependsOn(account, inventory, notification,
  checkout)
lazy val checkout = (project in file("checkout")).settings(commonSettings)
lazy val dashboard = (project in file("dashboard")).settings(commonSettings).dependsOn(apiResources)
lazy val notification = (project in file("notification")).settings(commonSettings)
lazy val inventory = (project in file("inventory")).settings(commonSettings).dependsOn(model)
lazy val model = project in file("model")


lazy val root = (project in file(".")).
  aggregate(account, apiResources, checkout, dashboard, notification, inventory, model)