package covek;

public class Main {
    public static void main(String[] args) {

        Covek obj1 = new Covek();
        obj1.setIme("Boris");
        obj1.setPrezime("Dimoski");
        obj1.setMaticen(1235677);
        System.out.println(obj1.getIme()+" "+obj1.getPrezime()+" "+obj1.getMaticen());
    }
}