/*
Saya Shidiq Arifin Sudrajat [2202152] mengerjakan soal LP2 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin
*/
import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {   //Deklarasi
        int i, n;
        String idProduct, name, brand, price, size, material, gender, color, sleeve_type;

        ArrayList<Shirt> list = new ArrayList<>();//List
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan berapa banyak shirt: ");
        n = sc.nextInt();
        sc.nextLine();

        for (i = 0; i < n; i++)//Perulangan
        {   //Deklarasi untuk masukan list
            Shirt shirt = new Shirt();
            System.out.println("Masukan data untuk baju ke-" + (i+1) + ":");
            System.out.print("Id Product: ");
            idProduct = sc.nextLine();
            System.out.print("Name: ");
            name = sc.nextLine();
            System.out.print("Brand: ");
            brand = sc.nextLine();
            System.out.print("Price: ");
            price = sc.nextLine();
            System.out.print("Size: ");
            size = sc.nextLine();
            System.out.print("Material: ");
            material = sc.nextLine();
            System.out.print("Gender: ");
            gender = sc.nextLine();
            System.out.print("Color: ");
            color = sc.nextLine();
            System.out.print("Sleeve Type: ");
            sleeve_type = sc.nextLine();
            //Memasukan ke list
            shirt.setIdProduct(idProduct);
            shirt.setName(name);
            shirt.setBrand(brand);
            shirt.setPrice(price);
            shirt.setSize(size);
            shirt.setMaterial(material);
            shirt.setGender(gender);
            shirt.setColor(color);
            shirt.setSleeve_type(sleeve_type);

            list.add(shirt);

            System.out.println("\nData berhasil ditambah\n");
        }

        Tabel tab = new Tabel(list.size() + 1, 10);//Instansiasi object tabel

        String[][] isiTabel = new String[list.size() + 1][10];//Instansiasi array isi tabel
        //Header isi tabel
        isiTabel[0][0] = "No";
        isiTabel[0][1] = "Id Product";
        isiTabel[0][2] = "Name";
        isiTabel[0][3] = "Brand";
        isiTabel[0][4] = "Price";
        isiTabel[0][5] = "Size";
        isiTabel[0][6] = "Material";
        isiTabel[0][7] = "Gender";
        isiTabel[0][8] = "Color";
        isiTabel[0][9] = "Sleeve Type";
        //Peulangan unutk memasukan ke array isi tabel
        for (i = 1; i < list.size() + 1; i++)
        {
            isiTabel[i][0] = "" + i;
            isiTabel[i][1] = "" + list.get(i - 1).getIdProduct();
            isiTabel[i][2] = "" + list.get(i - 1).getName();
            isiTabel[i][3] = "" + list.get(i - 1).getBrand();
            isiTabel[i][4] = "" + list.get(i - 1).getPrice();
            isiTabel[i][5] = "" + list.get(i - 1).getSize();
            isiTabel[i][6] = "" + list.get(i - 1).getMaterial();
            isiTabel[i][7] = "" + list.get(i - 1).getGender();
            isiTabel[i][8] = "" + list.get(i - 1).getColor();
            isiTabel[i][9] = "" + list.get(i - 1).getSleeve_type();
        }
        //Membuat tabel
        tab.buatTabel(isiTabel, tab.getBaris(), tab.getKolom());
        //Close scanner
        sc.close();
    }
}