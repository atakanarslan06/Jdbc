package org.example;

public class Main {

    static String userName="root";
    static  String password="12345";
    static  String dbUrl="jdbc=mysql://localhost:3306/Jdbc";

    public void main(String[] args) throws  SQLException {

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(dbUrl,userName,password);
            System.out.println("Bağlantı oluştu");
        }catch (SQLException exception){
            System.out.println(exception.getMessage());
        }
        finally {
            {
                connection.close();
            }
        }
    }
}