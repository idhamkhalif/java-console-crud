package GENERICCLASSES;

/*
Catatan:
        a. Generic Class bisa mengembalikan berbagai tipe data objek.
        b. Generic berarti tipe parameter yang bisa digunakan berbagai tipe objek.
        c. Mengizinkan programmer untuk melakukan generalisasi Class.
        d. Secara sederhana, artinya kita bisa menggunakan objek
           untuk mengembalikan nilai dalam berbagai jenis tipe data.
        e. Analogi, ingat AVATAR yang menguasai SEMUA ELEMEN.
        f. Analogi lain, Generic Class itu seperti Bunglon.
 */
public class CreatingGenericClasses<ParameterGeneric> {
    private ParameterGeneric pg;

    public ParameterGeneric getPg() {
        return pg;
    }

    public void setPg(ParameterGeneric pg) {
        this.pg = pg;
    }
    
    public static void main(String[] args) {
        // MEMBUAT OBJEK DENGAN PARAMETER CLASS TIPE INTEGER
        CreatingGenericClasses<Integer> obj_genClInteger =
                new CreatingGenericClasses<>();
        obj_genClInteger.setPg(10);
        System.out.println("Objek dari nilai INTEGER: "+obj_genClInteger.getPg());
        
        // MEMBUAT OBJEK DENGAN PARAMETER CLASS TIPE STRING
        CreatingGenericClasses<String> obj_genClString =
                new CreatingGenericClasses<>();
        obj_genClString.setPg("Toma");
        System.out.println("Objek dari nilai STRING: "+obj_genClString.getPg());
    }
}
