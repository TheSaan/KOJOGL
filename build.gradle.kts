import jdk.nashorn.internal.objects.NativeRegExp.compile
import org.gradle.kotlin.dsl.precompile.PrecompiledProjectScript.NullPluginDependencySpec.version

buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
        /*
        flatDir {
                dirs("libs")
        }
         */
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31")
        classpath("com.android.tools.build:gradle:4.1.2")
        classpath("org.jogamp.gluegen:gluegen-rt:2.3.1")
        classpath( "org.jogamp.jogl:jogl-all:2.3.1")
    }
}

group = "com.thesaan.kotlin.jogl"
version = "1.0"

allprojects {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://maven.pkg.jetbrains.space/public/p/compose/dev") }
    }

}