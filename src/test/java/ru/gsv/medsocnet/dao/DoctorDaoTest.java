package ru.gsv.medsocnet.dao;

import ru.gsv.medsocnet.model.Doctor;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.gsv.medsocnet.model.Specialization;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by user on 02.10.2016.
 */
public class DoctorDaoTest {
    DoctorDao doctorDao;
    Connection connection;

    @Before
    public void setUp() throws SQLException, IllegalAccessException, InstantiationException, ClassNotFoundException {
        connection = SQLConnection.getInstance().getConnection();
        doctorDao = new DoctorDao(connection);
        Doctor doctor = new Doctor("Sidr", "Sidorov", Specialization.DRHOUSE, "Sidr", "12345");
        System.out.println("adding docktor!!!");
        doctorDao.addDoctor(doctor);
    }

    @After
    public void close() throws SQLException {
        connection.close();
    }

    @Test
    public void addDoctorTest(){

    }

    @Test
    public void getAllTest(){
        List<Doctor> doctors = doctorDao.getAll();
        assertEquals(3, doctors.size());
    }
}