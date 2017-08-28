import org.gradle.kotlin.dsl.kotlin
import org.gradle.kotlin.dsl.version

plugins {
    kotlin("jvm", "1.1.4-2")
    id("org.jmailen.kotlinter") version "1.3.0"
    idea
}

repositories {
    jcenter()
}

dependencies {
    compile(kotlin("stdlib-jre8", "1.1.4-2"))
    testCompile("io.kotlintest:kotlintest:2.0.5")
}
