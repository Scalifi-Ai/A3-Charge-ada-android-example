# Ada Example

This project contains a minimal example application to start displaying Ads with Aniview's Ada library.


## How to run this example
Running this example requires `publisher` and `tag` ids.
They can be configures in the root `local.properties` file like this:

```properties
sdk.dir=...

av_pub_id={published id goes here}
av_tag_id={tag id goes here}
```

After this project can simply be opened in the Android Studio and built.


## How to configure fresh project
Here are steps to configure a fresh project:

1. Add Maven repository in the `settings.gradle.kts` file:
```kts
dependencyResolutionManagement {
    repositories {
        maven("https://us-central1-maven.pkg.dev/mobile-sdk-fd2e4/adservr-maven")
    }
}
```

2. Add Maven dependencies in the app's `build.gradle.kts` file:
```kts
dependencies {
    implementation("com.adservrs:ada:1.0.0-beta01")
}
```

3. Add `AdaView` in the code:
```kotlin
val config = AdaConfig(
    pubId = "published id",
    tagId = "tag id",
)
parent.addView(AdaView(context, config))
```

4. Add Google Mobile Ads application ID to `AndroidManifest.xml`:
```xml
<manifest>
    <application>
        <meta-data
            android:name="com.google.android.gms.ads.APPLICATION_ID"
            android:value="ca-app-pub-6746653557725812~6678258028"/>
    </application>
</manifest>
```
