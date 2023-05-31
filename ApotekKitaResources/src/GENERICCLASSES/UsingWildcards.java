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
public class UsingWildcards<ParameterGeneric> {

    private ParameterGeneric obj_generic;

    public ParameterGeneric getObj_generic() {
        return obj_generic;
    }

    public void setObj_generic(ParameterGeneric obj_generic) {
        this.obj_generic = obj_generic;
    }

    public boolean bandingkan(UsingWildcards<? extends Number> obj){
        if(obj_generic == obj.obj_generic){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        // MEMBUAT OBJEK CLASS DENGAN PARAMETER INTEGER
        UsingWildcards<Integer> obj_integer = new
            UsingWildcards<>();
        obj_integer.setObj_generic(39);
        
        // MEMBUAT OBJEK CLASS DENGAN PARAMETER STRING
        UsingWildcards<String> obj_string = new
            UsingWildcards<>();
        obj_string.setObj_generic("Toma");
        
        // TAMPILKAN
        System.out.println("Nilai OBJEK PERTAMA: "+obj_integer.getObj_generic());
        System.out.println("Nilai OBJEK KEDUA: "+obj_string.getObj_generic());
        System.out.println("\n");
        System.out.println("=======METHOD PERBANDINGAN=======");
        
        // TES TIPE BYTE APAKAH TERMASUK NUMBER???
        UsingWildcards<Byte> obj = new UsingWildcards<>();
        System.out.println("Hasil Perbandingan BYTE is NUMBER: "+obj.bandingkan(obj));
        System.out.println("Hasil Perbandingan INTEGER is NUMBER: "+obj_integer.bandingkan(obj_integer));
        
        // TES APAKAH KEDUA TIPE DATA BYTE DAN INETEGER ITU SAMA KARENA SAMA-SAMA NUMBER???
        System.out.println("Hasil Perbandingan INTEGER == BYTE: "+obj.bandingkan(obj_integer));
    }
}
