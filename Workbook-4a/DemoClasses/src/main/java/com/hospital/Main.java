
package com.hospital;

import java.util.Arrays;
import com.hospital.departments.Department;
import com.hospital.staff.Doctor;

public class Main {
    public static void main(String[] args) {
        Department cardiology = new Department("Cardiology", "Dr. Smith");
        Department neurology = new Department("Neurology", "Dr. Jones");

        Hospital hospital = new Hospital(
                "St. Mary's Medical Center",
                "Downtown",
                Arrays.asList(cardiology, neurology)
        );

        hospital.printDepartments();

        Doctor doctor1 = new Doctor("Smith", "Cardiology");
        Doctor doctor2 = new Doctor("Jones", "Neurology");

        doctor1.introduce();
        doctor2.introduce();
    }
}



//public class Main {
//
//        public static void Main(String[] args)
//        {
//            Person p1 = new Person();
//            p1.name = "Hoang";
//            p1.jobtitle = "Student";
//            System.out.println("hi my name is " + p1.name);
//
//            Doctor d1 = new Doctor();
//            d1.Operate();
//
//            HeartSurgeon h1 = new HeartSurgeon();
//            h1.Operate();
//
////            Menu.Operate(); // How can a menu Operate? That doesnt make sence..
//
//
//
//        }
//
//}
