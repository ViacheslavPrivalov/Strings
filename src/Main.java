public class Main {
    public static void main(String[] args) {
        task1();
//        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println("Задача2");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

    }

    public static void task3() {
        System.out.println("Задача3");
        String fullName = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "
                + fullName.replace("ё", "е"));
    }
}