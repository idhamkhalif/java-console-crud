package INNERCLASS;

public class MethodLocalInnerClass {

    private String username;
    private String password;

    public void prosesLogin() {
        if (username.equals("admin") && password.equals("admin")) {
            // BAGIAN METHOD-LOCAL INNER CLASS
            class cekLogin {
                public void tampilkanHasil() {
                    System.out.println("Login Sukses!!!");
                }
            }
            // MEMBUAT OBJEK DARI CLASS DI DALAM METHOD / FUNGSI
            cekLogin obj_method_local_inner = new cekLogin();
            obj_method_local_inner.tampilkanHasil();
        }
    }
    
    public static void main(String[] args) {
        MethodLocalInnerClass obj_method_local_outer = new MethodLocalInnerClass();
        obj_method_local_outer.prosesLogin();
    }
}
