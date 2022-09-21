public class miniProje5 {
    public static void main(String[] args){
        int[] sayilar=new int[] {1,2,5,7,9,0};
        int aranacak=5;
        boolean varMi=true;
        for(int sayi:sayilar){
            if(sayi==aranacak){
                varMi=true;
                break;
            }

        }
        if(varMi==true){
            System.out.println("Sayı mevcuttur.");
        }
        else {
            System.out.println("Sayı mevcut değildir.");
        }

    }

}
