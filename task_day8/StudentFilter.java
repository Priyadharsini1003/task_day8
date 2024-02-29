package task_day8;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudentFilter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> students = new ArrayList<>();
      
        System.out.println("Enter the names of 10 students:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            students.add(scanner.nextLine());
        }

        List<String> studentsWithA = students.stream()
                                             .filter(name -> name.startsWith("A"))
                                             .collect(Collectors.toList());
        
        System.out.println("Students whose names start with 'A': " + studentsWithA);
        
        scanner.close();
    }
}

