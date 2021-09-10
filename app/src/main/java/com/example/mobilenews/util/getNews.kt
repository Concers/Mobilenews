package com.example.mobilenews.util

import com.example.mobilenews.R


fun getDetailheaderTitle(): String {
    return "What's new in Kotlin 1.5.30\uFEFF\n"
}

fun getDetaildate() : String{
    return "Release date: 24 August 2021"
}

fun getDetailContext() : String{
    return """
              <string name="kotlin_15">""${'"'}

            "Kotlin 1.5.30 offers language updates including previews of future changes, various improvements in platform support and tooling, and new standard library functions.\n" +
                    "\n" +
                    "Here are some major improvements:\n" +
                    "\n" +
                    "Language features, including experimental sealed when statements, changes in using opt-in requirement, and others\n" +
                    "\n" +
                    "Native support for Apple silicon\n" +
                    "\n" +
                    "Kotlin/JS IR backend reaches Beta\n" +
                    "\n" +
                    "Improved Gradle plugin experience\n" +
                    "\n" +
                    "You can also find a short overview of the changes in the release blog post and this video:\n" +
                    "\n" +
                    "Language features\uFEFF\n" +
                    "Kotlin 1.5.30 is presenting previews of future language changes and bringing improvements to the opt-in requirement mechanism and type inference:\n" +
                    "\n" +
                    "Exhaustive when statements for sealed and Boolean subjects\n" +
                    "Suspending functions as supertypes\n" +
                    "Requiring opt-in on implicit usages of experimental APIs\n" +
                    "Changes to using opt-in requirement annotations with different targets\n" +
                    "Improvements to type inference for recursive generic types\n" +
                    "Eliminating builder inference restrictions\n" +
                    "Exhaustive when statements for sealed and Boolean subjects\uFEFF\n" +
                    "Support for sealed (exhaustive) when statements is Experimental. It may be dropped or changed at any time. Opt-in is required (see the details below), and you should use it only for evaluation purposes. We would appreciate your feedback on it in YouTrack.\n" +
                    "\n" +
                    "An exhaustive when statement contains branches for all possible types or values of its subject or for some types plus an else branch. In other words, it covers all possible cases.\n" +
                    "\n" +
                    "We’re planning to prohibit non-exhaustive when statements soon to make the behavior consistent with when expressions. To ensure smooth migration, you can configure the compiler to report warnings about non-exhaustive when statements with a sealed class or a Boolean. Such warnings will appear by default in Kotlin 1.6 and will become errors later.\n" +
                    "\n" +
                    "Enums already get a warning.\n" +
                    "\n" +
                    "sealed class Mode {\n" +
                    "    object ON : Mode()\n" +
                    "    object OFF : Mode()\n" +
                    "}\n" +
                    "\n" +
                    "fun main() {\n" +
                    "    val x: Mode = Mode.ON\n" +
                    "    when (x) {\n" +
                    "        Mode.ON -> println(\"ON\")\n" +
                    "    }\n" +
                    "// WARNING: Non exhaustive 'when' statements on sealed classes/interfaces\n" +
                    "// will be prohibited in 1.7, add an 'OFF' or 'else' branch instead\n" +
                    "\n" +
                    "    val y: Boolean = true\n" +
                    "    when (y) {\n" +
                    "        true -> println(\"true\")\n" +
                    "    }\n" +
                    "// WARNING: Non exhaustive 'when' statements on Booleans will be prohibited\n" +
                    "// in 1.7, add a 'false' or 'else' branch instead\n" +
                    "}\n" +
                    "Copied!\n" +
                    "To enable this feature in Kotlin 1.5.30, use language version 1.6. You can also change the warnings to errors by enabling progressive mode.\n" +
                    "\n" +
                    "Kotlin\n" +
                    "Groovy\n" +
                    "kotlin {\n" +
                    "    sourceSets.all {\n" +
                    "        languageSettings.apply {\n" +
                    "            languageVersion = \"1.6\"\n" +
                    "            //progressiveMode = true // false by default\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n" +
                    "Copied!\n" +
                    "Suspending functions as supertypes\uFEFF\n" +
                    "Support for suspending functions as supertypes is Experimental. It may be dropped or changed at any time. Opt-in is required (see the details below), and you should use it only for evaluation purposes. We would appreciate your feedback on it in YouTrack.\n" +
                    "\n" +
                    "Kotlin 1.5.30 provides a preview of the ability to use a suspend functional type as a supertype with some limitations.\n" +
                    "\n" +
                    "class MyClass: suspend () -> Unit {\n" +
                    "    override suspend fun invoke() { TODO() }\n" +
                    "}\n" +
                    "Copied!\n" +
                    "Use the -language-version 1.6 compiler option to enable the feature:\n" +
                    "\n" +
                    "Kotlin\n" +
                    "Groovy\n" +
                    "kotlin {\n" +
                    "    sourceSets.all {\n" +
                    "        languageSettings.apply {\n" +
                    "            languageVersion = \"1.6\"\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n" +
                    "Copied!\n" +
                    "The feature has the following restrictions:\n" +
                    "\n" +
                    "You can’t mix an ordinary functional type and a suspend functional type as supertype. This is because of the implementation details of suspend functional types in the JVM backend. They are represented in it as ordinary functional types with a marker interface. Because of the marker interface, there is no way to tell which of the superinterfaces are suspended and which are ordinary.\n" +
                    "\n" +
                    "You can't use multiple suspend functional supertypes. If there are type checks, you also can’t use multiple ordinary functional supertypes.\n" +
                    "\n" +
                    "Requiring opt-in on implicit usages of experimental APIs\uFEFF\n" +
                    "The opt-in requirement mechanism is Experimental. It may change at any time. See how to opt-in. Use it only for evaluation purposes. We would appreciate your feedback on it in YouTrack.\n" +
                    "\n" +
                    "The author of a library can mark an experimental API as requiring opt-in to inform users about its experimental state. The compiler raises a warning or error when the API is used and requires explicit consent to suppress it.\n" +
                    "\n" +
                    "In Kotlin 1.5.30, the compiler treats any declaration that has an experimental type in the signature as experimental. Namely, it requires opt-in even for implicit usages of an experimental API. For example, if the function’s return type is marked as an experimental API element, a usage of the function requires you to opt-in even if the declaration is not marked as requiring an opt-in explicitly.\n" +
                    "\n" +
                    "// Library code\n" +
                    "\n" +
                    "@RequiresOptIn(message = \"This API is experimental.\")\n" +
                    "@Retention(AnnotationRetention.BINARY)\n" +
                    "@Target(AnnotationTarget.CLASS)\n" +
                    "annotation class MyDateTime // Opt-in requirement annotation\n" +
                    "\n" +
                    "@MyDateTime\n" +
                    "class DateProvider // A class requiring opt-in\n" +
                    "\n" +
                    "// Client code\n" +
                    "\n" +
                    "// Warning: experimental API usage\n" +
                    "fun createDateSource(): DateProvider { /* ... */ }\n" +
                    "\n" +
                    "fun getDate(): Date {\n" +
                    "    val dateSource = createDateSource() // Also warning: experimental API usage\n" +
                    "    // ...\n" +
                    "}\n" +
                    "Copied!\n" +
                    "Learn more about opt-in requirements.\n" +
                    "\n" +
                    "Changes to using opt-in requirement annotations with different targets\uFEFF\n" +
                    "The opt-in requirement mechanism is Experimental. It may change at any time. See how to opt-in. Use it only for evaluation purposes. We would appreciate your feedback on it in YouTrack.\n" +
                    "\n" +
                    "Kotlin 1.5.30 presents new rules for using and declaring opt-in requirement annotations on different targets. The compiler now reports an error for use cases that are impractical to handle at compile time. In Kotlin 1.5.30:\n" +
                    "\n" +
                    "Marking local variables and value parameters with opt-in requirement annotations is forbidden at the use site.\n" +
                    "\n" +
                    "Marking override is allowed only if its basic declaration is also marked.\n" +
                    "\n" +
                    "Marking backing fields and getters is forbidden. You can mark the basic property instead.\n" +
                    "\n" +
                    "Setting TYPE and TYPE_PARAMETER annotation targets is forbidden at the opt-in requirement annotation declaration site.\n" +
                    "\n" +
                    "Learn more about opt-in requirements.\n" +
                    "\n" +
                    "Improvements to type inference for recursive generic types\uFEFF\n" +
                    "In Kotlin and Java, you can define a recursive generic type, which references itself in its type parameters. In Kotlin 1.5.30, the Kotlin compiler can infer a type argument based only on upper bounds of the corresponding type parameter if it is a recursive generic. This makes it possible to create various patterns with recursive generic types that are often used in Java to make builder APIs.\n" +
                    "\n" +
                    "// Kotlin 1.5.20\n" +
                    "val containerA = PostgreSQLContainer(DockerImageName.parse(\"postgres:13-alpine\")).apply {\n" +
                    "    withDatabaseName(\"db\")\n" +
                    "    withUsername(\"user\")\n" +
                    "    withPassword(\"password\")\n" +
                    "    withInitScript(\"sql/schema.sql\")\n" +
                    "}\n" +
                    "\n" +
                    "// Kotlin 1.5.30\n" +
                    "val containerB = PostgreSQLContainer(DockerImageName.parse(\"postgres:13-alpine\"))\n" +
                    "    .withDatabaseName(\"db\")\n" +
                    "    .withUsername(\"user\")\n" +
                    "    .withPassword(\"password\")\n" +
                    "    .withInitScript(\"sql/schema.sql\")\n" +
                    "Copied!\n" +
                    "You can enable the improvements by passing the -Xself-upper-bound-inference or the -language-version 1.6 compiler options. See other examples of newly supported use cases in this YouTrack ticket.\n" +
                    "\n" +
                    "Eliminating builder inference restrictions\uFEFF\n" +
                    "Builder inference is a special kind of type inference that allows you to infer the type arguments of a call based on type information from other calls inside its lambda argument. This can be useful when calling generic builder functions such as buildList() or sequence(): buildList { add(\"string\") }.\n" +
                    "\n" +
                    "Inside such a lambda argument, there was previously a limitation on using the type information that the builder inference tries to infer. This means you can only specify it and cannot get it. For example, you cannot call get() inside a lambda argument of buildList() without explicitly specified type arguments.\n" +
                    "\n" +
                    "Kotlin 1.5.30 removes these limitations with the -Xunrestricted-builder-inference compiler option. Add this option to enable previously prohibited calls inside a lambda argument of generic builder functions:\n" +
                    "\n" +
                    "@kotlin.ExperimentalStdlibApi\n" +
                    "val list = buildList {\n" +
                    "    add(\"a\")\n" +
                    "    add(\"b\")\n" +
                    "    set(1, null)\n" +
                    "    val x = get(1)\n" +
                    "    if (x != null) {\n" +
                    "        removeAt(1)\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "@kotlin.ExperimentalStdlibApi\n" +
                    "val map = buildMap {\n" +
                    "    put(\"a\", 1)\n" +
                    "    put(\"b\", 1.1)\n" +
                    "    put(\"c\", 2f)\n" +
                    "}\n" +
                    "Copied!\n" +
                    "Also, you can enable this feature with the -language-version 1.6 compiler option.\n" +
                    "\n" +
                    "Kotlin/JVM\uFEFF\n" +
                    "With Kotlin 1.5.30, Kotlin/JVM receives the following features:\n" +
                    "\n" +
                    "Instantiation of annotation classes\n" +
                    "Improved nullability annotation support configuration\n" +
                    "See the Gradle section for Kotlin Gradle plugin updates on the JVM platform.\n" +
                    "\n" +
                    "Instantiation of annotation classes\uFEFF\n" +
                    "Instantiation of annotation classes is Experimental. It may be dropped or changed at any time. Opt-in is required (see the details below), and you should use it only for evaluation purposes. We would appreciate your feedback on it in YouTrack.\n" +
                    "\n" +
                    "With Kotlin 1.5.30 you can now call constructors of annotation classes in arbitrary code to obtain a resulting instance. This feature covers the same use cases as the Java convention that allows the implementation of an annotation interface.\n" +
                    "\n" +
                    "annotation class InfoMarker(val info: String)\n" +
                    "\n" +
                    "fun processInfo(marker: InfoMarker) = ...\n" +
                    "\n" +
                    "fun main(args: Array) {\n" +
                    "    if (args.size != 0)\n" +
                    "        processInfo(getAnnotationReflective(args))\n" +
                    "    else\n" +
                    "        processInfo(InfoMarker(\"default\"))\n" +
                    "}\n" +
                    "Copied!\n" +
                    "Use the -language-version 1.6 compiler option to enable this feature. Note that all current annotation class limitations, such as restrictions to define non- val parameters or members different from secondary constructors, remain intact.\n" +
                    "\n" +
                    "Learn more about instantiation of annotation classes in this KEEP\n" +
                    "\n" +
                    "Improved nullability annotation support configuration\uFEFF\n" +
                    "The Kotlin compiler can read various types of nullability annotations to get nullability information from Java. This information allows it to report nullability mismatches in Kotlin when calling Java code.\n" +
                    "\n" +
                    "In Kotlin 1.5.30, you can specify whether the compiler reports a nullability mismatch based on the information from specific types of nullability annotations. Just use the compiler option -Xnullability-annotations=In the argument, specify the fully qualified nullability annotations package and one of these report levels:\n" +
                    "\n" +
                    "ignore to ignore nullability mismatches\n" +
                    "\n" +
                    "warn to report warnings\n" +
                    "\n" +
                    "strict to report errors.\n" +
                    "\n" +
                    "See the full list of supported nullability annotations along with their fully qualified package names.\n" +
                    "\n" +
                    "Here is an example showing how to enable error reporting for the newly supported RxJava 3 nullability annotations: -Xnullability-annotations=@io.reactivex.rxjava3.annotations:strict. Note that all such nullability mismatches are warnings by default.\n" +
                    "\n" +
                    "Kotlin/Native\uFEFF\n" +
                    "Kotlin/Native has received various changes and improvements:\n" +
                    "\n" +
                    "Apple silicon support\n" +
                    "Improved Kotlin DSL for the CocoaPods Gradle plugin\n" +
                    "Experimental interoperability with Swift 5.5 async/await\n" +
                    "Improved Swift/Objective-C mapping for objects and companion objects\n" +
                    "Deprecation of linkage against DLLs without import libraries for MinGW targets\n" +
                    "Apple silicon support\uFEFF\n" +
                    "Kotlin 1.5.30 introduces native support for Apple silicon.\n" +
                    "\n" +
                    "Previously, the Kotlin/Native compiler and tooling required the Rosetta translation environment for working on Apple silicon hosts. In Kotlin 1.5.30, the translation environment is no longer needed – the compiler and tooling can run on Apple silicon hardware without requiring any additional actions.\n" +
                    "\n" +
                    "We’ve also introduced new targets that make Kotlin code run natively on Apple silicon:\n" +
                    "\n" +
                    "macosArm64\n" +
                    "iosSimulatorArm64\n" +
                    "watchosSimulatorArm64\n" +
                    "tvosSimulatorArm64\n" +
                    "They are available on both Intel-based and Apple silicon hosts. All existing targets are available on Apple silicon hosts as well.\n" +
                    "\n" +
                    "Note that in 1.5.30 we provide only basic support for Apple silicon targets in the kotlin-multiplatform Gradle plugin. Particularly, the new simulator targets aren’t included in the ios, tvos, and watchos target shortcuts. Learn how to use Apple silicon targets with the target shortcuts. We will keep working to improve the user experience with the new targets.\n" +
                    "\n" +
                    "Improved Kotlin DSL for the CocoaPods Gradle plugin\uFEFF\n" +
                    "New parameters for Kotlin/Native frameworks\uFEFF\n" +
                    "Kotlin 1.5.30 introduces the improved CocoaPods Gradle plugin DSL for Kotlin/Native frameworks. In addition to the name of the framework, you can specify other parameters in the pod configuration:\n" +
                    "\n" +
                    "Specify the dynamic or static version of the framework\n" +
                    "\n" +
                    "Enable export dependencies explicitly\n" +
                    "\n" +
                    "Enable Bitcode embedding\n" +
                    "\n" +
                    "To use the new DSL, update your project to Kotlin 1.5.30, and specify the parameters in the cocoapods section of your build.gradle(.kts) file:\n" +
                    "\n" +
                    "cocoapods {\n" +
                    "    frameworkName = \"MyFramework\" // This property is deprecated\n" +
                    "    // and will be removed in future versions\n" +
                    "    // New DSL for framework configuration:\n" +
                    "    framework {\n" +
                    "        // All Framework properties are supported\n" +
                    "        // Framework name configuration. Use this property instead of\n" +
                    "        // deprecated 'frameworkName'\n" +
                    "        baseName = \"MyFramework\"\n" +
                    "        // Dynamic framework support\n" +
                    "        isStatic = false\n" +
                    "        // Dependency export\n" +
                    "        export(project(\":anotherKMMModule\"))\n" +
                    "        transitiveExport = true\n" +
                    "        // Bitcode embedding\n" +
                    "        embedBitcode(BITCODE)\n" +
                    "    }\n" +
                    "}\n" +
                    "Copied!\n" +
                    "Support custom names for Xcode configuration\uFEFF\n" +
                    "The Kotlin CocoaPods Gradle plugin supports custom names in the Xcode build configuration. It will also help you if you’re using special names for the build configuration in Xcode, for example Staging.\n" +
                    "\n" +
                    "To specify a custom name, use the xcodeConfigurationToNativeBuildType parameter in the cocoapods section of your build.gradle(.kts) file:\n" +
                    "\n" +
                    "cocoapods {\n" +
                    "    // Maps custom Xcode configuration to NativeBuildType\n" +
                    "    xcodeConfigurationToNativeBuildType[\"CUSTOM_DEBUG\"] = NativeBuildType.DEBUG\n" +
                    "    xcodeConfigurationToNativeBuildType[\"CUSTOM_RELEASE\"] = NativeBuildType.RELEASE\n" +
                    "}\n" +
                    "Copied!\n" +
                    "This parameter will not appear in the podspec file. When Xcode runs the Gradle build process, the Kotlin CocoaPods Gradle plugin will select the necessary native build type.\n" +
                    "\n" +
                    "There’s no need to declare the Debug and Release configurations because they are supported by default.\n" +
                    "\n" +
                    "Experimental interoperability with Swift 5.5 async/await\uFEFF\n" +
                    "Concurrency interoperability with Swift async/await is Experimental. It may be dropped or changed at any time. You should use it only for evaluation purposes. We would appreciate your feedback on it in YouTrack.\n" +
                    "\n" +
                    "We added support for calling Kotlin’s suspending functions from Objective-C and Swift in 1.4.0, and now we’re improving it to keep up with a new Swift 5.5 feature – concurrency with async and await modifiers.\n" +
                    "\n" +
                    "The Kotlin/Native compiler now emits the _Nullable_result attribute in the generated Objective-C headers for suspending functions with nullable return types. This makes it possible to call them from Swift as async functions with the proper nullability.\n" +
                    "\n" +
                    "Note that this feature is experimental and can be affected in the future by changes in both Kotlin and Swift. For now, we’re offering a preview of this feature that has certain limitations, and we are eager to hear what you think. Learn more about its current state and leave your feedback in this YouTrack issue.\n" +
                    "\n" +
                    "Improved Swift/Objective-C mapping for objects and companion objects\uFEFF\n" +
                    "Getting objects and companion objects can now be done in a way that is more intuitive for native iOS developers. For example, if you have the following objects in Kotlin:\n" +
                    "\n" +
                    "object MyObject {\n" +
                    "    val x = \"Some value\"\n" +
                    "}\n" +
                    "\n" +
                    "class MyClass {\n" +
                    "    companion object {\n" +
                    "        val x = \"Some value\"\n" +
                    "    }\n" +
                    "}\n" +
                    "Copied!\n" +
                    "To access them in Swift, you can use the shared and companion properties:\n" +
                    "\n" +
                    "MyObject.shared\n" +
                    "MyObject.shared.x\n" +
                    "MyClass.companion\n" +
                    "MyClass.Companion.shared\n" +
                    "Copied!\n" +
                    "Learn more about Swift/Objective-C interoperability.\n" +
                    "\n" +
                    "Deprecation of linkage against DLLs without import libraries for MinGW targets\uFEFF\n" +
                    "LLD is a linker from the LLVM project, which we plan to start using in Kotlin/Native for MinGW targets because of its benefits over the default ld.bfd – primarily its better performance.\n" +
                    "\n" +
                    "However, the latest stable version of LLD doesn’t support direct linkage against DLL for MinGW (Windows) targets. Such linkage requires using import libraries. Although they aren’t needed with Kotlin/Native 1.5.30, we’re adding a warning to inform you that such usage is incompatible with LLD that will become the default linker for MinGW in the future.\n" +
                    "\n" +
                    "Please share your thoughts and concerns about the transition to the LLD linker in this YouTrack issue.\n" +
                    "\n" +
                    "Kotlin Multiplatform\uFEFF\n" +
                    "1.5.30 brings the following notable updates to Kotlin Multiplatform:\n" +
                    "\n" +
                    "Ability to use custom cinterop libraries in shared native code\n" +
                    "Support for XCFrameworks\n" +
                    "New default publishing setup for Android artifacts\n" +
                    "Ability to use custom cinterop libraries in shared native code\uFEFF\n" +
                    "Kotlin Multiplatform gives you an option to use platform-dependent interop libraries in shared source sets. Before 1.5.30, this worked only with platform libraries shipped with Kotlin/Native distribution. Starting from 1.5.30, you can use it with your custom cinterop libraries. To enable this feature, add the kotlin.mpp.enableCInteropCommonization=true property in your gradle.properties:\n" +
                    "\n" +
                    "kotlin.mpp.enableGranularSourceSetsMetadata=true\n" +
                    "kotlin.native.enableDependencyPropagation=false\n" +
                    "kotlin.mpp.enableCInteropCommonization=true\n" +
                    "Copied!\n" +
                    "Support for XCFrameworks\uFEFF\n" +
                    "All Kotlin Multiplatform projects can now have XCFrameworks as an output format. Apple introduced XCFrameworks as a replacement for universal (fat) frameworks. With the help of XCFrameworks you:\n" +
                    "\n" +
                    "Can gather logic for all the target platforms and architectures in a single bundle.\n" +
                    "\n" +
                    "Don't need to remove all unnecessary architectures before publishing the application to the App Store.\n" +
                    "\n" +
                    "XCFrameworks is useful if you want to use your KMM framework for devices and simulators on Apple M1.\n" +
                    "\n" +
                    "To use XCFrameworks, update your build.gradle(.kts) script:\n" +
                    "\n" +
                    "Kotlin\n" +
                    "Groovy\n" +
                    "import org.jetbrains.kotlin.gradle.plugin.mpp.apple.XCFramework\n" +
                    "\n" +
                    "plugins {\n" +
                    "    kotlin(\"multiplatform\")\n" +
                    "}\n" +
                    "\n" +
                    "kotlin {\n" +
                    "    val xcf = XCFramework()\n" +
                    "\n" +
                    "    ios {\n" +
                    "        binaries.framework {\n" +
                    "            baseName = \"shared\"\n" +
                    "            xcf.add(this)\n" +
                    "        }\n" +
                    "    }\n" +
                    "    watchos {\n" +
                    "        binaries.framework {\n" +
                    "            baseName = \"shared\"\n" +
                    "            xcf.add(this)\n" +
                    "        }\n" +
                    "    }\n" +
                    "    tvos {\n" +
                    "        binaries.framework {\n" +
                    "            baseName = \"shared\"\n" +
                    "            xcf.add(this)\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n" +
                    "Copied!\n" +
                    "When you declare XCFrameworks, these new Gradle tasks will be registered:\n" +
                    "\n" +
                    "assembleXCFramework\n" +
                    "assembleDebugXCFramework (additionally debug artifact that contains dSYMs)\n" +
                    "\n" +
                    "assembleReleaseXCFramework\n" +
                    "Learn more about XCFrameworks in this WWDC video.\n" +
                    "\n" +
                    "New default publishing setup for Android artifacts\uFEFF\n" +
                    "Using the maven-publish Gradle plugin, you can publish your multiplatform library for the Android target by specifying Android variant names in the build script. The Kotlin Gradle plugin will generate publications automatically.\n" +
                    "\n" +
                    "Before 1.5.30, the generated publication metadata included the build type attributes for every published Android variant, making it compatible only with the same build type used by the library consumer. Kotlin 1.5.30 introduces a new default publishing setup:\n" +
                    "\n" +
                    "If all Android variants that the project publishes have the same build type attribute, then the published variants won't have the build type attribute and will be compatible with any build type.\n" +
                    "\n" +
                    "If the published variants have different build type attributes, then only those with the release value will be published without the build type attribute. This makes the release variants compatible with any build type on the consumer side, while non-release variants will only be compatible with the matching consumer build types.\n" +
                    "\n" +
                    "To opt-out and keep the build type attributes for all variants, you can set this Gradle property: kotlin.android.buildTypeAttribute.keep=true."
    ""${'"'}</string>
        """.trimIndent()
}

fun getDetailImage(): Int {
    return R.drawable.kotlinversionimage
}