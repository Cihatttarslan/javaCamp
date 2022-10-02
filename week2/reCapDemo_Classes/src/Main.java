public class Main {
    public static void main(String[] args){
        DortIslem dortIslem = new DortIslem();
        int sonucToplama=dortIslem.Topla(5,7);
        System.out.println("Toplama İşlemi Sonucu: " + sonucToplama);
        int sonucCikarma=dortIslem.Cikar(5,7);
        System.out.println("Çıkarma İşlemi Sonucu: " + sonucCikarma);
        int sonucCarpma=dortIslem.Carpma(5,7);
        System.out.println("Çıkarma İşlemi Sonucu: " + sonucCarpma);
        int sonucBolme=dortIslem.Bolme(5,7);
        System.out.println("Çıkarma İşlemi Sonucu: " + sonucBolme);
    }
}
