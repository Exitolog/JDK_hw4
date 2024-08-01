package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeList {
    private List<Employee> employeeList;


    public EmployeeList() {
        employeeList = new ArrayList<>();
    }

   public List<Employee> findWorkerWithExperienceAge(int workAge){
        List<Employee> list = new ArrayList<>();
        for (Employee employee : employeeList){
            if(employee.getExperienceAge() == workAge){
                list.add(employee);
            }
        }
        if(list.isEmpty()){
            System.out.println("Сотрудников с указанным стажем в списке нет ");
        }
        return list;
   }

   public List<String> findPhoneWorker(String name){
        List<String> list = new ArrayList<>();
        for (Employee employee : employeeList){
            if(employee.getName().equals(name)){
                list.add(employee.getPhoneNumber());
            }
        }
       if(list.isEmpty()){
           System.out.println("Сотрудников с таким именем в списке нет ");
       }
        return list;
   }

   public Employee findWorkerWithId(long id){
        for (Employee employee : employeeList){
            if(employee.getId() == id){
                return employee;
            }
        }
       System.out.println("Сотрудника с таким ID в списке нет ");
        return null;
   }

   public void addNewWorker(){
        employeeList.add(new Employee(Long.parseLong(prompt("Введите ID сотрудника")),prompt("Введите имя сотрудника"),
                Integer.parseInt(prompt("Введите общий стаж работы сотрудника")),
                prompt("Введите номер телефона сотрудника")));
   }

   public void addWorker(Employee employee){
        employeeList.add(employee);
   }


   public String prompt(String message){
       Scanner sc = new Scanner(System.in);
       System.out.println(message);
       return sc.nextLine();
   }

    @Override
    public String toString() {
        if(employeeList.isEmpty()){
            return "EmployeeList пуст";
        }
        return "EmployeeList " +
                employeeList;
    }
}
