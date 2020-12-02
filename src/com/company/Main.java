package com.company;

public class Main {

    public static void main(String[] args) {
	    Employee yaroslav = new Employee("Ярослав", Position.SystemAdministrator);
	    Employee timur = new Employee("Тимур", Position.TechSupport);
	    Employee kirill = new Employee("Кирилл", Position.Leader);

        System.out.println(timur);

        timur.position = Position.Leader;

        System.out.println(timur);
    }
}
