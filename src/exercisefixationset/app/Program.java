package exercisefixationset.app;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    
    Set<Integer> a = new HashSet<Integer>();
    Set<Integer> b = new HashSet<Integer>();
    Set<Integer> c = new HashSet<Integer>();
    
    System.out.print("How many students for course A? ");
    int iCourseA = sc.nextInt();
    
    for (int i = 0; i < iCourseA; i++) {
      System.out.print("Id Student: ");
      int idStudent = sc.nextInt();
      a.add(idStudent);
    }
    
    System.out.print("How many students for course B? ");
    int iCourseB = sc.nextInt();
    do {
      System.out.print("Id Student: ");
      int idStudent = sc.nextInt();
      b.add(idStudent);
      iCourseB--;
    } while (iCourseB > 0);

    System.out.print("How many students for course C? ");
    int iCourseC = sc.nextInt();
    for (int i = 0; i < iCourseC; i++) {
      System.out.print("Id Student: ");
      int idStudent = sc.nextInt();
      c.add(idStudent);
    }

    Set<Integer> total = new HashSet<>(a);
    total.addAll(b);
    total.addAll(c);

    System.out.println("Total students: " + total.size());


    sc.close();
  }
}
