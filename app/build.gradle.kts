plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    //id("androidx.navigation.safeargs") //safeargs
}

android {
    namespace = "edu.sabanciuniv.it535.fragmenttransition"
    compileSdk = 34

    buildFeatures{
        viewBinding = true
    }

    defaultConfig {
        applicationId = "edu.sabanciuniv.it535.fragmenttransition"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // ViewModel
    //val lifecycle_version = "2.7.0"
    //implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
    //implementation("androidx.lifecycle:lifecycle-viewmodel-compose:$lifecycle_version")

    // Datastore
    //implementation("androidx.datastore:datastore-preferences:1.0.0")

    // LiveData
    //implementation("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")
}