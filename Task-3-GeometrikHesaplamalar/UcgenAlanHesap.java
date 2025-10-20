public class UcgenAlan {
    public static void main(String[] args) {
    int a = 3;
    int b = 4;
    int c = 5;
    int u = (a + b + c) / 2;
    
    // Alan hesapla
    double alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));
    
    // Sonuclari yazdir
    System.out.println("Alan:" + alan);
    }
}
