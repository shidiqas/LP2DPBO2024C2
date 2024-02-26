#Saya Shidiq Arifin Sudrajat [2202152] mengerjakan soal LP2 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
#untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin

class Product:
    #Konstruktor
    def __init__(self, idProduct="", name="", brand="", price=""):
        self.idProduct = idProduct
        self.name = name
        self.brand = brand
        self.price = price

    # Getter-Setter
    def getIdProduct(self):
        return self.idProduct

    def setIdProduct(self, idProduct):
        self.idProduct = idProduct

    def getName(self):
        return self.name

    def setName(self, name):
        self.name = name

    def getBrand(self):
        return self.brand

    def setBrand(self, brand):
        self.brand = brand

    def getPrice(self):
        return self.price

    def setPrice(self, price):
        self.price = price