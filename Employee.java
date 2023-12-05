package java101;

public class Employee {
    String adSoyad;
    int maas;
    int haftalikSaat;
    int isBaslangicYili;
    int vergi;
    int zam;
    int bonus;

    Employee(String adSoyad, int maas, int haftalikSaat, int isBaslangicYili) {
        this.adSoyad = adSoyad;
        this.maas = maas;
        this.haftalikSaat = haftalikSaat;
        this.isBaslangicYili = isBaslangicYili;

    }

    int tax() {
        int vergi;
        if (this.maas < 1000) {
            return vergi = 0;
        } else if (this.maas >= 1000) {
            return vergi = (int) (this.maas * 0.03);
        } else {
            System.out.println("Yanlış değer girişi yaptınız.");
            return 0;
        }
    }

    int bonus() {
        int bonus;
        if (haftalikSaat > 40) {
            return bonus = (40 - this.haftalikSaat) * 30;
        } else {
            return bonus = 0;
        }
    }

    int raiseSalary() {
        int zam;
        int baslangicYil = 2021;
        if (isBaslangicYili < 10) {
            return zam = (int) (this.maas * 0.05);
        } else if (isBaslangicYili > 9 && isBaslangicYili < 20) {
            return zam = (int) (this.maas * 0.10);
        } else if (isBaslangicYili > 19) {
            return zam = (int) (this.maas * 0.15);
        } else {
            return zam = 0;
        }
    }

     public void tostring(){
        Employee employee = new Employee(this.adSoyad, this.maas, this.haftalikSaat, this.isBaslangicYili);
        System.out.println("Ad - Soyad: " + this.adSoyad);
        System.out.println("Maaş : " + this.maas);
        System.out.println("Çalışma Saati: " + this.haftalikSaat);
        System.out.println("Başlangıç Yılı: " + this.isBaslangicYili);
        System.out.println("Vergi: " + this.tax());
        System.out.println("Bonus: " + this.bonus());
        System.out.println("Maaş Toplam Artışı " +this.tax()+this.bonus()+this.raiseSalary());
        System.out.println("Yeni Maaş" + this.maas + this.tax()+this.bonus()+this.raiseSalary());
    }

}
