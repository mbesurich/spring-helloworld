import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld HWBean1 = applicationContext.getBean("helloworld", HelloWorld.class);
        HelloWorld HWBean2 = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(HWBean1 == HWBean2);

        Cat CBean1 = applicationContext.getBean("cat", Cat.class);
        Cat CBean2 = applicationContext.getBean("cat", Cat.class);
        System.out.println(CBean1 == CBean2);
    }
}