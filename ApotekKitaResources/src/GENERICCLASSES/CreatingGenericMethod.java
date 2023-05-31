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
public class CreatingGenericMethod{
    public <ParameterGeneric> ParameterGeneric tampilkan(ParameterGeneric pg){
        return pg;
    }
    
    public static void main(String[] args) {
        // MEMBUAT OBJEK CLASS SEPERTI BIASA
        CreatingGenericMethod obj_genCl = new CreatingGenericMethod();
        
        // MEMBUAT OUTPUT DENGAN MENERIMA PARAMETER BERBEDA
        System.out.println("Fungsi Generic dengan nilai INTEGER: "+obj_genCl.tampilkan(39));
        System.out.println("Fungsi Generic dengan nilai STRING: "+obj_genCl.tampilkan("Toma"));
        System.out.println("Fungsi Generic dengan nilai DOUBLE: "+obj_genCl.tampilkan(3.9));
        System.out.println("Fungsi Generic dengan nilai BOOLEAN: "+obj_genCl.tampilkan(true));
    }
}