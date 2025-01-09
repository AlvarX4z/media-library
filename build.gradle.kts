plugins {
    id("com.ncorti.ktfmt.gradle") version "0.21.0"
    id("java-test-fixtures")
    id("io.spring.dependency-management") version "1.1.7"
    id("org.springframework.boot") version "3.4.1"

    kotlin("jvm") version "2.1.0"
    kotlin("plugin.jpa") version "2.1.0"
    kotlin("plugin.spring") version "2.1.0"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.h2database:h2:2.3.232")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")

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
