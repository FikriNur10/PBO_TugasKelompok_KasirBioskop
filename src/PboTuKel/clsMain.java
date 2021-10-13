package PboTuKel;

public class clsMain {

    String IdUser;
    String PassUser;
    int JumTiket;
    int Total;
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

    public int HitungHarga(){

        return JumTiket*50000;

    }
    public float Kembalian(){

        return Uang-HitungHarga();
    }

}
