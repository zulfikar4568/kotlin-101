plugins {
    kotlin("jvm") version "2.2.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}

tasks.jar.configure {
    manifest {
        attributes(mapOf("Main-Class" to "org.example.MainKt"))
    }
    configurations["compileClasspath"].forEach { file: File ->
        from(zipTree(file.absolutePath))
    }
    duplicatesStrategy = DuplicatesStrategy.INCLUDE
}