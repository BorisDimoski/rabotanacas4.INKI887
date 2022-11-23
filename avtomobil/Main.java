package avtomobil;



public class Main {
    public static void main(String[] args) {
      int n=5;
      Avtomobil obj = new Avtomobil("BMW","M230i","crna",400);
      System.out.println(obj.getMarka()+" "+obj.getModel()+" "+obj.getBoja()+" "+obj.getKilometri());
      System.out.println("Km pomnozeni so "+n+": " +obj.pomnozi(n));
    }
}