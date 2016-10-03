package ru.gsv.medsocnet.dao;

import ru.gsv.medsocnet.model.Doctor;
import ru.gsv.medsocnet.model.Specialization;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 02.10.2016.
 */
public class DoctorDao {
    Connection connection;

    public DoctorDao(Connection connection){
        this.connection = connection;
    }

    public boolean addDoctor(final Doctor doctor) {
        int updated = 0;
        String query = "INSERT INTO medsocnet.doctors (name, surname, spec, login, password) VALUES (?, ?, ?, ?, ?);";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, doctor.getName());
            statement.setString(2, doctor.getSurname());
            statement.setString(3, doctor.getSpec().toString());
            statement.setString(4, doctor.getLogin());
            statement.setString(5, doctor.getPassword());
            updated = statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return updated == 1;
    }

    public List<Doctor> getAll(){
        String query = "SELECT * FROM medsocnet.doctors";
        List<Doctor> doctors = new ArrayList<Doctor>();
        try(Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query)){
            while(rs.next()){
                doctors.add(new Doctor(rs.getString("name"),
                        rs.getString("surname"), Specialization.valueOf(rs.getString("spec")),
                        rs.getString("login"), rs.getString("password")));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return doctors;
    }
}
