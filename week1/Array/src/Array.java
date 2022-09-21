public class Array {
    public static void main(String[] args){
        String ogr1="Cihat";
        String ogr2="İlker";
        String ogr3="Ziya";
        System.out.println(ogr1);
        System.out.println(ogr2);
        System.out.println(ogr3);
        System.out.println("--------------------------");
        String[] ogrenciler = new String[3];
        ogrenciler[0]="Cihat";
        ogrenciler[1]="İlker";
        ogrenciler[2]="Ziya";

        for (int i=0 ; i< ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
        System.out.println("----------------------");
        for (String student:ogrenciler){
            System.out.println(student);
        }

    }
}
