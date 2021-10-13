package PboTuKel;

public class clsMain {

    int JumTiket;
    int Uang;

    // untuk username
    public String IdUser() {

        String IdUser = "admin";
        return IdUser;
    }

    // untuk password
    public String PassUser() {

        String PassUser = "admin";
        return PassUser;
    }

    // Untuk menghitung harga
    public int HitungHarga(){

        return JumTiket*50000;

    }

    // Untuk menghitung kembalian
    public float Kembalian(){

        return Uang-HitungHarga();
    }

}
