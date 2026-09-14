package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

  public static void main(String[] args) {
    Person p1 = new Person();
    p1.name = "Bob Builder";
    p1.age = 27;
    Student s1 = new Student();
    s1.name = "Bob Builder";
    s1.age = 27;
    s1.studentNumber = "bob123";
    Person[] people = {p1, s1};

    for (Person p : people) {
      System.out.println(p.name);
      System.out.println(p);
      if (p instanceof Student) {
        System.out.println(((Student) p).name);
      }
    }

    System.out.println(s1.equals(p1));
  }
}