package REGEX;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
        Catatan:
        a. Digunakan untuk menghitung JUMLAH berapa kali sebuah KARAKTER muncul.
 */
public class Quantifiers {
    public static void main(String[] args) {
        String text = "Siswa CCIT itu ada dua jenis, "
                + "WIBU atau WIBU DENIAL, Hanya itu!";
        // MEMOTONG ISI TEXT PER-SPASI
        String potonganKata[] = text.split(" ");

      /*
        MEMMBUAT OBJEK PATTERN YANG MENAMPUNG KATA
        YANG MENGANDUNG KARAKTER YANG DICARI YAKNI KATA "WI".
      */
      Pattern p = Pattern.compile("WI.+");
      for(int i=0; i<potonganKata.length; i++){
          Matcher m = p.matcher(potonganKata[i]);
          boolean b = m.matches();
          if(b){
            System.out.println("Ketemu kata 'WI'");
        }else{
            System.out.println("Tidak Ketemu kata 'WI'");
        }
      }
    }
}
