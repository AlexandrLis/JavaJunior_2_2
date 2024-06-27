import java.lang.reflect.Field;
import java.time.Instant;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class RandomDateAnnotation {

    public static void generateAnnotationMethod(Object object) throws Exception{

        java.util.Random random = new java.util.Random();

        Class<?> classObject = object.getClass();
        Field[] declaredFields = classObject.getDeclaredFields();
        for (Field field : declaredFields) {
            if(field.isAnnotationPresent(RandomDate.class)){
                RandomDate annotation = field.getAnnotation(RandomDate.class);
                long minimum = annotation.min();
                long maximum = annotation.max();

                Date dateMin = new Date(TimeUnit.SECONDS.toMillis(random.nextLong(minimum, maximum)));
                Date dateMax = new Date(TimeUnit.SECONDS.toMillis(random.nextLong(minimum, maximum)));
                if(maximum > minimum){
                    field.set(object, dateMin);
                }
                else if(minimum > maximum){
                    field.set(object, dateMax);
                }
            }
        }
    }
}
