public class Product {
    public Product(int id,String name,String description,double price,int stockAmount){
        System.out.println("yapıcı blok çalıştı");
        this.id=id;
        this.name=name;
        this.price=price;
        this.stockAmount=stockAmount;
        this.description=description;
    }

    //    attribute and field
    private String name;
    private String description; // Description = Açıklama
    private double price; //Price = Fiyat
    private int stockAmount; //Stock Amount = Stok Adedi
    private int id;
    //    Bir Class Bir İşi Yapmalı. Attribute Tutan Attribute tutmalı içine Operasyon Eklenmemeli.
    private String kod;

    //Getter and Setter kullanımı:
    // Getter

    // Setter
    public void setId(int id) {
        this.id = id; // _id yi this.id şeklinde yazılabiliriz ama _id daha sağlam olur. this. içinde bulunduğum class demek.
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public int getId() {
        return id;
    }

    public String getKod() {
        return this.name.substring(0,1) + id;
    }


}
