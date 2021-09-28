package dao;

import entity.Patient;
import entity.Sex;
import entity.Type;

import javax.sql.DataSource;
import java.sql.*;

public class PatientDao {
    private final DataSource dataSource = DbDataSource.createDataSource();
    private PreparedStatement statement;
    private ResultSet resultSet;
    private final String QUERYADD = "INSERT INTO hospital.patient (name, age, sex, birthdate, address) VALUES(?, ?, ?, ?, ?);";
    private final String QUERYDELTE = "DELETE FROM hospital.patient WHERE id=?;";
    private final String QUERYUPDATE = "UPDATE hospital.patient SET name=?, age=?, sex=?, birthdate=?, address=? WHERE id=?;";
    private final String QUERYREADBYID = "SELECT * FROM hospital.patient WHERE id=?;";
    private final String QUERYREAD = "SELECT * FROM hospital.patient;";

    public int add(String name, int age, Sex sex, Date birthdate, String address) throws SQLException {
        statement = dataSource.getConnection().prepareStatement(QUERYADD, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, name);
        statement.setInt(2, age);
        statement.setInt(3, sex.getSex());
        statement.setDate(4, birthdate);
        statement.setString(5, address);
        statement.executeUpdate();
        resultSet = statement.getGeneratedKeys();
        resultSet.next();
        return resultSet.getInt(1);
    }

    public void delete(int id) throws SQLException {
        statement = dataSource.getConnection().prepareStatement(QUERYDELTE);
        statement.setInt(1, id);
        statement.executeUpdate();
    }
    /*public Patient readById(int id) throws SQLException {
        statement = dataSource.getConnection().prepareStatement(QUERYREADBYID);
        statement.setInt(1, id);
        resultSet = statement.executeQuery();
        resultSet.next();
        Patient patient = new Patient(resultSet.getString("name"),
                resultSet.getInt("age"),
                resultSet.getInt("sex"),
               // resultSet.getDate());




        //patient.setId(resultSet.getInt("id"));
        return patient;
    }*/

    /*public ResultSet read() throws SQLException {
        statement = dataSource.getConnection().prepareStatement(QUERYREAD);
        return statement.executeQuery();
    }*/
}
