import org.gradle.api.tasks.testing.logging.TestExceptionFormat

plugins {
    kotlin("jvm") version "1.2.10"
    id("org.jmailen.kotlinter") version "1.6.0"
    idea
}

repositories {
    jcenter()
}

dependencies {
    compile(kotlin("stdlib-jre8"))
    testCompile("io.kotlintest:kotlintest:2.0.7")
}

tasks.withType<Test> {
    testLogging {
        exceptionFormat = TestExceptionFormat.FULL
    }
}
