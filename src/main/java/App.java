import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 = applicationContext.getBean(HelloWorld.class);
        Cat cat1 = applicationContext.getBean(Cat.class);
        Cat cat2 = applicationContext.getBean(Cat.class);
        System.out.println(bean.getMessage());
        System.out.println("bean == bean1: " + (bean == bean1));
        System.out.println("cat 1 == cat 2: " + (cat1 == cat2));
        System.out.println("cat 2 == cat 1: " + (cat2 == cat1));
    }
}