package com.javacourse;

public class CheckAge {
        static void checkAge(int age) {
      if (age < 18) {
          throw new ArithmeticException("Access denied - You must be at least 18 years old. ");
      }
      else {
          System.out.println("Access granted. You're old enough!. ");
      }
    }
    public static void main(String[] args) {
     checkAge(20);
    }
}
