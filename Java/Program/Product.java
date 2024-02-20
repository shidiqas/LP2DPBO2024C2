/*
Saya Shidiq Arifin Sudrajat [2202152] mengerjakan soal LP2 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin
*/
class Product
{   //Attributes private
    private String idProduct;
    private String name;
    private String brand;
    private String price;

    public Product()//Constructor
    {

    }

    public Product(String idProduct, String name, String brand, String price)//Constructor with parameter
    {
        this.idProduct = idProduct;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    //Getter-Setter
    public String getIdProduct()
    {
        return idProduct;
    }

    public void setIdProduct(String idProduct)
    {
        this.idProduct = idProduct;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public String getPrice()
    {
        return price;
    }

    public void setPrice(String price)
    {
        this.price = price;
    }
}
