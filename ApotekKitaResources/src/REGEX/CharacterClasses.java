package REGEX;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
        Catatan:
        a. Character Classes digunakan untuk
           mencari KARAKTER tertentu dalam sebuah String.
        b. Pilihan fungsinya ada di buku halaman 2.7.
 */
public class CharacterClasses {
    public static void main(String[] args) {
        String text = "[SISWA CCIT]ibu";
        String pattern = "Wibu";
      
        Pattern p = Pattern.compile(text);
        Matcher m = p.matcher(pattern);
        boolean b = m.matches();
        
        if(b){
            System.out.println("Ada Kecocokan");
        }else{
            System.out.println("Tidak Ada Kecocokan");
        }
    }
}
