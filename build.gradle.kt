plugins {
    java
    application
}

repositories {
    jcenter()
}

dependencies {
    compile (
            'com.google.guava:guava:26.0-jre'
    )
    testCompile (
            'junit:junit:4.12'
    )
}