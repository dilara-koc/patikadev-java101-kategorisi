public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax;
    int year;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.year = 2021;
    }

    public double tax() {
        if (this.salary <= 1000) {
            return this.tax = 0;
        } else {
            return (this.salary * 0.03);
        }
    }

    public double bonus() {
        if (this.workHours >= 40) {
            return ((this.workHours - 40) * 30);
        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        if ((this.year-this.hireYear) < 10) {
            return this.salary * 0.05;
        } else if (((this.year-this.hireYear) > 9) && ((this.year-this.hireYear) < 20)) {
            return this.salary * 0.10;
        } else {
            return this.salary * 0.15;
        }
    }

    public void toStringX() {
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma saati: " + this.workHours);
        System.out.println("Başlangıç yılı: " + this.hireYear);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maaş artışı: " + raiseSalary());
        System.out.println("Vergi ve bonuslar ile birlikte maaş: " + (this.salary - tax() + bonus()));
        System.out.println("Toplam maaş: " + (this.salary + raiseSalary()));
    }
}
