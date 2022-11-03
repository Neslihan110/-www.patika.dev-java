public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int worHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.hireYear = hireYear;
        this.workHours = worHours;
    }
    public  double tax() {


        if (this.salary <1000) {
            return  salary;
        }else {
            double tax= salary * 0.03;
            return  tax;
        }
    }
    public int bonus() {
        if (workHours > 40) {
            int bonus=(workHours - 40)*30;
            return  bonus;
        }
        return  0;
    }
    public double raiseSalary() {
        if(hireYear <= 0 || hireYear > 2021) {
            System.out.println("Geçersiz bir çalışma yılı girdiniz!Tekrar bir çalışma yılı giriniz.");
        }else{
            int farkYil = 2021-hireYear;
            double zam;
            if (farkYil>0 && farkYil<10) {
                zam = salary * 0.05;
                return  zam;
            }else if (farkYil>9 && farkYil<20){
                zam = salary * 0.1;
                return zam;
            }else if (farkYil>19){
                zam = salary * 0.15;
                return  zam;
            }else if (farkYil == 0 ){
                return 0;
            }
        }

        return 0;
    }


    public String toString(){

        double total = salary -tax() + bonus() + raiseSalary();
        double tot = salary +bonus() - tax();
        System.out.println("Adı : "+name);
        System.out.println("Maaşı : "+ salary);
        System.out.println("Çalışma Saati : "+ workHours);
        System.out.println("Başlangıç Yılı : "+hireYear);
        System.out.println("Vergi : "+tax());
        System.out.println("Bonus : "+bonus());
        System.out.println("Maaş artışı : "+raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : "+tot);
        System.out.println("Toplam Maaş : "+total);


        return null;
    }
}

