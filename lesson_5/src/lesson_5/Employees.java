package lesson_5;

public class Employees {
    private String surname;
    private String name;
    private String patronymic;
    private String position;
    private String email;
    private String telephone;
    private int salary;
    private int age;

    Employees(String surname, String name, String patronymic, String position, String email, String telephone, int salary, int age) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

     String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
//    public void info() {
//        System.out.println(surname + " " + name + " " + patronymic + " " + position + " " +
//                email + " " + telephone + " " + salary + " " + age);
    }
}


