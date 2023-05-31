package TYPECASTING;

public class TypeCastingPrimitiveDataTypes {
    static int nilai = 10;
    
    public static void main(String[] args) {
        // BAGIAN IMPLICIT TYPES CASTING
        long nilai_baru = nilai;
        /*
        Catatan:
        a. Pada contoh diatas, kita melakukan casting nilai tipe data INTEGER
           menjadi LONG.
        b. Untuk types casting tipe ini MENGIZINKAN  konversi suatu tipe data
           ke bentuk lainnya SELAMA KEDUA TIPE DATA COMPATIBLE (COCOK)
           seperti halnya INTEGER dan LONG
        */
        
        // BAGIAN EXPLICIT TYPES CASTING
        byte nilai_baru_lagi = (byte) nilai;
        /*
        Catatan:
        a. Pada contoh diatas, kita melakukan casting nilai tipe data INTEGER
           menjadi BYTE.
        b. Untuk types casting tipe ini adalah KETIKA sebuah tipe data TIDAK BISA
           DIKONVERSI secara IMPLICIT.
        c. Contoh diatas INTEGER tidak cocok dikonversi IMPLICIT ke BYTE karena
           tipe INTEGER lebih besar dari tipe BYTE.
        d. That's why kita pakai cara EXPLICIT dengan penanda (byte) dibaris 19.
        */
    }
}
