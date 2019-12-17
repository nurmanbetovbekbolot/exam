package com.company.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Person> personList = new ArrayList<>();
        Person person1 = new Person("Azat", "Usonov", "Akunovich");
        Person person2 = new Person("Azamat", "Asanov", "Aktnovich");
        Person person3 = new Person("Bakai", "Kydyrbekov", "Kydyrbekovich");
        Person person4 = new Person("Argen", "Adylov", "Rasulovich");
        Person person5 = new Person("Azat", "Usonov", "Akunovich");
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        System.out.println(personList);
        for (int i = 0; i <personList.size() ; i++) {
           if (hasSame(personList.get(i),personList)){
              throw new Exception("I found");}

    }

    }
    public static boolean hasSame(Person p,List <Person> personList) {
        for (Person p2 : personList)
            if (p.equals(p2)) return true;
        return false;
    }
}