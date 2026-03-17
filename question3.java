class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class question3 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Aman", 40000);
        Employee e2 = new Employee("Ravi", 60000);
        Employee e3 = new Employee("Neha", 70000);

        Employee arr[] = {e1, e2, e3};

        for(int i = 0; i < arr.length; i++) {
            if(arr[i].salary > 50000) {
                System.out.println(arr[i].name + " " + arr[i].salary);
            }
        }
    }
}