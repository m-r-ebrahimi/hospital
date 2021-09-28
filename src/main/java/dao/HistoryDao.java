package dao;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class HistoryDao {
    private final DataSource dataSource = DbDataSource.createDataSource();
    private PreparedStatement statement;
    private ResultSet resultSet;
    private final String QUERYADD = "INSERT INTO hospital.history (patient_id, hospitalize, dehospitalize) VALUES(?, ?, ?);";
    private final String QUERYDELTE = "DELETE FROM hospital.doctor WHERE id=?;";
}
