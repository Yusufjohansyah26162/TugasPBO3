abstract class BangunDatar {
    abstract double luas();
    abstract double keliling();
}

class BujurSangkar extends BangunDatar {
    private double sisi;

    public BujurSangkar(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double luas() {
        return sisi * sisi;
    }

    @Override
    double keliling() {
        return 4 * sisi;
    }
}

class PersegiPanjang extends BangunDatar {
    private double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    double luas() {
        return panjang * lebar;
    }

    @Override
    double keliling() {
        return 2 * (panjang + lebar);
    }
}

class Segitiga extends BangunDatar {
    private double alas, tinggi, sisi1, sisi2, sisi3;

    public Segitiga(double alas, double tinggi, double sisi1, double sisi2, double sisi3) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    @Override
    double luas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    double keliling() {
        return sisi1 + sisi2 + sisi3;
    }
}

public class Main {
    public static void main(String[] args) {
        BujurSangkar bujurSangkar = new BujurSangkar(4);
        System.out.println("Luas Bujur Sangkar: " + bujurSangkar.luas());
        System.out.println("Keliling Bujur Sangkar: " + bujurSangkar.keliling());

        PersegiPanjang persegiPanjang = new PersegiPanjang(5, 3);
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.luas());
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.keliling());

        Segitiga segitiga = new Segitiga(6, 4, 3, 4, 5);
        System.out.println("Luas Segitiga: " + segitiga.luas());
        System.out.println("Keliling Segitiga: " + segitiga.keliling());
    }
}
