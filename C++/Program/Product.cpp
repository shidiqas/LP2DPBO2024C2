/*
Saya Shidiq Arifin Sudrajat [2202152] mengerjakan soal LP2 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin
*/
#include <iostream>
#include <string>

using namespace std;

class Product
{
    private: // Attributes
        string idProduct;
        string name;
        string brand;
        string price;

    public:
        Product() {} // Constructor

        Product(string idProduct, string name, string brand, string price) // Constructor with parameters
            : idProduct(idProduct), name(name), brand(brand), price(price) {}

        // Getters and Setters
        string getIdProduct() {
            return idProduct;
        }

        void setIdProduct(string idProduct) {
            this->idProduct = idProduct;
        }

        string getName() {
            return name;
        }

        void setName(string name) {
            this->name = name;
        }

        string getBrand() {
            return brand;
        }

        void setBrand(string brand) {
            this->brand = brand;
        }

        string getPrice() {
            return price;
        }

        void setPrice(string price) {
            this->price = price;
        }
};