package com.example.siwes.entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;


@Entity (name = "Student")
public class Student {

    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    @Column(
            name ="id",
            updatable = false
    )
    private Long id;
    @Column(name="matric_number", nullable = false, unique = true)
    private Long matric;
    @Column(name="first_name", nullable = false, columnDefinition = "TEXT")
    private String firstName;
    @Column(name="last_name", nullable = false, columnDefinition = "TEXT")
    private String lastName;
    @Column(name="gender", nullable = false, columnDefinition = "TEXT")
    private String gender;
    @Column(name="year_of_entry", nullable = false )
    private int yearOfEntry;
    @Column(name="mode_of_entry", nullable = false, columnDefinition = "TEXT")
    private String modeOfEntry;
    @Column(name="level", nullable = false )
    private int level;
    @Column(name="date_of_birth", nullable = false )
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private String dOB;

    @Column(name="age", nullable = false )
    private int age;
    @Column(name="faculty", nullable = false, columnDefinition = "TEXT")
    private String faculty;
    @Column(name="state_of_origin", nullable = false, columnDefinition = "TEXT")
    private String stateOfOrigin;
    @Column(name="phone_number", nullable = false )
    private Long phoneNumber;
    @Column(name="email_address", nullable = false, columnDefinition = "TEXT", unique = true)
    private String email;


    public Student() {
    }


    public Student(Long matric, String firstName, String lastName, String gender, int yearOfEntry, String modeOfEntry, int level, String dOB, int age, String faculty, String stateOfOrigin, Long phoneNumber, String email) {

        this.matric = matric;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.yearOfEntry = yearOfEntry;
        this.modeOfEntry = modeOfEntry;
        this.level = level;
        this.dOB = dOB;
        this.age = age;
        this.faculty = faculty;
        this.stateOfOrigin = stateOfOrigin;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMatric() {
        return matric;
    }

    public void setMatric(Long matric) {
        this.matric = matric;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getYearOfEntry() {
        return yearOfEntry;
    }

    public void setYearOfEntry(int yearOfEntry) {
        this.yearOfEntry = yearOfEntry;
    }

    public String getModeOfEntry() {
        return modeOfEntry;
    }

    public void setModeOfEntry(String modeOfEntry) {
        this.modeOfEntry = modeOfEntry;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getdOB() {
        return dOB;
    }

    public void setdOB(String dOB) {
        this.dOB = dOB;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getStateOfOrigin() {
        return stateOfOrigin;
    }

    public void setStateOfOrigin(String stateOfOrigin) {
        this.stateOfOrigin = stateOfOrigin;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}




