import java.util.Scanner;

public class SIAKADDynamic<AbsenteeNo> {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numStudents, numCourses;
        
    
        System.out.println("--- DYNAMIC SIAKAD GRADING PROGRAM ---");
        System.out.print("Enter the number of students: ");
        numStudents = sc.nextInt();
        
        System.out.print("Enter the number of courses: ");
        numCourses = sc.nextInt();
        sc.nextLine(); 

    
        int[][] score = new int[numStudents][numCourses];
   
        int sumForEachStudent;
        
        System.out.println("\n--- INPUT GRADE DATA ---");

     
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter scores for student #" + (i + 1));
            sumForEachStudent = 0;
            
            for (int j = 0; j < numCourses; j++) {
                System.out.print("Course #" + (j + 1) + " score: ");
                score[i][j] = sc.nextInt();
                sumForEachStudent += score[i][j];
            }
        
            double averageStudent = (double) sumForEachStudent / numCourses;
            System.out.printf("Average score: %.2f\n\n", averageStudent);
        }

        System.out.println("\n--- AVERAGE GRADE PER COURSE ---");
        
   
        for (int j = 0; j < numCourses; j++) { 
            double sumForEachCourse = 0;
            
            for (int i = 0; i < numStudents; i++) { 
                sumForEachCourse += score[i][j];
            }
            
            double averageCourse = sumForEachCourse / numStudents;
            System.out.printf("Course %d: %.2f\n", (j + 1), averageCourse);
        }

        sc.close();
    }
}