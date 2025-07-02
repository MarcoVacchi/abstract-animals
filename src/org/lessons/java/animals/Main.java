package org.lessons.java.animals;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------- CANE --------------");
        Cane cane = new Cane("Charlie", "Bassotto", "verde", 100, 4);

        System.out.println(cane.getNome());
        cane.dormi();
        cane.verso();
        cane.mangia();

        System.out.println("-------------- PASSEROTTO --------------");
        Passerotto passero = new Passerotto("Uccello lavoratore", "Nero", 20, 10);

        System.out.println(passero.getLunghezzaBecco());
        passero.dormi();
        passero.verso();
        passero.mangia();

        System.out.println("-------------- AQUILA --------------");

        Aquila aquila = new Aquila("Uccello cacciatore", "Nero", 20, 15);

        aquila.getLunghezzaBecco();
        aquila.dormi();
        aquila.verso();
        aquila.mangia();

        System.out.println("-------------- DELFINO --------------");

        Delfino delfino = new Delfino("Marina", "Azzurro", 400, 4);

        delfino.getNumeroPinne();
        delfino.dormi();
        delfino.verso();
        delfino.mangia();
    }

}

// Esercizio 2 : interfacce
// Alcuni degli animali che abbiamo creato volano, altri nuotano.

// Gli animali che volano hanno il seguente metodo :

// - void vola() (mostra a video “Sto volando!!!”)

// Gli animali che nuotano hanno il seguente metodo :

// - void nuota() (mostra a video “Sto nuotando!!!”)

// Creiamo poi una classe Main.java dove:

// Aggiungiamo 2 metodi:

// - void faiVolare(IVolante animale)
// - void faiNuotare(INuotante animale)

// (Dove IVolante e INuotante sono le due interfacce create nell'esercizio 2).
// Questi metodi prendono come parametro un animale che può o volare / nuotare e
// richiamano il corrispondente metodo vola() / nuota().

// Sempre nella classe main, implementiamo il metodo main che istanzi animali
// che volano o nuotano e richiamare i metodi faiVolare / faiNuotare
// passandoglieli come parametro.