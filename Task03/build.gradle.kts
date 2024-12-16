// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    dependencies {
        implementation 'com.google.android.gms:play-services-location:21.0.1'
        implementation 'com.google.android.gms:play-services-maps:18.1.0'
    }
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
}