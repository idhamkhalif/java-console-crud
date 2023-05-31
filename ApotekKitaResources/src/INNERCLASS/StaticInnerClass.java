package INNERCLASS;

public class StaticInnerClass {
    private static String username;
    private static String password;
    
    // BAGIAN STATIC INNER CLASS DITANDAI DENGAN KEYWORD STATIC
    static class cekLogin{
        public void prosesLogin(){
            if(username.equals("admin") && password.equals("admin")){
                System.out.println("Login Sukses!!!");
            }
        }
    }
    public static void main(String[] args) {
        // MEMBUAT OBJEK DARI STATIC CLASS
        StaticInnerClass.cekLogin obj_static = new StaticInnerClass.cekLogin();
    }
}
