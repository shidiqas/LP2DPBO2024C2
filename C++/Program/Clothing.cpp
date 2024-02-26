/*
Saya Shidiq Arifin Sudrajat [2202152] mengerjakan soal LP2 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin
*/
#include <iostream>
#include <string>
#include "Product.cpp"

using namespace std;

class Clothing : public Product 
{
    private: // Attributes
        string size;
        string material;
        string gender;

    public:
        Clothing()// Constructor
        {

        }

        Clothing(string size, string material, string gender) // Constructor with parameters
            : size(size), material(material), gender(gender) {}

        // Getters and Setters
        string getSize()
        {
            return size;
        }

        void setSize(string size)
        {
            this->size = size;
        }

        string getMaterial()
        {
            return material;
        }

        void setMaterial(string material)
        {
            this->material = material;
        }

        string getGender()
        {
            return gender;
        }

        void setGender(string gender)
        {
            this->gender = gender;
        }

        //Destructor
        ~Clothing()
        {
            
        }
};