package org.example;

public class Person {
  public String name;
  public int age;

  public static void main(String[] args) {
    Person p = new Person();
    p.name = "Alice Aardvark";
    p.age = 1;
    System.out.println(p.name);
    System.out.println(p.age);
    System.out.println(p);
  }

  @Override
  public String toString() {
    return this.name + "(" + age + ")";
  }
}
