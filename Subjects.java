package com.college.subjects.result;
import java.util.*;

public class Subjects {
	
 public static void main(String[] args) {
     Scanner subject = new Scanner(System.in);

     System.out.println("Enter the marks of five subjects::\n");

     // To store the values of five subjects
      int  sub_1 = subject.nextInt();
      int sub_2 = subject.nextInt();
      int sub_3 = subject.nextInt();
      int sub_4 = subject.nextInt();
      int sub_5 = subject.nextInt();

     int total;
     float average;
     float percentage;
     char grade;

     // Calculate total, average and percentage
      total = sub_1 + sub_2 + sub_3 + sub_4 + sub_5;
     average = (float)(total / 5.0);
     percentage = (float)((total / 500.0) * 100);

     // It will calculate the Grade
     if (average >= 90)
         grade = 'A';
     else if (average >= 80 && average < 90)
         grade = 'B';
     else if (average >= 70 && average < 80)
         grade = 'C';
     else if (average >= 60 && average < 70)
         grade = 'D';
     else
         grade = 'E';

     // It will produce the final output
     System.out.println("\nThe Total marks   = " + total + "/500.0");
     System.out.println("The Average marks = " + average);
     System.out.println("The Percentage    = " + percentage + "%");
     System.out.println("The Grade         = '" + grade + "'");
 }
}