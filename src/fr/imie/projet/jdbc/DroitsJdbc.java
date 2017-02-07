package fr.imie.projet.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import core.ConnectionManager;
import core.entities.Droits;

public class DroitsJdbc {

    public long createDroits(Droits droits) {
        long id;
        try (PreparedStatement statement = ConnectionManager.getConnection().prepareStatement("INSERT INTO droits (niveau, severite, nom, societe) VALUES (?, ?, ?, ?);", Statement.RETURN_GENERATED_KEYS)){
            statement.setInt(1, droits.getNiveau());
            statement.setInt(2, droits.getSeverite());
            statement.setString(3, droits.getNom());
            statement.setString(4, droits.getSociete());
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