plugins {
    id("java")
    //to achieve my project
    id("application")
    id("com.gradleup.shadow") version "9.2.2"


}


group = "com.swapi"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    //dependencies that came with the build.
    testImplementation(platform("org.junit:junit-bom:6.0.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    //dependencies I added.
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.22.2")



}


tasks.test {
    useJUnitPlatform()
}
application {
    mainClass.set("Main")
}