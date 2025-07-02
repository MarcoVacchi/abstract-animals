package org.lessons.java.animals;

public class Aquila extends AbstractAnimal {
    private int lunghezzaBecco;

    public Aquila(String razza, String colore, int dimensioni, int lunghezzaBecco) {
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
        System.out.println("Crock Crock");
    }

    @Override
    public void mangia() {
        System.out.println("Insetti");
    }
}
