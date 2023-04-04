import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * task1_1
 */
public class task1 {
    public static void main(String[] args) {
        //разбор дз, что делать с логгером
        Logger logger = Logger.getLogger("logger");
        logger.setUseParentHandlers(false); // не показывать логи в консоле
        logger.config("test.txt");
        logger.log(Level.WARNING, "warning");


        // разбор дз, как распарсить джисон с помощью стрингбилдера
        
        String myObj = "{\"name\": \"vasya\"}";
        logger.info("JSON string created");
        System.out.println(myObj);
        StringBuilder builder = new StringBuilder(myObj);
        builder.delete(0, builder.indexOf("\"")+1);
        System.out.println(builder);
        builder.deleteCharAt(builder.indexOf("\""));
        System.out.println(builder);
        String field = builder.substring(0, builder.indexOf(":"));
        System.out.println(field);
        String name = builder.substring(builder.indexOf("\"")+1, builder.lastIndexOf("\""));
        System.out.println(name);
        System.out.println(String.format("Parametr %s: %s", field, name));
    }


}