package ro.ubbcluj.cs;

import ro.ubbcluj.cs.models.Obiect;
import ro.ubbcluj.cs.models.Persoana;

public class Main {

    public static void main(String[] args) {
        System.out.println("Initial version");

        Persoana persoana = new Persoana("Nume", "Prenume");

        System.out.println(persoana);

        Obiect obiect = new Obiect("Obiect");
    }
}
