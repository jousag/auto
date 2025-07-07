package viikko2;

public class Car {
    private String merkki;
    private String malli;
    private int nopeus;

    public Car(String merkki, String malli, int nopeus) {
        this.merkki = merkki;
        this.malli = malli;
        this.nopeus = 0;
    }

    public String getMerkki() {
        return merkki;
    }

    public void setMerkki(String merkki) {
        this.merkki = merkki;
    }

    public String getMalli() {
        return malli;
    }

    public void setMalli(String malli) {
        this.malli = malli;
    }

    public int getNopeus() {
        return nopeus;
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
