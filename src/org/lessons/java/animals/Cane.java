package org.lessons.java.animals;

public class Cane extends AbstractAnimal {
    private String nome;
    private int zampe;

    public Cane(String nome, String razza, String colore, int dimensioni, int zampe) {
        super(razza, colore, dimensioni);
        this.nome = nome;
        this.zampe = zampe;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getZampe() {
        return this.zampe;
    }

    public void setZampe(int zampe) {
        this.zampe = zampe;
    }

    @Override
    public void dormi() {
        System.out.println("Zzz");
    }

    @Override
    public void verso() {
        System.out.println("BauBau");
    }

    @Override
    public void mangia() {
        System.out.println("Croccantini");
    }
}
