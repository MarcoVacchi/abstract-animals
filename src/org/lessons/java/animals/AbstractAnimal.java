package org.lessons.java.animals;

public abstract class AbstractAnimal {
    protected String nome;
    protected String razza;
    protected String colore;
    protected int dimensioni;

    public AbstractAnimal(String razza, String colore, int dimensioni) {

        this.razza = razza;
        this.colore = colore;
        this.dimensioni = dimensioni;
    }

    public String getRazza() {
        return "Razza: " + this.razza;
    }

    public void setRazza(String razza) {
        this.razza = razza;
    }

    public String getColore() {
        return "Colore: " + this.colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public int getDimensioni() {
        return this.dimensioni;
    }

    public void setDimensioni(int dimensioni) {
        this.dimensioni = dimensioni;
    }

    public abstract void dormi();

    public abstract void verso();

    public abstract void mangia();
}
