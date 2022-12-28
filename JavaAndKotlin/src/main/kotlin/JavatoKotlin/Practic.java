package JavatoKotlin;
import static  JavatoKotlin.AnnotationKt.*;

public class Practic {
    public static void main(String[] args) {
        System.out.println(AnnotationKt.sum(10,20));
        System.out.println(AnnotationKt.getColor(COLOR.BLUE));
        AnnotationKt.respond("yes");
        System.out.println();
        AnnotationKt.colorMix(COLOR.ORANGE,COLOR.RED);
        AnnotationKt.updateWhether(25);
        AnnotationKt.map();
        AnnotationKt.list();
        AnnotationKt.forloop();
        System.out.println(AnnotationKt.whenCondition('a'));
        AnnotationKt.stringRange();
        System.out.println (AnnotationKt.repeat("sheik",3));
    }
}
