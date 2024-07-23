package com.curso.v6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "password";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // Conexión a la base de datos
            connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

            // Crear
            String createSQL = "INSERT INTO users (name, email) VALUES ('John Doe', 'john@example.com')";
            statement = connection.createStatement();
            statement.executeUpdate(createSQL);

            // Leer
            String readSQL = "SELECT * FROM users";
            resultSet = statement.executeQuery(readSQL);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
            }

            // Actualizar
            String updateSQL = "UPDATE users SET email = 'john.doe@example.com' WHERE name = 'John Doe'";
            preparedStatement = connection.prepareStatement(updateSQL);
            preparedStatement.executeUpdate();

            // Borrar
            String deleteSQL = "DELETE FROM users WHERE name = 'John Doe'";
            preparedStatement = connection.prepareStatement(deleteSQL);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar ResultSet
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            // Cerrar Statement
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            // Cerrar PreparedStatement
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            // Cerrar Connection
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
