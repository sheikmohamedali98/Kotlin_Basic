import FuctionExpresion.Function;

public class Controller {
    public static void main(String[] args) {
        Function.add(10,20);
       int ans =  Function.add_in(20,30);

       System.out.println(ans);
       System.out.println("Calculate amt"+Function.calCulatAmountDefault(100,0.05));
        System.out.println("Calculate amt Overload"+Function.calCulatAmountDefault(100));
        System.out.println("Calculate amt"+Function.calCulatAmount(100,0.05));

    }
}
