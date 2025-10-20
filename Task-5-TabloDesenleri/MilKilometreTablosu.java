public class DonusumTablosu {
    public static void main(String[] args) {
    System.out.println("Mil\tKilometre");
    System.out.println("--------------");
    
    double[] milDegerleri = {1, 5, 10, 20, 50};
    double km;
    for (int i = 0; i < milDegerleri.length; i++) {
        km = milDegerleri[i] * 1.609;
        System.out.println(milDegerleri[i] + "\t" + km);
    }
    }
}
