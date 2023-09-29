package ss_case_study.repository.impl;

import ss_case_study.model.Employee;
import ss_case_study.repository.IBookingRepository;
import ss_case_study.repository.IEmployeeRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class EmployeeRepository implements IEmployeeRepository {
    Scanner scanner = new Scanner(System.in);
    static ArrayList<String> positions = new ArrayList<>();
    static ArrayList<String> qualifications = new ArrayList<>();
    static ArrayList<Employee> employees = new ArrayList<>();
    static int index;

    static {
        qualifications.add("Trung Cap");
        qualifications.add("Cao Dang");
        qualifications.add("Dai Hoc");
        qualifications.add("Sau Dai Hoc");

        positions.add("Le tan");
        positions.add("Phuc vu");
        positions.add("Chuyen Vien");
        positions.add("Giam Sat");
        positions.add("Quan Ly");
        positions.add("Giam Doc");
        // Employee(int employeeCode, int id, int phoneNumber, int salary, String fullName, String gender, String email, String dayOfBirth, String position, String qualification)
        employees.add(index, new Employee(1, 1, "0909123123", 10000000, "Test1", "Male", "testabc@gmail.com", "15 / 12 / 2001", positions.get(5), qualifications.get(3)));
        employees.add(++index, new Employee(2, 2, "0909132131", 20000000, "Test2", "Male", "testabc2@gmail.com", "15 / 8 / 2002", positions.get(4), qualifications.get(2)));
        employees.add(++index, new Employee(3, 3, "0905466493", 15000000, "Test3", "Female", "testabc3@gmail.com", "22 / 12 / 2003", positions.get(3), qualifications.get(1)));
    }

    public void addEmployee() {
        int id = 0;
        int employeeCode, salary;
        int choose1 = -1;
        int choose2 = -1;
        String phoneNumber, fullName, gender, email, dateOfBirth;
        boolean flag1;
        do {
            flag1 = false;
            System.out.print("nhap vao ID: ");
            try {
                id = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < employees.size(); i++) {
                    if (id == employees.get(i).getId()) {
                        System.out.println("ID bi trung lap - hay nhap lai ID");
                        flag1 = true;
                        break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Moi ban nhap lai ID");
                flag1 = true;
            }
        } while (flag1);
        boolean flag2;
        do {
            flag2 = false;
            System.out.print("nhap vao Employee Code: ");
            employeeCode = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < employees.size(); i++) {
                if (employeeCode == employees.get(i).getEmployeeCode()) {
                    System.out.println("Employee code bi trung lap");
                    flag2 = true;
                    break;
                }
            }
        } while (flag2);
        boolean flag3;
        do {
            flag3 = false;
            System.out.print("Nhap vao phone number: ");
            phoneNumber = scanner.nextLine();
            for (int i = 0; i < employees.size(); i++) {
                if (Objects.equals(phoneNumber, employees.get(i).getPhoneNumber())) {
                    System.out.println("so dien thoai bi trung lap");
                    flag3 = true;
                    break;
                }
            }
        } while (flag3);
        System.out.print("Nhap vao salary: ");
        salary = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap vao ho ten nhan vien: ");
        fullName = scanner.nextLine();
        System.out.print("Nhap vao gender (Male / Female) : ");
        gender = scanner.nextLine();
        System.out.print("Nhap email: ");
        email = scanner.nextLine();
        do {
            System.out.print("Nhap ngay thang nam sinh (dd/mm/yyyy): ");
            dateOfBirth = scanner.nextLine();
        }while (!checkDayOfBirth(dateOfBirth));
        System.out.println("moi ban chon Position:");
        for (int i = 0; i < positions.size(); i++) {
            System.out.println(i + ": " + positions.get(i));
        }
        boolean flag4 = true;
        do {
            flag4 = false;
            try {
                choose1 = Integer.parseInt(scanner.nextLine());
                if (choose1 > positions.size() - 1 || choose1 < 0) {
                    System.out.print("ban da nhap qua pham vi - moi ban nhap lai: ");
                    flag4 = true;
                }
            } catch (Exception e) {
                e.printStackTrace();
                choose1 = positions.size() - 1;
                flag4 = true;
            }
        } while (flag4);

        System.out.println("moi ban chon qualification:");
        for (int i = 0; i < qualifications.size(); i++) {
            System.out.println(i + ": " + qualifications.get(i));
        }
        boolean flag5 = true;
        do {
            flag5 = false;
            try {
                choose2 = Integer.parseInt(scanner.nextLine());
                if (choose2 > qualifications.size() - 1 || choose2 < 0) {
                    System.out.println("ban da nhap qua pham vi - moi ban nhap lai: ");
                    flag5 = true;
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Vui long nhap lai");
                flag5 = true;
            }
        } while (flag5);
        employees.add(++index, new Employee(employeeCode, id, phoneNumber, salary, fullName, gender, email, dateOfBirth, positions.get(choose1), qualifications.get(choose2)));
    }

    public static ArrayList<Employee> displayEmployeeList() {
        for (Employee e : employees) {
            System.out.println(e);
        }
        return employees;
    }

    @Override
    public boolean checkDayOfBirth(String dayOfBirth) {
        String[] parts = dayOfBirth.split("/");
        if (parts.length == 3) {
            try {
                int day = Integer.parseInt(parts[0]);
                int month = Integer.parseInt(parts[1]);
                int year = Integer.parseInt(parts[2]);
                if (day >= 1 && day <= 31 && month >= 1 && month <= 12 && year >= 1900 && year <= 2023) {
                   return true;
                } else {
                    System.out.println("Nhap khong hop le. Vui long nhap lai theo dinh dang dd/mm/yyyy.");
                    return false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Nhap khong hop le. Vui long nhap lai theo dinh dang dd/mm/yyyy.");
                return false;
            }
        } else {
            System.out.println("Nhap khong hop le. Vui long nhap lai theo dinh dang dd/mm/yyyy.");
            return false;
        }
    }
    }



