/*
Saya Shidiq Arifin Sudrajat [2202152] mengerjakan soal LP2 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin
*/
class Shirt extends Clothing
{   //Attributes private
    private String color;
    private String sleeve_type;

    public Shirt()//Constructor
    {

    }

    public Shirt(String color, String sleeve_type)//Constructor with parameter
    {
        this.color = color;
        this.sleeve_type = sleeve_type;
    }

    //Getter-Setter
    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getSleeve_type()
    {
        return sleeve_type;
    }

    public void setSleeve_type(String sleeve_type)
    {
        this.sleeve_type = sleeve_type;
    }
}
