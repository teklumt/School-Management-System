
package pkgfinal;

public class Admin {
    public String name;
    public String nm;
    public String id;
    public String password;
    public String pass;

    public Admin(String name, String id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

//    Admin(String nm, String id, String pass) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

  

   

    // Getter and Setter methods for each field (name, id, password)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // You can add more methods or functionality as needed
}

