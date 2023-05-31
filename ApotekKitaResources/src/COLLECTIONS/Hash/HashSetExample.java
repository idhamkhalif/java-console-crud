package COLLECTIONS.Hash;

import java.util.HashSet;
import java.util.Iterator;

class Users {

    private String username;
    private String password;

    public Users(String uName, String pass) {
        this.username = uName;
        this.password = pass;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}

public class HashSetExample {

    public static void main(String[] args) {
        Users a = new Users("admin", "admin");
        Users b = new Users("Toma", "Toma");
        Users c = new Users("Tirta", "Tirta");
        HashSet<Users> hs = new HashSet<Users>();
        hs.add(a);
        hs.add(b);
        hs.add(c);

        for (Users u : hs) {
            System.out.println(u.getUsername() + " " + u.getPassword());
        }
    }
}