package lesson_5;

public class Main {

      public static void main(String[] args) {

          Employees[] emplArray = new Employees[5];
          emplArray[0] = new Employees("Александров", "Александр", "Александрович", "Генеральный директор",
                  "alexandrov@geekbrains.ru", "+74951111111", 100000, 45);
          emplArray[1] = new Employees("Алексеев", "Алексей", "Александрович", "Главный инженер",
                  "alekseev@geekbrains.ru", "+74952222222", 70000, 40);
          emplArray[2] = new Employees("Белов", "Максим", "Максимович", "Программист",
                  "belov@geekbrains.ru", "+74954444444", 90000, 22);
          emplArray[3] = new Employees("Иванова", "Нина", "Алексеевна", "Главный бухгалтер",
                  "ivanova@geekbrains.ru", "+74953333333", 70000, 65);
          emplArray[4] = new Employees("Борисова", "Светлана", "Борисовна", "Секретарь",
                  "info@geekbrains.ru", "+74955555555", 40000, 20);

              for (int i = 0; i < emplArray.length; i++) {
                  if (int emplArray[i].getAge() > 40) ;
                  System.out.println(emplArray(i).getAge());
              }

      }
}
