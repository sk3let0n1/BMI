package com.company;

import java.util.Scanner;

public class PatientTest {

    public static void main(String[] args) {
        String f = "f";
        Patient patient1 = new Patient();
        System.out.println("BMI Rechner:");
        System.out.println("Nacheinander Name, Geschlecht, Gewicht und Größe angeben");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Geschlecht angeben; weiblich = f, männlich = m");
        String geschlecht = input.nextLine();
        double gewicht = input.nextDouble();
        double groesse = input.nextDouble();
        System.out.println("Name: " + name);
        if (geschlecht.equals(f)) {
            System.out.println("weiblich");
        } else {
            System.out.println("männlich");
        }
        System.out.println("Gewicht: " + gewicht);
        System.out.println("Größe: " + groesse);
        patient1.bmiBerechnen(gewicht, groesse);
        patient1.idealBerechnen(geschlecht, groesse);
        patient1.zustandBestimmen(geschlecht);

    }
}
