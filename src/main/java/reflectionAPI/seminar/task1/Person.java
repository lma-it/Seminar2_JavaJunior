package reflectionAPI.seminar.task1;

public class Person {
    private String name;
    private int age;

    public Person(){
        name = "Name";
        age = 25;
    }

    public void displayInfo(){
        System.out.printf("Имя: %s; Возраст: %s\n", name, age);
    }
}