# Aufgabenblatt 1

Gruppe 25 - Nik Benson - Marco Kanera - Hussein Mislemani - David Edward Ssebuliba

## Praktikumsaufgabe 1

### a)

Integration in IntelliJ durch 'File > Project Structure > Modules > + > Import'.
Anschließend integration in Ant mit doppelt shift>"Ant" und starten über denselben Hotkey.

### b)

In der IntelliJ IDE können breakpoints durch das Klicken auf den linken rand einer Zeile eingefügt werden.
Varriablen, Stack Trace, etc. können mit der Tastenkombination 'Alt+5' eingesehen werden.
Dazu muss der code mit 'Shift+F9' anstadt 'Schift+F10' gestartet werden.

## Praktikumsaufgabe 2

### a)

Löschen von LoginDialog.java, schauen, wo es rot leuchtet.
Folglich anpassen von SwingClient, sodass bei der authentifikation statisch eine `new Person()` zurück gegeben wird.

### b)

Zunächst konnten wir auf der Klasse Termin keine ID finden, allerdings konnten wir das Feld auf der Superklasse Eintrag
finden.
Hier haben wir eine statische Variable erstellt, die bei Erstellen einer Instanz hoch zählt und die neue ID vergibt.

```Java
static private int count=0;
protected int id=count++;
```

Damit ist die ID über die JVM Instanz eindeutig.

### c)

Erst haben wir die Methode `getTermin(int terminId)` umgesetzt, indem wir aus der Map `teilnehmerTermine`, die die Teilnehmer-Termin-Assoziationen verwaltet, alle Termine durchgehen und denjenigen zurückgeben, der mit der übergebenen `terminId` übereinstimmt.

Für die Methode `delete(int terminId)` konnten wir mittels der Methode `getTermin(int terminId)` den gesuchten Termin finden und diesen dann der schon immplementierten Methode `delete(Termin termin)` übergeben.

```Java
this.delete(getTermin(terminID));
```
