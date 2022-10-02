public class Main {
    public static void main(String[] args){
//        OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
//        ogretmenKrediManager.Hesapla();
//        KrediUI krediUI=new KrediUI();
//        krediUI.KrediHesapla(new OgretmenKrediManager());
//        KrediUI krediUI2=new KrediUI();
//        krediUI2.KrediHesapla(new TarimKrediManager());
        KrediUI krediUI=new KrediUI();
        krediUI.KrediHesapla(new BaseKrediManager());
        krediUI.KrediHesapla(new TarimKrediManager());
        krediUI.KrediHesapla(new OgretmenKrediManager());
        krediUI.KrediHesapla(new AskerKrediManager());
    }
}
