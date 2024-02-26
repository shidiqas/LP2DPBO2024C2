/*
Saya Shidiq Arifin Sudrajat [2202152] mengerjakan soal LP2 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin
*/
#include <iostream>
#include <string>
#include <vector>

using namespace std;

class Tabel
{
    private: // Attributes
        int baris;
        int kolom;

    public:
        Tabel() {} // Empty constructor

        Tabel(int baris, int kolom) { // Constructor with parameters
            this->baris = baris;
            this->kolom = kolom;
        }

        // Getters and Setters
        int getBaris() {
            return baris;
        }

        void setBaris(int baris) {
            this->baris = baris;
        }

        int getKolom() {
            return kolom;
        }

        void setKolom(int kolom) {
            this->kolom = kolom;
        }

        void buatTabel(vector<vector<string>> isi, int baris, int kolom) 
        {
            vector<int> terpanjang(kolom, 0); //Inisialisasi
            int i, j, k;
            //Mencari kata terpanjang
            for (i = 0; i < kolom; i++)
            {
                for (j = 0; j < baris; j++)
                {
                    if (terpanjang[i] < isi[j][i].length())
                    {
                        terpanjang[i] = isi[j][i].length();
                    }
                }
            }
            //Bagian atas tabel
            for (i = 0; i < baris; i++)
            {
                for (j = 0; j < kolom; j++)
                {
                    for (k = 0; k < terpanjang[j] + 3; k++)
                    {
                        cout << "-";
                    }
                }
                cout << "-" << endl;
                //Isi tabel
                for (j = 0; j < kolom; j++)
                {
                    cout << "| " << isi[i][j];
                    for (k = 0; k < terpanjang[j] - isi[i][j].length() + 1; k++)
                    {
                        cout << " ";
                    }
                }
                cout << "|" << endl;
            }
            //Bagian paling bawah tabeh
            for (j = 0; j < kolom; j++) 
            {
                for (k = 0; k < terpanjang[j] + 3; k++)
                {
                    cout << "-";
                }
            }
            cout << "-" << endl;
        }
};