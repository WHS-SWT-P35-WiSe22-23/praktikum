# Aufgabenblatt 2

Gruppe 25 - Nik Benson - Marco Kanera - Hussein Mislemani - David Edward Ssebuliba

## Praktikumsaufgabe 3

### �berf�hren in GIT

Alle 3 Teilprojekte aus SVN liegen zu Beginn in einem Ordner.
In diesem Ordner wird `git init` ausgef�hrt, um ein leeres GIT repository zu erzeugen.
Anschlie�end wird ein initialer Commit erstellt:

```bash
git add .
git commit -m "Initial Commit"
```

Um diesen dann auf unser GitHub Repository hochzuladen, f�gen wir zun�chst den Remote hinzu:

```bash
git remote add origin git@github.com:WHS-SWT-P35-WiSe22-23/praktikum.git
```

Anschlie�end laden wir die Branch hoch, indem wir sie pushen:

```bash
git push -u origin HEAD
```

### a

Die anderen Team Mitglieder konnten das Repository mittels des clone Befehls herunterzuladen:

```bash
git clone git@github.com:WHS-SWT-P35-WiSe22-23/praktikum.git
```

### c

Als �nderung haben wir uns eine der JUnit Klassen ausgesucht.
Hier haben wir einen Test hinzugef�gt:

```java
public void alwaysTrue() {
    assertTrue(true);
}
```

Anschlie�end mussten wir die �nderung stagen und commiten:

```bash
git add .
git commit -m "test(p3.c): added dummy test"
```

### d

Mit demselben Ablauf haben wir einen weiteren Test hinzugef�gt:

```java
public void alwaysFalse() {
    assertFalse(false);
}
```

```bash
git add .
git commit -m "test(p3.c): added second dummy test"
```

Und diesen ver�ndert:

```java
public void alwaysFalse() {
    assertFalse(!true);
}
```

```bash
git add .
git commit -m "test(p3.c): changed second dummy test"
```

### e

Zur Kooperation brauchen wir push und pull.
Zum hochladen pushen wir die Commits in eine neue Branch:

```bash
git switch -c feature/p3e
git push -u origin HEAD
```

Um das Repository der anderen zu aktualisieren, mussten wir einen pull ausf�hren:

```bash
git fetch
git switch feature/p3e
git pull
```

### f

Um einen Merge Konflikt zu erzeugen, erstellen wir zun�chst eine Branch vom letzten Commit:

```bash
git switch -c feature/p3f HEAD~1
```

Nun �ndern wir den Test in einer anderen Zeile:

```java
public void alwaysFalse() {
    System.out.println(false);
    assertFalse(false);
}
```

```bash
git add .
git commit -m "test(p3.f): changed second dummy test"
git push -u origin HEAD
```

### g

Um einen Merge Konflikt zu erzeugen, erstellen wir zun�chst eine Branch vom letzten Commit:

```bash
git switch -c feature/p3g HEAD~1
```

Nun �ndern wir den Test in einer anderen Zeile:

```java
public void alwaysFalse() {
    assertFalse(!!false);
}
```

```bash
git add .
git commit -m "test(p3.g): changed second dummy test"
git push -u origin HEAD
```

### i

Hierzu dient die [.gitignore](https://git-scm.com/docs/gitignore).
Hier k�nnen Kaskadiert Dateipfade, die mit dem globbing System von Bash erweitert werden, angegeben werden.
Diese werden folglich von GIT ignoriert, insofern die entsprechende Datei nicht bereits gestaged ist.
Ein Beispiel f�r Java Projekte ist:
.gitignore

```gitignore
*.class
*.jar
```

### j

Das Dateiformat Markdown, welches eine vereinfachte Auszeichnungssprache ist, die zu HTML interpretiert wird, wird unter GitHub und GitLab meist f�r wichtige Dateien, wie `README.md`, `CHANGELOG.md` und `CONTRIBUTING.md` verwendet.
Dabei zeichnet sich Markdown durch seine einfache Syntax aus, was es auch im Textformat leicht lesbar macht.

### k

#### 3-Way-Merge (ORT Strategie)

```bash
git switch a
git merge b
```

Es werden rekursiv beide Pointer, a und b, miteinander verglichen.
Dabei entsteht ein Merge-Commit, der 2 Parent-Commits hat.

#### Rebase

```bash
git switch b
git rebase a
```

Rebase sucht sich den letzten gemeinsamen Commit beider Branches und applied dann zun�chst alle Commits der Branch `a` und dann alle Commits der Branch `b`.
So bleibt eine lineare Historie ohne Ver�stelungen.
F�r einzelne Konflikte wird derselbe Merge Algorithms wie beim klassischen Merge verwendet.
