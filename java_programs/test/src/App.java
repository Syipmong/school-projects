import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args){
        List<String> names = new ArrayList<>();
        names.add("Said");
        names.add("Joshua");
        names.add("Kane");

        for (String name : names) {
            System.out.println(name);
        }

        List<Integer> ages = new ArrayList<>();
        ages.add(20);
        ages.add(25);
        ages.add(30);
        for (Integer age : ages){
            System.out.println(age);
        }


        YipmongFamily<String> mem = new YipmongFamily<>();
        //mem.setMember("YipmongSaid");
        mem.setMember("Shuaib");
        // mem.setMember("Kane");
        // mem.setMember("Joshua");
        // mem.setMember("Joshua");

        
            System.out.println(mem.getMember());
        // int[] arr = new int[5];

        // arr[0] = 1;
        // arr[2] = 5;

        // System.out.println(arr.length);
        
        // for(int i = 0; i < arr.length; i++){
        //     System.out.print(arr[i]);
        // }

        // int addNum(int num1, int num2){
        //     int sum = num1 + num2;
        //     return sum;
        // }

        // addNum(20, 15);

        // int addNumbers(int num1, int num2) {
        // int sum = num1 + num2;
        // return sum;
        // }
        //System.out.println(addNum(2,5));
    //     MyTest obj = new MyTest();
    //     System.out.println(obj.getNumber());

    // }
    
    //     static int addNum(int num1, int num2){
    //     int sum = num1 + num2;
    //     return sum;

    Animal myAnimal = new Dog();
    myAnimal.eat();
    }
}


class MyTest {
    public MyTest(){
    
    }
    public int getNumber(){
    return 0;
    }
    
}

class Animal{
    public void eat(){
        System.out.println("Animals eat");
    }
    public void walk(){
        System.out.println("Animals walk");
    }
    public void makeSound(){
        System.out.print("Animals make sound");
    }
}


class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("Dogs eat food");
    }
    @Override
    public void makeSound(){
        System.out.println("Dogs make sound by Barking");
    }
    @Override
    public void walk(){
        System.out.println("Dogs walk on 4 legs");
    }
}

class YipmongFamily<Family>{
    private Family member;

    public void setMember(Family member){
        this.member = member;
    }
    public Family getMember(){
        return member;
    }
}



// class CollectionsExample{
//     void collections(){
//         List<String> list = new ArrayList<>();
//     }
// }









// public interface BazeSchool {
//     void students();
    
// }

// public class Law implements BazeSchool {

//     public void students(){
//         System.out.print("We are baze Law Students");
//     }
    
// }