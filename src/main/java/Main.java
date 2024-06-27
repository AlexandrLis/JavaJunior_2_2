import java.time.LocalDate;
import java.util.Date;



public class Main {
    public static void main(String[] args) throws Exception{


        ObjectCreator objectCreator = new ObjectCreator();

        RandomDateAnnotation.generateAnnotationMethod(objectCreator);
        System.out.println(objectCreator.getData());
        System.out.println(objectCreator.getNowData());

    }
}
