package com.sms.main;

import java.util.List;
import java.util.Scanner;

import com.sms.dao.StudentDAO;
import com.sms.dao.StudentDAOImpl;
import com.sms.model.Student;
import com.sms.util.InputValidator;


public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAOImpl();

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
            case 1:
                System.out.print("Name: ");
                String name = sc.nextLine();

                if (!InputValidator.isValidName(name)) {
                    System.out.println("Invalid name! Use only letters, min 3 characters.");
                    break;
                }
 
                System.out.print("Email: ");
                String email = sc.nextLine();

                if (!InputValidator.isValidEmail(email)) {
                    System.out.println("Invalid email format!");
                    break;
                }

                System.out.print("Department: ");
                String dept = sc.nextLine();

                if (!InputValidator.isValidDepartment(dept)) {
                    System.out.println("Invalid department!");
                    break;
                }

                dao.addStudent(new Student(name, email, dept));
                break;


                case 2:
                    List<Student> students = dao.getAllStudents();
                    for (Student s : students) {
                        System.out.println(
                            s.getId() + " | " +
                            s.getName() + " | " +
                            s.getEmail() + " | " +
                            s.getDepartment()
                        );
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to update: ");
                    int uid = sc.nextInt();
                    sc.nextLine();

                    if (!InputValidator.isValidId(uid)) {
                        System.out.println("Invalid ID!");
                        break;
                    }

                    System.out.print("New Name: ");
                    String uname = sc.nextLine();

                    System.out.print("New Email: ");
                    String uemail = sc.nextLine();

                    if (!InputValidator.isValidEmail(uemail)) {
                        System.out.println("Invalid email!");
                        break;
                    }

                    System.out.print("New Department: ");
                    String udept = sc.nextLine();

                    dao.updateStudent(new Student(uid, uname, uemail, udept));
                    break;


                case 4:
                    System.out.print("Enter ID to delete: ");
                    int did = sc.nextInt();

                    if (!InputValidator.isValidId(did)) {
                        System.out.println("Invalid ID!");
                        break;
                    }

                    dao.deleteStudent(did);
                    break;


                case 5:
                    System.out.println("Thank you!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
