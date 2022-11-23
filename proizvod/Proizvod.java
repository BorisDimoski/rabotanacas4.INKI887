package proizvod;

public class Proizvod {
    private String ime, proizvoditel;
    private int cena, tezina;

    public Proizvod() {
        ime = "Iphone";
        proizvoditel = "apple";
        cena = 1000;
        tezina = 200;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getProizvoditel() {
        return proizvoditel;
    }

    public void setProizvoditel(String proizvoditel) {
        this.proizvoditel = proizvoditel;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public int getTezina() {
        return tezina;
    }

    public void setTezina(int tezina) {
        this.tezina = tezina;
    }
}


