import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = "helloworld")
    //@Scope("singleton") - по умолчанию "Область видимости" есть singleton
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Bean(name = "cat")//Уникальный идентификатор бина
    @Scope("prototype")
    public Cat getCat() {
        Cat cat = new Cat();
        cat.setName("Vaska");
        return cat;
    }
}