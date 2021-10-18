plugins {
    kotlin("jvm") version "1.5.31"
    java
}

group = "me.aoyun"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    implementation("com.google.code.gson:gson:2.8.8")
    implementation("com.squareup.moshi:moshi:1.12.0")
    implementation("com.squareup.moshi:moshi-kotlin:1.12.0")

}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}