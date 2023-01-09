package de.whs.swt.wise2223.praktikum.aufgabe9;

public class Main {
    float wurzel(float zahl) {
        if (zahl < 0.0f) {
            throw new IllegalArgumentException("zahl muss positive sein");
        }

        float wert = 2.0f;
        while (Math.abs(wert * wert - zahl) > 0.001) {
            wert = wert - ((wert * wert - zahl) / (2.0f * wert));
        }
        return wert;
    }
}
