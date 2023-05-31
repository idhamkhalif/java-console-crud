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
public class UsingGenericTypeInference<ParameterSatu, ParameterDua>{
    private ParameterSatu var_satu;
    private ParameterDua var_dua;
    
    public UsingGenericTypeInference(ParameterSatu p1, ParameterDua p2){
        var_satu = p1;
        var_dua = p2;
    }

    public ParameterSatu getVar_satu() {
        return var_satu;
    }

    public ParameterDua getVar_dua() {
        return var_dua;
    }
    
    public static void main(String[] args) {
        // MEMBUAT OBJEK CLASS DENGAN PARAMETER CLASS STRING DAN DOUBLE
        UsingGenericTypeInference<String, Double> obj_satu = new
                UsingGenericTypeInference<String, Double>("Toma", 3.9);
        // TAMPILKAN
        System.out.println("Nilai STRING: "+obj_satu.getVar_satu());
        System.out.println("Nilai DOUBLE: "+obj_satu.getVar_dua());
        
        // MEMBUAT OBJEK CLASS DENGAN PARAMETER CLASS DOUBLE DAN STRING
        UsingGenericTypeInference<Double, String> obj_dua = new
                UsingGenericTypeInference<Double, String>(9.3, "Tirta");
        // TAMPILKAN
        System.out.println("Nilai DOUBLE: "+obj_dua.getVar_satu());
        System.out.println("Nilai STRING: "+obj_dua.getVar_dua());
        
        // CARA LAIN DENGAN MENGOSONGKAN PARAMETER DI OBJEK
        UsingGenericTypeInference<String, Double> obj_tiga = new
                UsingGenericTypeInference<>("Toma", 3.9);
        // TAMPILKAN
        System.out.println("Nilai STRING: "+obj_tiga.getVar_satu());
        System.out.println("Nilai DOUBLE: "+obj_tiga.getVar_dua());
    }
}