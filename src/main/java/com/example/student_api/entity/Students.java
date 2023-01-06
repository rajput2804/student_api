package com.example.student_api.entity;

import jakarta.persistence.*;

@Entity
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long studentId;
    private String studentName;
    private String StudentBranch;
    private String studentSemester;
    private String studentContact;
    private String studentFee;
    private String studentAttendance;

    public Students(long studentId, String studentName, String studentBranch, String studentSemester, String studentContact, String studentFee, String studentAttendance) {
        this.studentId = studentId;
        this.studentName = studentName;
        StudentBranch = studentBranch;
        this.studentSemester = studentSemester;
        this.studentContact = studentContact;
        this.studentFee = studentFee;
        this.studentAttendance = studentAttendance;
    }

    public Students() {
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentBranch() {
        return StudentBranch;
    }

    public void setStudentBranch(String studentBranch) {
        StudentBranch = studentBranch;
    }

    public String getStudentSemester() {
        return studentSemester;
    }

    public void setStudentSemester(String studentSemester) {
        this.studentSemester = studentSemester;
    }

    public String getStudentContact() {
        return studentContact;
    }

    public void setStudentContact(String studentContact) {
        this.studentContact = studentContact;
    }

    public String getStudentFee() {
        return studentFee;
    }

    public void setStudentFee(String studentFee) {
        this.studentFee = studentFee;
    }

    public String getStudentAttendance() {
        return studentAttendance;
    }

    public void setStudentAttendance(String studentAttendance) {
        this.studentAttendance = studentAttendance;
    }

    @Override
    public String toString() {
        return "Students{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", StudentBranch='" + StudentBranch + '\'' +
                ", studentSemester='" + studentSemester + '\'' +
                ", studentContact='" + studentContact + '\'' +
                ", studentFee='" + studentFee + '\'' +
                ", studentAttendance='" + studentAttendance + '\'' +
                '}';
    }
}
