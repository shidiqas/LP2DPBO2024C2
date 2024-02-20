/*
Saya Shidiq Arifin Sudrajat [2202152] mengerjakan soal LP2 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin
*/
class Clothing extends Product
{   //Atrributes private
    private String size;
    private String material;
    private String gender;

    public Clothing()//Constructor
    {

    }

    public Clothing(String size, String material, String gender)//Constructor with parameter
    {
        this.size = size;
        this.material = material;
        this.gender = gender;
    }

    //Getter-Setter
    public String getSize()
    {
        return size;
    }

    public void setSize(String size)
    {
        this.size = size;
    }

    public String getMaterial()
    {
        return material;
    }

    public void setMaterial(String material)
    {
        this.material = material;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }
}