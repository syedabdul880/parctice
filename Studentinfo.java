import java.util.Scanner;

public class Studentinfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter University Name: ");
        String university = sc.nextLine();

        System.out.print("Enter Department Name: ");
        String department = sc.nextLine();

        System.out.print("Enter Total Number of Students: ");
        int totalStudents = sc.nextInt();

        System.out.println("University: " + university);
        System.out.println("Department: " + department);
        System.out.println("Total Students: " + totalStudents);
        System.out.println("Assigned Roll Numbers:");

    
        for (int i = 1; i <= totalStudents; i++) {
            if(i>77&&i<103) {
                
                continue;
            }
            System.out.println(department + "-" + i);
        }

        sc.close();
    }
}
