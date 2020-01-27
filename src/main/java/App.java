import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld beanSecond = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanSecond.getMessage());
        Cat beanCat = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat.getName());
        Cat beanCatSecond = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCatSecond.getName());

        boolean helloResult = bean == beanSecond;
        System.out.println("bean AND beanSecond = " + helloResult);
        boolean catResult = beanCat == beanCatSecond;
        System.out.println("beanCat AND beanCatSecond = " + catResult);
    }
}