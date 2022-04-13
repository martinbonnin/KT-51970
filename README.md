To reproduce, run

```
./gradlew :compileCommonMainKotlinMetadata
```

The error should be:

```
e: /Users/mbonnin/git/test-okio/src/commonMain/kotlin/Main.kt: (1, 8): Unresolved reference: okio
e: /Users/mbonnin/git/test-okio/src/commonMain/kotlin/Main.kt: (2, 8): Unresolved reference: okio
e: /Users/mbonnin/git/test-okio/src/commonMain/kotlin/Main.kt: (4, 12): Unresolved reference: okio
```