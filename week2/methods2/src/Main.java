public class Main {
    public static void main(String[] args) {
    String mesaj="Bugün Hava Çok Güzel.";
    String yeniMesaj = mesaj.substring(0,2);
        System.out.println(yeniMesaj);
    //String yeniMesaj = mesaj.ekle(); yapılmaz.Çünkü String vermek yerine void vermiş oluruz.
        //String yeniMesaj = topla(); yapılmaz.Çünkü String vermek yerine int vermiş oluruz.
        //String yeniMesaj = sehirVer(); yapılabilir.Çünkü String vermiş olduk.
        String yeniSehir = sehirVer();
        System.out.println(yeniSehir);
        int sayi=topla(5,7);
        System.out.println(sayi);
        int sayi2=topla2(1,5,6,3,4,8,9);
        System.out.println(sayi2);
    }

    //void operasyon
    public static void ekle() {
        System.out.println("Eklendi");
    }

    // void operasyon
    public static void sil() {
        System.out.println("Silindi");
    }

    //void operasyon
    public static void guncelle() {
        System.out.println("Güncellendi");
    }
    public static int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
    public static String sehirVer(){
        return "Ankara";
    }
    //Birden Fazla int girmek için --> int... (veriable arguments demek)
    public static int topla2(int... sayilar){
        int toplam=0;
        for(int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
}
