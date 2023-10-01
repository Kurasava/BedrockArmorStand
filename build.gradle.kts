import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
plugins {
    kotlin("jvm") version "1.9.0"
    id("java")
    id ("com.github.johnrengelman.shadow") version "8.1.1"
}

group = "ru.kurasava"
version = "1.2"

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/") {
        name = "papermc-repo"
    }
    maven("https://maven.enginehub.org/repo/") {
        name = "worldguard"
    }
    maven("https://oss.sonatype.org/content/groups/public/") {
        name = "sonatype"
    }
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.20.1-R0.1-SNAPSHOT")
    compileOnly("com.sk89q.worldguard:worldguard-bukkit:7.0.9")
}



val targetJavaVersion = 17
java {
    val javaVersion = JavaVersion.toVersion(targetJavaVersion)
    sourceCompatibility = javaVersion
    targetCompatibility = javaVersion
}

tasks.withType<JavaCompile>().configureEach {
    options.encoding = Charsets.UTF_8.name()
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = targetJavaVersion.toString()
    }
}

project.tasks.build {
    dependsOn(tasks.shadowJar)
}

tasks.processResources {
    filteringCharset = Charsets.UTF_8.name()
    val properties = inputs.properties.map {
        it.key to it.value
    }.toMap(hashMapOf()).apply { this["version"] = version }
    filesMatching("plugin.yml") { expand(properties) }
}