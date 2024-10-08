plugins {
    id("com.ncorti.ktfmt.gradle") version "0.20.1"
    id("java-test-fixtures")
    id("io.spring.dependency-management") version "1.1.6"
    id("org.springframework.boot") version "3.3.4"

    kotlin("jvm") version "2.0.20"
    kotlin("plugin.spring") version "2.0.20"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.jetbrains.kotlin:kotlin-reflect")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

group = "alvarx4z"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}

ktfmt {
    googleStyle()
}

tasks.withType<Test> {
    useJUnitPlatform()
}
