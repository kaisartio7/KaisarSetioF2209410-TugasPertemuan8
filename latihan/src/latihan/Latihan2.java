/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan;

/**
 *
 * @author Acer
 */class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //@Override di-override untuk memberikan representasi string dari objek Person 
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}

// Kelas Person
class Person {
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String emailAddress;

    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Person: " + name;
    }
}

// Kelas Student
class Student extends Person {
    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private String status;

    public Student(String name, String address, String phoneNumber, String emailAddress, String status) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student: " + name;
    }
}

// Kelas Employee
class Employee extends Person {
    private String office;
    private double salary;
    private MyDate hireDate;

    public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate hireDate) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee: " + name;
    }
}

// Kelas Faculty
class Faculty extends Employee {
    private int officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate hireDate, int officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary, hireDate);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty: " + name;
    }
}

// Kelas Staff
class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate hireDate, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, hireDate);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff: " + name;
    }
}
public class Latihan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Membuat objek untuk setiap kelas
        Person person = new Person("Rasyid", "Bandung", "8899922", "acid@gmail.com");
        Student student = new Student("Farrell", "Cimahi", "223344", "rell@gmail.com", Student.SENIOR);
        Employee employee = new Employee("Putra", "Unpas", "557766", "puutt@example.com", "A101", 50000, new MyDate(2020, 5, 15));
        Faculty faculty = new Faculty("Fatih", "Gerlong", "5553456", "Tihh@gmail.com", "B202", 80000, new MyDate(2018, 9, 20), 40, "Professor");
        Staff staff = new Staff("Yogi", "Garut", "5557890", "YMS@gmail.com", "C303", 40000, new MyDate(2019, 3, 10), "Assistant");

        // Memanggil metode toString() untuk setiap objek
        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
    
}
