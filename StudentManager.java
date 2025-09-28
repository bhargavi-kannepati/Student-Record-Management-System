import java.util.HashMap;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        HashMap<String, String> students = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Student\n2. View Student\n3. Update Student\n4. Delete Student\n5. Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter Student ID: ");
                    String idAdd = scanner.nextLine();
                    System.out.print("Enter Student Name: ");
                    String nameAdd = scanner.nextLine();
                    students.put(idAdd, nameAdd);
                    System.out.println("Student added.");
                    break;

                case "2":
                    System.out.print("Enter Student ID to view: ");
                    String idView = scanner.nextLine();
                    String nameView = students.get(idView);
                    if (nameView != null) {
                        System.out.println("Name: " + nameView);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case "3":
                    System.out.print("Enter Student ID to update: ");
                    String idUpdate = scanner.nextLine();
                    if (students.containsKey(idUpdate)) {
                        System.out.print("Enter new name: ");
                        String nameUpdate = scanner.nextLine();
                        students.put(idUpdate, nameUpdate);
                        System.out.println("Student updated.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case "4":
                    System.out.print("Enter Student ID to delete: ");
                    String idDelete = scanner.nextLine();
                    if (students.containsKey(idDelete)) {
                        students.remove(idDelete);
                        System.out.println("Student deleted.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case "5":
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}