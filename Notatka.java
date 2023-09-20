public class Notatka {
    private static int notatkaLicznik;
    private int identyfikator;
    protected String tytul;
    protected String tresc;

    public Notatka(int identyfikator, String tytul, String tresc) {
        notatkaLicznik++;
        identyfikator = notatkaLicznik;
        this.tytul = tytul;
        this.tresc = tresc;
    }
    public void  wyswietlTytulTresc()
    {
        System.out.println("tytol "+tytul+" tresc "+tresc);

    }
    public void
    {
        System.out.println(tytul+", "+tresc+", "+", "+notatkaLicznik);

    }
}

