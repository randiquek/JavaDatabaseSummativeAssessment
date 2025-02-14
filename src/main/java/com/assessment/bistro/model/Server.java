package com.assessment.bistro.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Server {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Server_ID")
    private int serverID;

    @Column(name = "First_Name")
    private String firstName;

    @Column(name = "Last_Name")
    private String lastName;

    @Temporal(TemporalType.DATE)
    @Column(name = "Hire_Date")
    private LocalDate hireDate;

    @Column(name = "Term_Date")
    private LocalDate termDate;

    public Server() {

    }

    public Server(int serverID, String firstName, String lastName, LocalDate hireDate, LocalDate termDate) {
        this.serverID = serverID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hireDate = hireDate;
        this.termDate = termDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getServerID() {
        return serverID;
    }

    public void setServerID(int serverID) {
        this.serverID = serverID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public LocalDate getTermDate() {
        return termDate;
    }

    public void setTermDate(LocalDate termDate) {
        this.termDate = termDate;
    }

    @Override
    public String toString() {
        return "Server{" +
                "ServerID=" + serverID +
                ", FirstName='" + firstName + '\'' +
                ", LastName='" + lastName + '\'' +
                ", HireDate=" + hireDate +
                ", TermDate=" + termDate +
                '}';
    }
}
