/*
Saya Shidiq Arifin Sudrajat [2202152] mengerjakan soal LP2 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin
*/
#include <bits/stdc++.h>
#include "Shirt.cpp"
#include "Tabel.cpp"

int main() 
{
    int n;//Banyaknya data
    string idProduct, name, brand, price, size, material, gender, color, sleeve_type;//Inisialisasi

    vector<Shirt> list;//list
    Tabel tab;//tabel

    cout << "Masukkan berapa banyak shirt: ";//Masukan banyaknya data
    cin >> n;
    cin.ignore();

    for (int i = 0; i < n; i++)//Perulangan untuk memasukan data
    {
        Shirt shirt;
        cout << "Masukkan data untuk baju ke-" << (i + 1) << ":" << endl;
        cout << "Id Product: ";
        getline(cin, idProduct);
        cout << "Name: ";
        getline(cin, name);
        cout << "Brand: ";
        getline(cin, brand);
        cout << "Price: ";
        getline(cin, price);
        cout << "Size: ";
        getline(cin, size);
        cout << "Material: ";
        getline(cin, material);
        cout << "Gender: ";
        getline(cin, gender);
        cout << "Color: ";
        getline(cin, color);
        cout << "Sleeve Type: ";
        getline(cin, sleeve_type);

        shirt.setIdProduct(idProduct);
        shirt.setName(name);
        shirt.setBrand(brand);
        shirt.setPrice(price);
        shirt.setSize(size);
        shirt.setMaterial(material);
        shirt.setGender(gender);
        shirt.setColor(color);
        shirt.setSleeveType(sleeve_type);

        list.push_back(shirt);

        cout << "\nData berhasil ditambah\n";
    }

    //Tabel
    vector<vector<string>> isiTabel;
    isiTabel.push_back({"No", "Id Product", "Name", "Brand", "Price", "Size", "Material", "Gender", "Color", "Sleeve Type"});

    for (int i = 0; i < list.size(); i++)
    {
        vector<string> row;
        row.push_back(to_string(i + 1));
        row.push_back(list[i].getIdProduct());
        row.push_back(list[i].getName());
        row.push_back(list[i].getBrand());
        row.push_back(list[i].getPrice());
        row.push_back(list[i].getSize());
        row.push_back(list[i].getMaterial());
        row.push_back(list[i].getGender());
        row.push_back(list[i].getColor());
        row.push_back(list[i].getSleeveType());
        isiTabel.push_back(row);
    }

    tab.buatTabel(isiTabel, list.size() + 1, 10);//Membuat tabel

    return 0;
}