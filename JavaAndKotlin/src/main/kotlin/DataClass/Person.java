package DataClass;

public class Person {


    public static void main(String[] args) {
        User person1 = new User(24,"shrik");
        User person2 =  new User(24,"shrik");
//        person2.setAge(34);
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));


    }
}
