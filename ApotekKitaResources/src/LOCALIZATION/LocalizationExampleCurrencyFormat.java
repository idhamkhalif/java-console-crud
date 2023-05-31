package LOCALIZATION;

import java.text.NumberFormat;
import java.util.Locale;

/*
        Catatan:
        a. Menyesuaikan FORMAT TANGGAL dan MATA UANG tergantung NEGARANYA.
        b. Contoh penentuan NEGARA dengan fungsi Locale l = new Locale("de", "DE");
        c. Contoh di poin B adalah untuk negara German (Deutch).
        d. Anak-anak tercinta bisa cari kode local negara di internet.
 */
public class LocalizationExampleCurrencyFormat {
    public static void main(String[] args) {
        // MEMBUAT OBJEK LOKAL UK
        NumberFormat cf_UK =
        NumberFormat.getCurrencyInstance(Locale.UK);
        // MEMBUAT OBJEK LOKAL KOREA
        NumberFormat cf_KOREA =
        NumberFormat.getCurrencyInstance(Locale.KOREA);
        // MEMBUAT OBJEK LOKAL FRENCH
        NumberFormat cf_FRENCH =
        NumberFormat.getCurrencyInstance(Locale.FRENCH);
        
        // INISIALISASI
        String formatUK = cf_UK.format(391000319);
        String formatKOREA = cf_KOREA.format(391000319);
        String formatFRENCH = cf_FRENCH.format(391000319);
        
        System.out.println("=======Format Mata Uang di UK=======");
        System.out.println(formatUK);
        System.out.println("\n");
        
        System.out.println("=======Format Mata Uang di KOREA=======");
        System.out.println(formatKOREA);
        System.out.println("\n");
        
        System.out.println("=======Format Mata Uang di FRENCH=======");
        System.out.println(formatFRENCH);
        System.out.println("\n");
    }
}