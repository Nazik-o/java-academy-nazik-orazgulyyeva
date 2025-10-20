package com.hospital;
import java.util.List;
import com.hospital.departments.Department;

public class Hospital {

        private String name;
        private String location;
        private List<Department> departments;

        public Hospital(String name, String location, List<Department> departments) {
            this.name = name;
            this.location = location;
            this.departments = departments;
        }

        public void printDepartments() {
            System.out.println("Hospital: " + name);
            System.out.println("Departments:");
            for (Department d : departments) {
                System.out.println("- " + d.getInfo());
            }
        }
    }







//    public static void Main(String[] args)
//    {
//
//        Person p1 = new Person();
//        p1.name = "Hoang";
//        p1.jobtitle = "Student";
//        System.out.println("hi my name is " + p1.name);
//
//        Doctor d1 = new Doctor();
//        d1.Operate();
//
//        HeartSurgeon h1 = new HeartSurgeon();
//        h1.Operate();
//
////        Menu.Operate(); // How can a menu Operate? That doesnt make sence..
//
//
//
//    }

