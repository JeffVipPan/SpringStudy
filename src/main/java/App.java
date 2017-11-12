import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author �˷�
 * @date 2017/11/11 ����10:07
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyConfig.class );
        MyBean myBean =  annotationConfigApplicationContext.getBean(MyBean.class);
        System.out.println(myBean.toString());
        Jeep jeep = annotationConfigApplicationContext.getBean(Jeep.class);
        System.out.println(jeep.toString());
        annotationConfigApplicationContext.close();
    }
}
