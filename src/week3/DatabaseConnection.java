package week3;

import java.sql.*;

public class DatabaseConnection {
    private static final String db_url = "jdbc:postgresql://localhost:5432/postgres";
    private static final String User = "postgres";
    private static final String password = "123";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(db_url, User, password)) {
            String document = "Peradau vsem salam";
            String searchText = "salam";
            saveDocument(connection,document);
            searchDocument(connection,searchText);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private static void saveDocument(Connection connection, String document) throws SQLException {
        String sql = "INSERT INTO practice (name) VALUES (?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, document);
            statement.executeUpdate();
        }
    }


    private static void searchDocument(Connection connection, String searchText) throws SQLException {
        String sql = "SELECT * FROM practice WHERE name LIKE ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, "%" + searchText + "%");
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    String document = resultSet.getString("name");
                    System.out.println(document);
                }
            }
        }
    }


}
