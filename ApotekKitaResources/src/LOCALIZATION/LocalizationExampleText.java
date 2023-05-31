package LOCALIZATION;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/*
        Catatan:
        a. Menyesuaikan FORMAT TANGGAL dan MATA UANG tergantung NEGARANYA.
        b. Contoh penentuan NEGARA dengan fungsi Locale l = new Locale("de", "DE");
        c. Contoh di poin B adalah untuk negara German (Deutch).
        d. Anak-anak tercinta bisa cari kode local negara di internet.
 */
public class LocalizationExampleText {
    public static void main(String[] args) {
        // MEMBUAT OBJEK LOKAL ITALIA
        Locale cf_italy = new Locale("it", "IT");
        
        ResourceBundle bdl = ResourceBundle.getBundle("KataKata", cf_italy);
        
        System.out.println("=======OUTPUT=======");
        System.out.println(bdl.getString("pesan_saya"));
    }
}