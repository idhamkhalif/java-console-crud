package INNERCLASS;

// nama kelas RegularInnerClass dibawah ini adalah nama OUTER CLASSNYA
public class RegularInnerClass {
    private String username;
    private String password;
    
    //BAGIAN INNER CLASS REGULAR
    class cekLogin{
        public void prosesLogin(){
            if(username.equals("admin") && password.equals("admin")){
                System.out.println("Login Sukses!!!");
            }
        }
    }
    public static void main(String[] args) {
        // UNTUK MEMBUAT OBJEK, KITA BUAT OBJEK OUTER CLASS DULU
        RegularInnerClass obj_outer = new RegularInnerClass();
        // BAGIAN MEMBUAT OBJEK DARI INNER CLASSNYA
        RegularInnerClass.cekLogin obj_inner = obj_outer.new cekLogin();
    }
}
