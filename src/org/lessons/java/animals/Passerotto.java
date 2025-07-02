package org.lessons.java.animals;

public class Passerotto extends AbstractAnimal implements IVolante {
    private int lunghezzaBecco;

    public Passerotto(String razza, String colore, int dimensioni, int lunghezzaBecco) {
        super(razza, colore, dimensioni);
        this.lunghezzaBecco = lunghezzaBecco;
    }

    public int getLunghezzaBecco() {
        return this.lunghezzaBecco;
    }

    public void getLunghezzaBecco(int lunghezzaBecco) {
        this.lunghezzaBecco = lunghezzaBecco;
    }

    @Override
    public void dormi() {
        System.out.println("Zzz");
    }

    @Override
    public void verso() {
        System.out.println("Cinguettio");
    }

    @Override
    public void mangia() {
        System.out.println("Vermi");
    }

    @Override
    public String faiVolare() {
        return "Sto volando!!!";
    }
}
