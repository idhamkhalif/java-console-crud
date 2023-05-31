package INNERCLASS;

public class AnonymousInnerClass{
    private static String username;
    private static String password;
    public static void main(String[] args) {
        cekLogin obj_anonymous = new cekLogin(){
            @Override
            public void prosesLogin(){
                if(username.equals("admin") && password.equals("admin")){
                System.out.println("Login Sukses!!!");
            }
            }
            /* PERHATIKAN TITIK KOMA (;) DIBAWAH
               ITU ADALAH PENANDA DARI SEBUAH ANONYMOUS INNER CLASS
            */
        };
        obj_anonymous.prosesLogin();
    }
    /*
    Catatan:
    a. Anonymous class dideklarasikan dalam sebuah EKSPRESI seperti baris 7-17.
    b. Penggunaan paling umum adalah pada interface.
    */
}