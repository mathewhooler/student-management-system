plugins {
  id("java")
  id("org.jetbrains.kotlin.jvm")
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
  mavenCentral()
}

dependencies {
  implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")


  testImplementation("org.junit.jupiter:junit-jupiter-api:5.11.1")
  testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.11.1")
}
kotlin {
  jvmToolchain(8)
}

tasks.test {
  useJUnitPlatform()
}

