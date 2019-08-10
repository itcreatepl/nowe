package PACKAGE_NAME;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat("kot1",1,(new CatOwner("Bronek"))));
        catList.add(new Cat("kot2",1,(new CatOwner("Bronek"))));
        catList.add(new Cat("kot3",1,(new CatOwner("Bronek"))));
        catList.add(new Cat("kot4",1,(new CatOwner("Bronek"))));

        allCatsmakeRorar(catList);

    }
    static  void allCatsmakeRorar(List<Cat> list){
        for (Cat cat: list) {
            cat.makeRorar();
        }

    }


}