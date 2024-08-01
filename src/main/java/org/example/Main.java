package org.example;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Employee vanya = new Employee(181112, "Ivan", 3, "89299980812");
        Employee sveta = new Employee(181014, "Svetlana", 8, "89139991234");
        Employee petya = new Employee(181109, "Petr", 2, "89221315678");
        Employee ira = new Employee(181013, "Irina", 3, "89120953257");

        EmployeeList list = new EmployeeList();
        EmployeeList list1 = new EmployeeList();
        list.addWorker(vanya);
        list.addWorker(sveta);
        list.addWorker(petya);
        list.addWorker(ira);


        //System.out.println(list1);//вывод пустого справочника
        //System.out.println(list); //вывод всех сотрудников
        //System.out.println(list.findPhoneWorker("Vanya")); //если поиск по несуществующему сотруднику
        //System.out.println(list.findWorkerWithId(181013));//поиск сотрудника по ID (верному)
        //System.out.println(list.findWorkerWithId(181333));//поиск сотрудника по ID (неверному)
        System.out.println("Список сотрудников с указанным стажем: " + list.findWorkerWithExperienceAge(3));//поиск сотрудников с указанным стажем(верным)
        System.out.println(list.findWorkerWithExperienceAge(1));//если такого стажа нет
        list1.addNewWorker();//добавление нового сотрудника через консоль(без проверки на ввод)
        System.out.println(list1);

        }

    }
