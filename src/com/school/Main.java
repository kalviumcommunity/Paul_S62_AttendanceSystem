package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Teajuice");
        Student s2 = new Student("Joshua Kuttan");

        Course c1 = new Course("Calculus");
        Course c2 = new Course("Biology");

        List<AttendanceRecord> attendanceLog = new ArrayList<>();

        attendanceLog.add(new AttendanceRecord(s1.getStudentId(), c1.getCourseId(), "Late"));
        attendanceLog.add(new AttendanceRecord(s2.getStudentId(), c2.getCourseId(), "Present"));
        attendanceLog.add(new AttendanceRecord(s1.getStudentId(), c2.getCourseId(), "Absent")); 

        for (AttendanceRecord record : attendanceLog) {
            record.displayDetails();
        }
    }
}
