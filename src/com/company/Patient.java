package com.company;

public class Patient {
    public double gewicht;
    public double bmi;
    String m = "m";


    public double bmiBerechnen(double gewicht, double groesse) {
        bmi = gewicht / (groesse * groesse);
        bmi = (int) bmi;
        System.out.println("Dein BMI beträgt: " + bmi);
                return bmi;

    }

    public double idealBerechnen(String geschlecht, double groesse) {
        if (geschlecht.equals(m)) {
            gewicht = 22 * (groesse * groesse);
            System.out.printf("Dein ideales Gewicht beträgt: %.1f kg", gewicht);

        } else {
            gewicht = 21 * (groesse * groesse);
            System.out.printf("Dein ideales Gewicht beträgt: %.1f kg", gewicht);
        }
        return gewicht;
    }
    public String zustandBestimmen(String geschlecht) {
        if (geschlecht.equals(m)) {
            if (bmi >= 40) {
                System.out.println("\nDu hast Extremes Übergewicht!");
            } else if (bmi >= 30) {
                System.out.println("\nDu hast Starkes Übergewicht!");
            } else if (bmi >= 25) {
                System.out.println("\nDu hast Übergewicht!");
            } else if (bmi >= 20) {
                System.out.println("\nDu hast normales Gewicht!");
            } else {
                System.out.println("\nDu hast Untergewicht!");
            }

        } else {
            if (bmi >= 40) {
                System.out.println("\nDu hast Extremes Übergewicht!");
            } else if (bmi >= 30) {
                System.out.println("\nDu hast Starkes Übergewicht!");
            } else if (bmi >= 24) {
                System.out.println("\nDu hast Übergewicht!");
            } else if (bmi >= 19) {
                System.out.println("\nDu hast normales Gewicht!");
            } else {
                System.out.println("\nDu hast Untergewicht!");
            }
        }



        return geschlecht;
    }
}
