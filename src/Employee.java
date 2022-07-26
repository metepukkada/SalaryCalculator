public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    int realYear = 2021;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        toStrings();

    }

    public double tax() {
        if (this.salary <= 1000) {

            return 0;
        } else {

            return this.salary * 0.03;
        }

    }

    public double bonus() {
        if (this.workHours > 40) {

            return ((this.workHours - 40) * 30);
        }
        return 0;
    }

    public double raiseSalary() {
        if (this.realYear - this.hireYear < 10) {

            return this.salary * 0.05;
        }
        if ((this.realYear - this.hireYear) >= 10 && (this.realYear - this.hireYear < 20)) {

            return this.salary * 0.10;
        }
        if (this.realYear - this.hireYear >= 20) {

            return this.salary * 0.15;
        }
        return 0;
    }

    public void toStrings() {
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        System.out.println("Vergi: " + this.tax());
        System.out.println("Bonus: " + this.bonus());
        System.out.println("Maaş Artışı: " + this.raiseSalary());
        System.out.println("Bonus Ve Vergilerin Tutarı: " + (this.tax() + this.bonus()));
        System.out.println("Toplam Maaş: " + (this.salary - this.tax() + this.bonus() + this.raiseSalary()));
        System.out.println("=================");

    }


}
