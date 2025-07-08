package viikko2;

public class Car {
    private String merkki;
    private String malli;
    private int nopeus = 0; // Oletusnopeus on 0 km/h

    public Car(String merkki, String malli) {
        this.merkki = merkki;
        this.malli = malli;
    }

    public void setMerkki(String merkki) {
        this.merkki = merkki;
    }

    public void setMalli(String malli) {
        this.malli = malli;
    }

    public void kiihdyta(int lisays) {
        if (lisays < 0) {
            System.out.println("Nopeuden täytyy olla positiivinen luku.");
            return; // Ei tehdä mitään, jos lisäys on negatiivinen
        }
        nopeus += lisays;
    }

    public void hidasta(int vahennys) {
        if (vahennys < 0) {
            System.out.println("Nopeuden täytyy olla positiivinen luku.");
            return; // Ei tehdä mitään, jos vähennys on negatiivinen
        }
        nopeus -= vahennys;
        if (nopeus < 0) {
            nopeus = 0; // Nopeus ei voi olla negatiivinen
        }
    }
    public void printSpecs() {
        System.out.print("Auton merkki: " + merkki);
        System.out.print(" " + malli);
        System.out.println(", Nopeus: " + nopeus + " km/h");
    }
}
