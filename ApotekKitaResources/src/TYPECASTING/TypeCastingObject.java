package TYPECASTING;

public class TypeCastingObject {

    /*
        Catatan:
        a. Object Types Casting tergantung pada HIRARKI class.
        b. Setiap objek yang digunakan berlaku layaknya objek pada umumnya.
        c. Ada dua jenis, yakni UPCASTING dan DOWNCASTING.
        d. UPCASTING adalah Types Casting dari SUBCLASS ke SUPERCLASS.
        e. DOWNCASTING adalah Types Casting dari SUPERCLASS ke SUBCLASS.
     */

    public static void main(String[] args) {
        siswaCCIT obj_ccit_satu = new siswaCCIT();
        siswaCCIT obj_ccit_dua = new siswaCCIT();
        siswaNextG obj_NextG = new siswaNextG();
        siswaNAP obj_NAP = new siswaNAP();

        // BAGIAN UPCASTING
        System.out.print("=========UPCASTING OUTPUT=========\n");
        obj_ccit_satu = obj_NextG;
        System.out.print("SATU: ");
        obj_ccit_satu.fokusAjar();
        
        obj_ccit_dua = obj_NAP;
        System.out.print("DUA: ");
        obj_ccit_dua.fokusAjar();

        // BAGIAN DOWNCASTING
        System.out.print("\n=========UPCASTING OUTPUT=========\n");
        obj_ccit_satu = new siswaNextG();
        obj_ccit_dua = new siswaNAP();

        siswaCCIT obj_ccit_tiga = new siswaCCIT();
        obj_NextG = (siswaNextG) obj_ccit_satu;
        System.out.print("TIGA: ");
        obj_NextG.fokusAjar();
        
        obj_NAP = (siswaNAP) obj_ccit_dua;
        System.out.print("EMPAT: ");
        obj_NAP.fokusAjar();

        System.out.println("\n");
        obj_ccit_tiga.fokusAjar();
    }
}

class siswaCCIT {

    public void functionCCIT() {
        System.out.println("INI FUNGSI CCIT");
    }

    public void fokusAjar() {
        System.out.println("Belajar Tentang Perkembangan IT dan Implementasinya");
    }
}

class siswaNextG extends siswaCCIT {

    public void functionNextG() {
        System.out.println("INI FUNGSI NextG");
    }

    public void fokusAjar() {
        System.out.println("Fokus ke Pengembangan Aplikasi");
    }
}

class siswaNAP extends siswaCCIT {

    public void functionNAP() {
        System.out.println("INI FUNGSI NAP");
    }

    public void fokusAjar() {
        System.out.println("Fokus ke Pengembangan Jaringan");
    }
}
