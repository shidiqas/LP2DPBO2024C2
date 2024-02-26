#Saya Shidiq Arifin Sudrajat [2202152] mengerjakan soal LP2 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
#untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin

from Clothing import Clothing

class Shirt(Clothing):
    #Konstruktor
    def __init__(self, color="", sleeve_type=""):
        super().__init__() #Memanggil konstruktor kelas induk
        self.color = color
        self.sleeve_type = sleeve_type

    # Getter-Setter
    def getColor(self):
        return self.color

    def setColor(self, color):
        self.color = color

    def getSleeve_type(self):
        return self.sleeve_type

    def setSleeve_type(self, sleeve_type):
        self.sleeve_type = sleeve_type
