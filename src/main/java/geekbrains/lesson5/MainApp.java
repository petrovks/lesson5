package geekbrains.lesson5;

public class MainApp {
    public static void main(String[] args) {
        Persons[] persons = new Persons[5];
        persons[0] = new Persons("Артур Пирожков", "инженер", "artur@bk.ru", "89152556464", 50000, 26);
        persons[1] = new Persons("Алексей Марутин", "менеджер", "alexey@bk.ru", "89142543264", 35000, 20);
        persons[2] = new Persons("Владимир Ленин", "главный инженер", "vladimir@bk.ru", "89252554444", 100000, 52);
        persons[3] = new Persons("Ирина Дубинка", "бухгалтер", "irina@bk.ru", "89142666464", 80000, 45);
        persons[4] = new Persons("Константин Петров", "директор", "konstantin@bk.ru", "89031112222", 120000, 33);


        for (Persons a: persons) {
            if(a.getAge() >= 40) {
                a.printInfo();
            }
        }

    }
}
