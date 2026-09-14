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

    Person p2 = new Person();
    p2.name = new String("Alice Aardvark");
    p2.age = 1;
    System.out.println(p2 == p);
    System.out.println(p2.equals(p));
  }

  @Override
  public String toString() {
    return this.name + " (age:" + age + ")";
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Person)) {
      return false;
    }
    Person other = (Person) obj;
    return other.name.equals(name) && other.age == age;
  }
}
