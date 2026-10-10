# Fondamenti di Informatica T-2 · Java

**English** · [Italiano](README.it.md)

The Eclipse projects I wrote for *Fondamenti di Informatica T-2* at the University of Bologna (Computer Engineering, 2022–23): object-oriented programming in Java, from classes and objects to collections, streams and JavaFX. Part of my [university work](https://github.com/CometaSensitiva/university).

## What's inside

| Folder | Contents |
| --- | --- |
| [`EclipseTeoria/`](EclipseTeoria) | 25 projects following the lectures: classes, inheritance, polymorphism, `equals`/`hashCode`, records, interfaces, generics, collections, exceptions, I/O, lambdas, streams, JavaFX |
| [`EclipseLaboratorio/`](EclipseLaboratorio) | Lab assignments, from fractions and parking tickets to a calendar, MasterMind and the larger final labs (EDLift, Media, Bussy) |
| [`EclipseEsercizi/`](EclipseEsercizi) | Individual exercises: string parsing and tax codes, matrices, JUnit tests, phone plans, elections, a taxi service, persistence, a JavaFX counter |

## Use it

Requires a **JDK 17 or later**; some examples use records. Each exercise is independent.

Eclipse project metadata is excluded from Git, so **Existing Projects into Workspace** cannot discover a clean clone. Use *File → New → Java Project*, uncheck *Use default location*, and select one exercise folder. Add its `src` folder to the build path; for early examples without `src`, use the exercise folder itself. Do not create `module-info.java`.

To try a first example from a terminal:

```sh
cd "EclipseLaboratorio/LAB01 Esempio1"
javac -encoding UTF-8 -d out Esempio1.java
java -cp out Esempio1 Hello
```

Add the JavaFX SDK to the module path for graphical projects ([OpenJFX setup](https://openjfx.io/openjfx-docs/)). Run configurations need `--module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml`. Tests importing `org.junit.jupiter` need **JUnit 5**; projects with bundled JARs also need those JARs on the classpath. Run examples using data files from their exercise folder.

Some older files use Windows-1252: if the compiler reports unmappable characters, select that encoding in Eclipse or pass `-encoding windows-1252` to `javac`. These are historical coursework sources; some projects and exercise branches are incomplete.

Released under the [MIT license](LICENSE).
