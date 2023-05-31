package REGEX;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
        Catatan:
        a. Regex digunakan biasanya untuk fungsi CARI.
        b. Class yang kita gunakan di Java adalah Pattern dan Matcher.
        c. Package yang digunakan adalah java.util.regex.
        d. Pattern untuk MENCARI pola suatu String.
        e. Matcher untuk mengembalikan nilai KECOCOKAN String dalam boolean.
        f. Macam-macam pilihan fungsi Pattern ada di buku halaman 2.4.
        g. Macam-macam pilihan fungsi Matcher ada di buku halaman 2.5.
 */
public class RegexExample {

    public static void main(String[] args) {
        // String yang akan kita cari PATTERNYA.
      String text = "Siswa CCIT itu ada dua jenis, WIBU atau WIBU DENIAL, "
              + "Hanya itu!";
      String pattern = "[wibu]";

      // MEMMBUAT OBJEK PATTERN
      Pattern p = Pattern.compile(pattern);

      // MEMBUAT OBJEK MATCHER
      Matcher m = p.matcher(text);
      if (m.find( )) {
         System.out.println("Kata "+pattern+" Ditemukan!!!");
      }else {
         System.out.println("NO MATCH");
      }
    }
}
