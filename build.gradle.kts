plugins {
    id("org.jetbrains.kotlin.multiplatform").version("1.6.10")
}

repositories {
    mavenCentral()
}
kotlin {
    iosSimulatorArm64()

    sourceSets {
        val commonMain by getting {
            dependencies {
                api("com.squareup.okio:okio:3.0.0")
            }
        }
    }
}

