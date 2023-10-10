public class Main {
    public static void main(String[] args){
        String firstName = "Ivanov ";
        String middleName = "Ivanovich";
        String lastName = "Ivan ";
        String fullName = firstName + lastName + middleName;
        System.out.println("Задание №1");
        System.out.println("Ф. И. О. сотрудника — " + fullName);
        System.out.println("Задание № 2");
        System.out.println("Ф. И. О. сотрудника — " + fullName.toUpperCase());
        System.out.println("Задание № 3");
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName);

    }
}