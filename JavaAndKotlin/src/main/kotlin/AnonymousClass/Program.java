package AnonymousClass;
interface HumanA{
    void think();
}
public  class Program {
    public static void main(String[] args) {
        HumanA p = new HumanA() {
            @Override
            public void think() {
                System.out.println("Think Virtually");
            }
        };
        p.think();
        A.show();
    }

}
