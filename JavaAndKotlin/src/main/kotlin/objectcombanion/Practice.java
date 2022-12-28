package objectcombanion;

public class Practice {
    public static void main(String[] args) {
        PracticeObject prct = new PracticeObject();
        PracticeObject.setName("mohamwede");
        PracticeObject.friend.INSTANCE.setAge(24);
        System.out.println(PracticeObject.Companion.getName());
        System.out.println(PracticeObject.friend.INSTANCE.getAge());
man.INSTANCE.setDob("qerwtrty");
        System.out.println(man.INSTANCE.getDob());


    }
}
