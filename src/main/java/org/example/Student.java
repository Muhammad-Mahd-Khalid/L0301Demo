package org.example;

public class Student extends Person {

  public String name;
  public int age;
  public String studentNumber;

  @Override
  public String toString() {
    String rslt = super.toString();
    rslt += " [stu#: " + studentNumber + "]";
    return rslt;
  }
}
