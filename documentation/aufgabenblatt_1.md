# Aufgabenblatt 1

Gruppe 25 - Nik Benson - Marco Kanera - Hussein Mislemani - David Edward Ssebuliba

## Praktikumsaufgabe 1

### a)

Integration in IntelliJ durch 'File > Project Structure > Modules > + > Import'.
Anschlie�end integration in Ant mit doppelt shift>"Ant" und starten �ber denselben Hotkey.

### b)

In der IntelliJ IDE k�nnen breakpoints durch das Klicken auf den linken rand einer Zeile eingef�gt werden.
Varriablen, Stack Trace, etc. k�nnen mit der Tastenkombination 'Alt+5' eingesehen werden.
Dazu muss der code mit 'Shift+F9' anstadt 'Schift+F10' gestartet werden.

## Praktikumsaufgabe 2

### a)

L�schen von LoginDialog.java, schauen, wo es rot leuchtet.
Folglich anpassen von SwingClient, sodass bei der authentifikation statisch eine `new Person()` zur�ck gegeben wird.

### b)

Zun�chst konnten wir auf der Klasse Termin keine ID finden, allerdings konnten wir das Feld auf der Superklasse Eintrag
finden.
Hier haben wir eine statische Variable erstellt, die bei Erstellen einer Instanz hoch z�hlt und die neue ID vergibt.

```Java
static private int count=0;
protected int id=count++;
```

Damit ist die ID �ber die JVM Instanz eindeutig.
