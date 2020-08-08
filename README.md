# Reproduction instructions for Snappy bug

1. Clone this repository
2. Edit `org.gradle.java.home` in `gradle.properties` to point to your JDK 8 installation.
3. Execute `./gradlew build run`. You should observe an error similar to the following:
    ```
    > Task :run FAILED
    Exception in thread "main" java.lang.NoSuchMethodError: java.nio.ByteBuffer.limit(I)Ljava/nio/ByteBuffer;
            at org.xerial.snappy.Snappy.compress(Snappy.java:152)
            at SnappyRepro.App.main(App.java:15)
    ```
4. Edit `build.gradle` to use version `1.1.7.3` of snappy and execute `./gradlew build run`. Observe successful run.
