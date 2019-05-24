package ru.alishev.springcourse.singlenon_lesson;

// Тестируем
class SingletonTest {
    public static void main(String[] args) {
        Lesson7Singleton first = Lesson7Singleton.getInstance("Hello!");
        Lesson7Singleton second = Lesson7Singleton.getInstance("Goodbye!");

        // true
        System.out.println(first == second);

        // Hello!
        System.out.println(first.getValue());

        // Hello!
        System.out.println(second.getValue());
    }
}
