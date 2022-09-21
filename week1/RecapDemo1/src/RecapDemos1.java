public class RecapDemos1 {
    public static void main(String[] args) {
        int sayi1=1;
        int sayi2=3;
        int sayi3=15;
        int enbuyuk=sayi1;
        if (enbuyuk<sayi2){
            enbuyuk=sayi2;
        }
        if (enbuyuk<sayi3){
            enbuyuk=sayi3;
        }
        System.out.println("En Büyük Sayı= " + enbuyuk);
    }
}
