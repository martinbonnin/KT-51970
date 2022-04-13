plugins {
    id("org.jetbrains.kotlin.multiplatform").version("1.6.20")
}

repositories {
    mavenCentral()
}
kotlin {
    // Add jvm() here to fix the issue
    // jvm()
    iosSimulatorArm64()

    sourceSets {
        val commonMain by getting {
            dependencies {
                api("com.squareup.okio:okio:3.0.0")
            }
        }
    }
}

