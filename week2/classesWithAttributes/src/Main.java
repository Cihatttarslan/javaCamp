public class Main {
    public static void main(String[] args) {
        Product product = new Product(12345,"Laptop","Asus X Serisi",7500,3);
//        product.setName("Laptop ");
//        product.setId(123456);
//        product.setDescription ("Asus Laptop X Serisi ");
//        product.setPrice (13500);
//        product.setStockAmount(25);



        ProductManager productManager = new ProductManager();
        productManager.Add(product); //Doğru Kullanım. Yeni eklenen olursa Sıkıntı olmaz.
        //Hatalı Kullanım Aşağıdaki gibidir.Dinamik olmaz. ProductManager içindeki Add2 ye ekleme yapılırsa aşağıdaki çalışmaz.
//        productManager.Add2(1, "", "", 2, 200);
//        productManager.Add2(1, "", "", 2, 200);
//        productManager.Add2(1, "", "", 2, 200);
//        productManager.Add2(1, "", "", 2, 200);
//        productManager.Add2(1, "", "", 2, 200);
        System.out.println(product.getKod());

    }
}
