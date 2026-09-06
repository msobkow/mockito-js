plugins {
    // doc: https://docs.gradle.org/current/userguide/kotlin_dsl.html
    `kotlin-dsl`
}

dependencies {
    implementation(server.markhome.mcf.v3_1.libs.gradleplugin.testLogger)
    implementation(server.markhome.mcf.v3_1.libs.gradleplugin.animalSniffer)
    implementation(server.markhome.mcf.v3_1.libs.gradleplugin.bnd)
    implementation(server.markhome.mcf.v3_1.libs.gradleplugin.errorprone)
    implementation(server.markhome.mcf.v3_1.libs.gradleplugin.spotless)
    implementation(server.markhome.mcf.v3_1.libs.gradleplugin.spotless.googleJavaFormat)
    implementation(server.markhome.mcf.v3_1.libs.gradleplugin.license)
    <!--implementation(libs.gradleplugin.testLogger)-->
    <!--implementation(libs.gradleplugin.animalSniffer)-->
    <!--implementation(libs.gradleplugin.bnd)-->
    <!--implementation(libs.gradleplugin.errorprone)-->
    <!--implementation(libs.gradleplugin.spotless)-->
    <!--implementation(libs.gradleplugin.spotless.googleJavaFormat)-->
    <!--implementation(libs.gradleplugin.license)-->

    implementation(server.markhome.mcf.v3_1.libs.gradleplugin.android)
    implementation(server.markhome.mcf.v3_1.libs.gradleplugin.nexusPublish)
    implementation(server.markhome.mcf.v3_1.libs.gradleplugin.shipkit.changelog)
    implementation(server.markhome.mcf.v3_1.libs.gradleplugin.shipkit.autoVersion)

    <!--implementation(libs.gradleplugin.android)-->
    <!--implementation(libs.gradleplugin.nexusPublish)-->
    <!--implementation(libs.gradleplugin.shipkit.changelog)-->
    <!--implementation(libs.gradleplugin.shipkit.autoVersion)-->

    // https://github.com/gradle/gradle/issues/15383
    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
    <!--implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))-->
}
