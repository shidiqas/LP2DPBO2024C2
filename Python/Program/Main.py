#Saya Shidiq Arifin Sudrajat [2202152] mengerjakan soal LP2 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
#untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin

from Shirt import Shirt
from Tabel import Tabel

# Deklarasi
n = int(input("Masukan berapa banyak shirt: "))
list_shirts = []

for i in range(n):  # Perulangan
    # Input data baju
    print(f"Masukan data untuk baju ke-{i+1}:")
    idProduct = input("Id Product: ")
    name = input("Name: ")
    brand = input("Brand: ")
    price = input("Price: ")
    size = input("Size: ")
    material = input("Material: ")
    gender = input("Gender: ")
    color = input("Color: ")
    sleeve_type = input("Sleeve Type: ")

    # Membuat objek Shirt dan menambahkannya ke list
    shirt = Shirt()
    shirt.setIdProduct(idProduct)
    shirt.setName(name)
    shirt.setBrand(brand)
    shirt.setPrice(price)
    shirt.setSize(size)
    shirt.setMaterial(material)
    shirt.setGender(gender)
    shirt.setColor(color)
    shirt.setSleeve_type(sleeve_type)

    list_shirts.append(shirt)

    print("\nData berhasil ditambah\n")

# Instansiasi objek tabel
tab = Tabel(len(list_shirts) + 1, 10)

# Membuat array isi tabel
isiTabel = [["No", "Id Product", "Name", "Brand", "Price", "Size", "Material", "Gender", "Color", "Sleeve Type"]]
for i, shirt in enumerate(list_shirts, 1):
    isiTabel.append([str(i), shirt.getIdProduct(), shirt.getName(), shirt.getBrand(), shirt.getPrice(),
                        shirt.getSize(), shirt.getMaterial(), shirt.getGender(), shirt.getColor(),
                        shirt.getSleeve_type()])

# Membuat tabel
tab.buatTabel(isiTabel)