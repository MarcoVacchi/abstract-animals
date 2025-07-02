package org.lessons.java.animals;

public class Delfino extends AbstractAnimal implements INuotante {
    private int numeroPinne;

    public Delfino(String razza, String colore, int dimensioni, int numeroPinne) {
        super(razza, colore, dimensioni);
        this.numeroPinne = numeroPinne;
    }

    public int getNumeroPinne() {
        return this.numeroPinne;
    }

    public void setNumeroPinne(int numeroPinne) {
        this.numeroPinne = numeroPinne;
    }

    @Override
    public void dormi() {
        System.out.println("Zzz");
    }

    @Override
    public void verso() {
        System.out.println("Non so che verso faccia");
    }

    @Override
    public void mangia() {
        System.out.println("Pesci");
    }

    @Override
    public String faiNuotare() {
        return "Sto nuotando!!!";
    }
}
