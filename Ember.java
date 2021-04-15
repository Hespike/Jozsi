public class Ember {
    String nev;
    int kor;
    boolean ferfi;

    public void koszon() {
        System.out.println("Szia! " + nev + " vagyok és " + kor + " éves, mellesleg " + (ferfi ? "férfi." : "nő."));
    }
    public Ember(String nev, int kor, boolean ferfi) {
        this.nev = nev;
        this.kor = kor;
        this.ferfi = ferfi;


    }
}
