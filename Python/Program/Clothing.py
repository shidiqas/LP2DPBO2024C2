#Saya Shidiq Arifin Sudrajat [2202152] mengerjakan soal LP2 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
#untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin

from Product import Product

class Clothing(Product):
    #Konstructor
    def __init__(self, size="", material="", gender=""):
        super().__init__()  #Memanggil konstruktor kelas induk
        self.size = size
        self.material = material
        self.gender = gender

    #Getter-Setter
    def getSize(self):
        return self.size

    def setSize(self, size):
        self.size = size

    def getMaterial(self):
        return self.material

    def setMaterial(self, material):
        self.material = material

    def getGender(self):
        return self.gender

    def setGender(self, gender):
        self.gender = gender
