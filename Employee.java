package CalcSalary;

public class Employee {
    String name; // Çalışanın ismi
    int salary; // Maaş
    int workHours; // Haftalık çalışma saati
    int hireYear; // İşe başlangıç senesi
    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    double tax(){
        double vergi;
        if(this.salary < 1000){
            return vergi = 0;
        }else{
            vergi = (double) (this.salary * 3) / 100;
            return vergi;
        }
    }
    int Bonus(){
        int bonus;
        if (this.workHours > 40) {
            bonus = (this.workHours-40) * 30;
            return bonus;
        }
        return bonus = 0;
    }
    double raiseSalary(){
        double raise;
        int duration = 2023 - this.hireYear;
        if (duration<10){
            raise =(double) (this.salary * 5) / 100;
        } else if (duration<20) {
            raise = (double) (this.salary * 10) / 100;
        }else{
            raise = (double) (this.salary * 15) / 100;
        }
        return raise;
    }
    void EmpInfo(){
        System.out.println(
                "Adı: " + this.name + "\n" +
                "Maaş: " + this.salary + "\n" +
                "Çalışma Saati: " + this.workHours + "\n" +
                "Başlangıç Yılı: " + this.hireYear + "\n" +
                "Vergi: " + tax() + "\n" +
                "Bonus: " + Bonus() + "\n" +
                "Maaş Artışı: " + raiseSalary() + "\n" +
                "Vergi ve Bonuslar ile Birlikte Maaş: " + (this.salary - tax() + Bonus()) + "\n"+
                "Toplam Maaş: " + (this.salary - tax() + Bonus() + raiseSalary())
        );
    }
}
