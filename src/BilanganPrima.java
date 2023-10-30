import java.util.ArrayList;
import java.util.List;


public class BilanganPrima {
    /**
     * Memeriksa apakah suatu angka adalah bilangan prima.
     *
     * @param angka Angka yang akan diperiksa.
     * @return true jika angka adalah bilangan prima, false jika tidak.
     */
    public static boolean isPrima(int angka) {
        if (angka <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Mencari bilangan prima dalam rentang tertentu.
     *
     * @param awal  Angka awal rentang.
     * @param akhir Angka akhir rentang.
     * @return Daftar bilangan prima dalam rentang yang ditentukan.
     */
    public static List<Integer> cariPrimaDalamRentang(int awal, int akhir) {
        List<Integer> bilanganPrima = new ArrayList<>();
        for (int angka = awal; angka <= akhir; angka++) {
            if (isPrima(angka)) {
                bilanganPrima.add(angka);
            }
        }
        return bilanganPrima;
    }
}

