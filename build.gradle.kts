plugins {
    id("com.android.library")
    kotlin("android")
    id("com.lagradost.cloudstream3.gradle")
}

cloudstream {
    setRepo("https://www.movy.sx/")
    authors = listOf("StreamDev Team")
}

android {
    namespace = "com.cloudstream.providers.movy"
    compileSdk = 34

    defaultConfig {
        minSdk = 21
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
        freeCompilerArgs += listOf("-Xopt-in=kotlin.RequiresOptIn")
    }
}

dependencies {
    implementation("com.github.recloudstream:cloudstream:pre-release")
    implementation("org.jsoup:jsoup:1.17.2")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.16.1")
    implementation("com.github.jarnold98.nicehttp:nicehttp:0.4.11")
    implementation("com.squareup.duktape:duktape-android:1.4.0")
    implementation("org.bouncycastle:bcprov-jdk15to18:1.77")
}
