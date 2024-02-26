#Saya Shidiq Arifin Sudrajat [2202152] mengerjakan soal LP2 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
#untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin

class Tabel:
    #Konstruktor dengan parameter
    def __init__(self, baris=0, kolom=0):
        self.baris = baris
        self.kolom = kolom

    # Getter-Setter
    def getBaris(self):
        return self.baris

    def setBaris(self, baris):
        self.baris = baris

    def getKolom(self):
        return self.kolom

    def setKolom(self, kolom):
        self.kolom = kolom

    def buatTabel(self, isi):
        terpanjang = [0] * self.kolom  # Inisialisasi
        # Mencari kata terpanjang
        for i in range(self.kolom):
            for j in range(self.baris):
                if len(isi[j][i]) > terpanjang[i]:
                    terpanjang[i] = len(isi[j][i])
        # Tabel bagian atas
        for i in range(self.baris):
            for j in range(self.kolom):
                print("-" * (terpanjang[j] + 3), end="")
            print("-")
            # Buat baris isi
            for j in range(self.kolom):
                print("|", isi[i][j], end="")
                print(" " * (terpanjang[j] - len(isi[i][j]) + 1), end="")
            print("|")
        # Tabel bagian paling bawah
        for j in range(self.kolom):
            print("-" * (terpanjang[j] + 3), end="")
        print("-")