package avtomobil;

public class Avtomobil {
    private String marka,model,boja;
    private int kilometri;
    public Avtomobil(String marka, String model, String boja, int kilometri)
    {
        this.marka=marka;
        this.model=model;
        this.boja=boja;
        this.kilometri=kilometri;
    }
    public int pomnozi(int a)
    {
        return kilometri*a;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getKilometri() {
        return kilometri;
    }

    public String getBoja() {
        return boja;
    }
}
