/*
Saya Shidiq Arifin Sudrajat [2202152] mengerjakan soal LP2 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin
*/
public class Tabel
{   //Attribut privat
    private int baris;
    private int kolom;

    Tabel()//Konstruktor kosong
    {

    }

    Tabel(int baris, int kolom)//Konstruktor dengan parameter
    {
        this.baris = baris;
        this.kolom = kolom;
    }
    //Getter-Setter
    public int getBaris()
    {
        return baris;
    }

    public void setBaris(int baris)
    {
        this.baris = baris;
    }

    public int getKolom()
    {
        return kolom;
    }
    
    public void setKolom(int kolom)
    {
        this.kolom = kolom;
    }

    public void buatTabel(String[][] isi, int baris, int kolom)
    {
        int i, j, k;//Insialisasi
        int[] terpanjang = new int[kolom];
        //Mencari kata terpanjang
        for(i = 0; i < kolom; i++)
        {
            terpanjang[i] = 0;
            for(j = 0; j < baris; j++)
            {
                if (terpanjang[i] < isi[j][i].length())
                {
                    terpanjang[i] = isi[j][i].length();
                }
            }
        }
        //Tabel bagian atas
        for (i = 0; i < baris; i++)
        {
            for (j = 0; j < kolom; j++)
            {
                for (k = 0; k < terpanjang[j] + 3; k++)
                {
                    System.out.print("-");
                }
            }
            System.out.println("-");
            //Buat baris isi
            for (j = 0; j < kolom; j++)
            {
                System.out.print("| ");
                System.out.print(isi[i][j]);
                for (k = 0; k < terpanjang[j] - isi[i][j].length() + 1; k++)
                {
                    System.out.print(" ");
                }
            }
            System.out.println("|");
        }
        //Tabel bagian paling bawah
        for (j = 0; j < kolom; j++)
        {
            for (k = 0; k < terpanjang[j] + 3; k++)
            {
                System.out.print("-");
            }
        }
        System.out.println("-");
    }
}