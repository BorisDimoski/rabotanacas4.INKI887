package restoran;

public class Restoran {
    private String ime,lokacija, telefon;
    private int brsedista;
    public void setIme(String ime)
    {
        this.ime=ime;
    }
    public String getIme()
    {
        return ime;
    }
    public void setLokacija(String lokacija)
    {
        this.lokacija=lokacija;
    }
    public String getLokacija()
    {
        return lokacija;
    }
    public void setTelefon(String telefon)
    {
        this.telefon=telefon;
    }
    public String getTelefon()
    {
        return telefon;
    }
    public void setBrsedista(int brsedista)
    {
        this.brsedista=brsedista;
    }
    public int getBrsedista()
    {
        return brsedista;
    }
}
