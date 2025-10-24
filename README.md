# JAVAOOP_EXERCISE
in compliance for Elective 2 OOP

## Upgrade to Java 21 (manual)

This repository doesn't contain a Maven `pom.xml` or Gradle `build.gradle` file — it's a set of standalone Java source files. The automated Copilot upgrade tool is unavailable on this account, so follow these manual steps to upgrade your local runtime to Java 21 (LTS).

1. Install JDK 21
   - Recommended distributions: Eclipse Temurin (Adoptium) or Microsoft Build of OpenJDK. Download and install the Windows x64 JDK 21 package from the distribution website.

2. Configure environment variables (PowerShell example)
   - Replace the path below with your actual JDK 21 install location (example shown for Temurin):

```powershell
$env:JAVA_HOME = 'C:\Program Files\Eclipse Adoptium\jdk-21.0.0.***'
$env:Path = "$env:JAVA_HOME\\bin;" + $env:Path
java -version
```

3. Verify installation
   - In PowerShell run:

```powershell
java -version
javac -version
```

You should see `21` in the reported versions.

4. Compile this project's Java files using Java 21
   - From the project root (PowerShell):

```powershell
# compile all .java files targeting Java 21
javac --release 21 *.java

# run a class, e.g. if you have a main class named Student
java Student
```

Notes:
 - Using `--release 21` ensures the compiler targets the Java 21 standard library. If you have multiple packages or subfolders, adjust the compile command accordingly.
 - If you use an IDE (VS Code), configure the Java extension to point to your JDK 21 installation. Example VS Code settings snippet (add to `.vscode/settings.json`):

```json
"java.configuration.runtimes": [
  {
    "name": "JavaSE-21",
    "path": "C:\\Program Files\\Eclipse Adoptium\\jdk-21.0.0.***"
  }
]
```

5. If you later add a build tool (Maven/Gradle)
   - Add/update `pom.xml` / `build.gradle` and set `maven.compiler.release` or `java.toolchain` / `sourceCompatibility`/`targetCompatibility` to 21.

If you'd like, I can:
 - Help install JDK 21 automatically (show PowerShell commands or a download link).
 - Add a tiny `pom.xml` or Gradle build to manage compilation and specify Java 21.
 - Create a branch and apply the changes and tests.
# JAVAOOP_EXERCISE
in compliance for Elective 2 OOP
