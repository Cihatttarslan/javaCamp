public class Main {
    public static void main (String[] args){
    sayiBulmaca();

    }
    public static void sayiBulmaca(){
        int[] sayilar = new int[]{1,2,3,4,6,5,7};
        int aranacakSayi=17;
        boolean varMi=false;
        for (int sayi:sayilar){
            if(sayi==aranacakSayi){
                varMi=true;
                break;
            }
        }
        if(varMi){
            mesajVer(aranacakSayi);
        }
        else {
            mesajVer("Sayı Mevcut Değildir:" + aranacakSayi);
        }
    }
    //Parametreli Method (int aranacakSayi) --> mesajVer(aranacakSayi);
    public static void mesajVer(int aranacakSayi){
        System.out.println("Sayı mevcuttur ve sayı:" + aranacakSayi );
    }
    // String
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}
