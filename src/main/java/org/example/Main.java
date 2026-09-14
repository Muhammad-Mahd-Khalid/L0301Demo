package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

  public static void main(String[] args) {
    Person p1 = new Person("Alice Aardvark", 1);
    Student s1 = new Student("Bob Builder", 27, "bob123");
    Student s2 = new Student("Carol Coder", 42);
    Person[] people = {p1, s1, s2};

    for (Person p : people) {
      System.out.println(p);
    }
  }
}