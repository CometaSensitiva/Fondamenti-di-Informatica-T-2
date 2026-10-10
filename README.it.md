# Fondamenti di Informatica T-2 · Java

[English](README.md) · **Italiano**

I progetti Eclipse scritti per *Fondamenti di Informatica T-2* all'Università di Bologna (Ingegneria Informatica, 2022–23): programmazione a oggetti in Java, dalle classi alle collection, agli stream e a JavaFX. Fa parte del mio [materiale universitario](https://github.com/CometaSensitiva/university).

## Contenuto

| Cartella | Contenuto |
| --- | --- |
| [`EclipseTeoria/`](EclipseTeoria) | 25 progetti che seguono le lezioni: classi, ereditarietà, polimorfismo, `equals`/`hashCode`, record, interfacce, generici, collection, eccezioni, I/O, lambda, stream, JavaFX |
| [`EclipseLaboratorio/`](EclipseLaboratorio) | Esercitazioni di laboratorio, dalle frazioni e dai ticket di sosta a un calendario, MasterMind e i laboratori finali più ampi (EDLift, Media, Bussy) |
| [`EclipseEsercizi/`](EclipseEsercizi) | Esercizi individuali: stringhe e codice fiscale, matrici, test JUnit, piani telefonici, elezioni, un servizio taxi, persistenza, un contatore JavaFX |

## Come usarlo

Serve un **JDK 17 o successivo**; alcuni esempi usano i record. Ogni esercizio è indipendente.

I metadati Eclipse sono esclusi da Git, quindi **Existing Projects into Workspace** non trova i progetti in un clone pulito. Usa *File → New → Java Project*, togli *Use default location* e seleziona la cartella di un esercizio. Aggiungi `src` al build path; per i primi esempi senza `src`, usa la cartella dell’esercizio stesso. Non creare `module-info.java`.

Per provare un primo esempio dal terminale:

```sh
cd "EclipseLaboratorio/LAB01 Esempio1"
javac -encoding UTF-8 -d out Esempio1.java
java -cp out Esempio1 Hello
```

Per i progetti grafici aggiungi il JavaFX SDK al module path ([configurazione OpenJFX](https://openjfx.io/openjfx-docs/)). Le configurazioni di avvio richiedono `--module-path /percorso/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml`. I test che importano `org.junit.jupiter` richiedono **JUnit 5**; i progetti con JAR inclusi richiedono anche quei JAR nel classpath. Avvia gli esempi che leggono dati dalla cartella dell’esercizio.

Alcuni file più vecchi usano Windows-1252: se il compilatore segnala caratteri non riconosciuti, scegli quella codifica in Eclipse o passa `-encoding windows-1252` a `javac`. Sono sorgenti storici del corso; alcuni progetti e varianti degli esercizi sono incompleti.

Rilasciato con [licenza MIT](LICENSE).
