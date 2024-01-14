package pkgfinal;

import java.util.ArrayList;

public class AdminDatabase {
    private static ArrayList<Admin> adminList = new ArrayList<>();
    private static AdminDatabase instance = new AdminDatabase();

    AdminDatabase() {
        // Private constructor to prevent instantiation outside the class.
    }

    public static AdminDatabase getInstance() {
        return instance;
    }

    public ArrayList<Admin> getAdminList() {
        return adminList;
    }

    public void addAdmin(Admin admin) {
        adminList.add(admin);
    }

    public boolean isAdminCredentialsValid(String id, String password) {
        for (Admin admin : adminList) {
            if (admin.getId().equals(id) && admin.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
     public boolean isIdExists(String id) {
        for (Admin admin : adminList) {
            if (admin.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

     public Admin getAdminById(String id) {
        for (Admin admin : adminList) {
            if (admin.getId().equals(id)) {
                return admin;
            }
        }
        return null; // Return null if admin not found
    }
    // You can add more methods as needed.

    // Nested Admin class definition
//    public static class Admin {
//        private String id;
//        private String name;  // Adding name to the Admin class
//        private String password;
//
//        public Admin(String id, String name, String password) {
//            this.id = id;
//            this.name = name;
//            this.password = password;
//        }
//
//        public String getId() {
//            return id;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public String getPassword() {
//            return password;
//        }
//    }
}
