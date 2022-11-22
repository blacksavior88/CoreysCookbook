package java.basics.variables.main;

public class Main {
  public static void main(String[] args) {

    int total = 3;
    int grade4;
    grade4 = 4;
    System.out.println(total);
    System.out.println(grade4);

    // int 2much; // invalid variable name

    int intSum = 100;
    int studentCount = 5;
    int studentTeacherRation = 6;
    int level2Count = 1;
    System.out.println(intSum);
    System.out.println(studentCount);
    System.out.println(studentTeacherRation);
    System.out.println(level2Count);

    int myVar;
    myVar = 50;

    System.out.println(myVar);
    int anotherVar = 100;
    System.out.println(anotherVar);

    myVar = anotherVar;
    System.out.println(myVar);

    final int maxStudents = 25;
    final int someVariable;
    int someOtherVariable = 100;
    someVariable = someOtherVariable;
    System.out.println(someVariable);
    // maxStudents = 4; //The final local variable maxStudents cannot be assigned.
    // It must be blank and not using a compound
    System.out.println(maxStudents);
  }
}