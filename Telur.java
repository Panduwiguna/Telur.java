public class Aplikasi {
    public static void main(String[] args) throws Exception {
    double jumlahTelur, uang, totalBayar, uangKembalian, hargaTelur;
    hargaTelur = 28000.0;
    jumlahTelur = 2.5;
    uang = 100000.0;
    totalBayar = hargaTelur * jumlahTelur;
    uangKembalian = uang - totalBayar;
    
    System.out.println("Satu telur = "+hargaTelur);
    System.out.println("Jumlah telur yang dibeli = "+jumlahTelur+"kg");
    System.out.println("uang = "+uang);
    System.out.println("total biaya = "+totalBayar);
    System.out.println("kembalian = "+uangKembalian);
    }
}
