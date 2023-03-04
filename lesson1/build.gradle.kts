plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    // Use JUnit Jupiter for testing.
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")

    // This dependency is used by the application.
    implementation("com.google.guava:guava:30.1.1-jre")
}

//application {
//    // Define the main class for the application.
//    mainClass.set("ru.shvets.App")
//}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}
