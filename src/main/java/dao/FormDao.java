package dao;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FormDao {
    private final DataSource dataSource = DbDataSource.createDataSource();
    private PreparedStatement statement;
    private ResultSet resultSet;
    private final String QUERYADD = "INSERT INTO hospital.form (`date`, clock, patient_id) VALUES(?, ?, ?);";
    private final String QUERYDELTE = "DELETE FROM hospital.form WHERE id=?;";
}
