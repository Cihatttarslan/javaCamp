public class Switch {
    public static void main(String[] args) {
        char not='B';
        switch (not){
            case 'A':
                System.out.println("Mükemmel... Geçtiniz.");
                break;
            case 'B':
                System.out.println("Çok Güzel... Geçtiniz.");
                break;
            case 'C':
                System.out.println("Güzel... Geçtiniz.");
                break;
            case 'D':
                System.out.println("Şartlı... Geçtiniz.");
                break;
            case 'F':
                System.out.println("Maalesef... Kaldınız.");
                break;
        }
    }
}
