package PACKAGE_NAME;

public class Cat {

    String name;
    Integer age;
    CatOwner catOwner;

    public Cat(String name, Integer age, CatOwner catOwner) {
        this.name = name;
        this.age = age;
        this.catOwner = catOwner;
    }

    public static void makeRorar(){
        System.out.println("Roar roar roar");
    }
}
