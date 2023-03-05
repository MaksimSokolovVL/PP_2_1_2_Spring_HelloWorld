import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHW =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2HW =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHW.getMessage());
        System.out.println(beanHW == bean2HW);


        Cat beanCat = (Cat) applicationContext.getBean("getCat");
        Cat beanCat2 = (Cat) applicationContext.getBean("getCat");

        System.out.println(beanCat == beanCat2);



    }
}