import java.util.Scanner;

class Employeed {
    int empNo;
    String name;
    String phoneNumber;
    Employeed(int empNo, String name, String phoneNumber) {
        this.empNo = empNo;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    void displayDetails() {
        System.out.println("Employee No: " + empNo);
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
    }
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employeed[] employees = new Employeed[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter employee number: ");
            int empNo = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Enter employee name: ");
            String name = sc.nextLine();
            System.out.print("Enter phone number: ");
            String phoneNumber = sc.nextLine();
            employees[i] = new Employeed(empNo, name, phoneNumber);
        }
        System.out.println("\nEmployee Details:");
        for (Employeed emp : employees) {
            emp.displayDetails();
            System.out.println();
        }
    }
    }
