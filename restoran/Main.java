package restoran;


public class Main {
    public static void main(String[] args) {
        Restoran obj1 = new Restoran();
        obj1.setIme("Korner");
        obj1.setLokacija("Centar");
        obj1.setBrsedista(35);
        obj1.setTelefon("002244551");
        System.out.println("Ime na restoran "+obj1.getIme()+", lokacija "+obj1.getLokacija()+", broj na sedista "+obj1.getBrsedista()+", telefon: "+obj1.getTelefon());
    }
}