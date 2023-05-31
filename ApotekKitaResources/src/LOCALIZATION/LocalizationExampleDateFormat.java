package LOCALIZATION;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/*
        Catatan:
        a. Menyesuaikan FORMAT TANGGAL dan MATA UANG tergantung NEGARANYA.
        b. Contoh penentuan NEGARA dengan fungsi Locale l = new Locale("de", "DE");
        c. Contoh di poin B adalah untuk negara German (Deutch).
        d. Anak-anak tercinta bisa cari kode local negara di internet.
 */
public class LocalizationExampleDateFormat {
    public static void main(String[] args) {
        // MEMBUAT OBJEK LOKAL GERMANY
        DateFormat df_deutch =
        DateFormat.getDateInstance(DateFormat.LONG, new Locale("de", "DE"));
        // MEMBUAT OBJEK LOKAL ARABIC
        DateFormat df_arab =
        DateFormat.getDateInstance(DateFormat.LONG, new Locale("ar", "AR"));
        // MEMBUAT OBJEK LOKAL JEPANG
        DateFormat df_japan =
        DateFormat.getDateInstance(DateFormat.LONG, new Locale("ja", "JP"));
        
        // INISIALISASI NILAI TANGGAL GERMANY
        String tanggal_germany = df_deutch.format(new Date());
        // INISIALISASI NILAI TANGGAL GERMANY
        String tanggal_arab = df_arab.format(new Date());
        // INISIALISASI NILAI TANGGAL GERMANY
        String tanggal_jepang = df_japan.format(new Date());
        
        System.out.println("=======Format Tanggal di Germany=======");
        System.out.println(tanggal_germany);
        System.out.println("\n");
        
        System.out.println("=======Format Tanggal di Arab=======");
        System.out.println(tanggal_arab);
        System.out.println("\n");
        
        System.out.println("=======Format Tanggal di Jepang=======");
        System.out.println(tanggal_jepang);
        System.out.println("\n");
    }
}
