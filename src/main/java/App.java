import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        Cat catOne = (Cat) applicationContext.getBean("cat");
        Cat catTwo = (Cat) applicationContext.getBean("cat");

        System.out.println("Первая пара - " + (bean == bean1));
        System.out.println("Вторая пара - " + (catOne == catTwo));

        System.out.println(bean.getMessage());
        System.out.println(catOne.getFirstName());
    }
}