/*
Saya Shidiq Arifin Sudrajat [2202152] mengerjakan soal LP2 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin
*/
#include <iostream>
#include <string>
#include "Clothing.cpp"

using namespace std;

class Shirt : public Clothing
{
    private: // Attributes
        string color;
        string sleeve_type;

    public:
        Shirt() {} // Constructor

        Shirt(string color, string sleeve_type) // Constructor with parameters
            : color(color), sleeve_type(sleeve_type) {}

        // Getters and Setters
        string getColor() {
            return color;
        }

        void setColor(string color) {
            this->color = color;
        }

        string getSleeveType() {
            return sleeve_type;
        }

        void setSleeveType(string sleeve_type) {
            this->sleeve_type = sleeve_type;
        }
};