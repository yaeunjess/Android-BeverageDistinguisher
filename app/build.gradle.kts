plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
}

android {
    namespace = "com.example.beveragedistinguisher"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.beveragedistinguisher"
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
    buildFeatures {
        mlModelBinding = true
    }

    // aaptOptions 추가
    /*aaptOptions {
        noCompress "tflite"
    }*/
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.tensorflow.lite.support)
    implementation(libs.tensorflow.lite.metadata)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // tensorflow lite 추가
    implementation("org.tensorflow:tensorflow-lite:+")

    // TensorFlow Lite 관련 라이브러리 명시적으로 추가
    implementation("org.tensorflow:tensorflow-lite:2.6.0")  // 최신 버전으로 업데이트
    implementation("org.tensorflow:tensorflow-lite-support:0.3.1")  // 지원 라이브러리 추가
    implementation("org.tensorflow:tensorflow-lite-metadata:0.3.1")  // 메타데이터 라이브러리 추가
}