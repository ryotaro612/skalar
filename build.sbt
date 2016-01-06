lazy val root = (project in file(".")).
  settings(
    name := "skalar",

    organization := "com.ranceworks",

    version := "1.0",

    scalaVersion := "2.11.7",

    useGpg := true,

    publishMavenStyle := true,

    publishTo := {
      val nexus = "https://oss.sonatype.org/"
      if (isSnapshot.value)
        Some(Resolver.file("file",  new File(Path.userHome.absolutePath+"/.m2/repository")))
      else
        Some("releases"  at nexus + "service/local/staging/deploy/maven2")
    },

    sonatypeProfileName := "com.ranceworks",

    pomExtra := (
      <url>https://github.com/satokazuma/skalar</url>
        <licenses>
          <license>
            <name>The MIT License</name>
            <url>https://opensource.org/licenses/MIT</url>
            <distribution>repo</distribution>
          </license>
        </licenses>
        <scm>
          <url>https://github.com/satokazuma/skalar</url>
          <connection>https://github.com/satokazuma/skalar.git</connection>
        </scm>
        <developers>
          <developer>
            <id>satokazuma</id>
            <name>Sato Kazuma</name>
            <url>http://ranceworks.com</url>
          </developer>
        </developers>
      )
  )
