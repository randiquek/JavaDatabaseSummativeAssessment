package com.assessment.bistro.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Server {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ServerID;
    private String FirstName;
    private String LastName;
    @Temporal(TemporalType.DATE)
    private LocalDate HireDate;
    private LocalDate TermDate;

    public Server(int serverID, String firstName, String lastName, LocalDate hireDate, LocalDate termDate) {
        ServerID = serverID;
        FirstName = firstName;
        LastName = lastName;
        HireDate = hireDate;
        TermDate = termDate;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public int getServerID() {
        return ServerID;
    }

    public void setServerID(int serverID) {
        ServerID = serverID;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public LocalDate getHireDate() {
        return HireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        HireDate = hireDate;
    }

    public LocalDate getTermDate() {
        return TermDate;
    }

    public void setTermDate(LocalDate termDate) {
        TermDate = termDate;
    }

    @Override
    public String toString() {
        return "Server{" +
                "ServerID=" + ServerID +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", HireDate=" + HireDate +
                ", TermDate=" + TermDate +
                '}';
    }
}
