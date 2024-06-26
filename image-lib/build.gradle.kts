plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.kotlin.android)
    id("maven-publish")
}

android {
    namespace = "com.android.image_lib"
    compileSdk = 34

    defaultConfig {
        minSdk = 27

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
     implementation(platform(libs.androidx.compose.bom))
     implementation(libs.androidx.material3)
     debugImplementation(libs.androidx.ui.test.manifest)
}

afterEvaluate{
    publishing{
        publications{
            create<MavenPublication>("release") {
                from(components["release"])
                groupId = "com.github.viikii007" // Replace with your GitHub username
                artifactId = "composelibrary" // Replace with your library name
                version = "1.0" // Replace with your library version
            }
        }
    }
}

