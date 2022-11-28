package de.whs.swt.wise2223.p25.praktikumsaufgabe6;

import static de.whs.swt.wise2223.p25.praktikumsaufgabe6.mylib.MyLib.NAME;

public class Main {
    public static void main(String[] args) {
        System.getLogger("logger").log(System.Logger.Level.INFO, "Hello %s!".formatted(NAME));
    }
}
