package fr.imie.projet.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import core.ConnectionManager;
import core.entities.User;

public class UserJdbc {

    public long createUser(User user) {
        long id;
        try (PreparedStatement statement = ConnectionManager.getConnection().prepareStatement("INSERT INTO user (nom, prenom, login, motDePass) VALUES (?, ?, ?, ?);", Statement.RETURN_GENERATED_KEYS)){
            statement.setString(1, user.getNom());
            statement.setString(2, user.getPrenom());
            statement.setString(3, user.getLogin());
            statement.setString(4, user.getMotDePass());
            statement.executeUpdate();
            ResultSet resultSet = statement.getGeneratedKeys();
            resultSet.next();
            id = resultSet.getLong(1);
            ConnectionManager.getConnection().commit();
        } catch (SQLException e) {
            throw new RuntimeException("Unable to execute that query");
        }
        return id;
    }

}