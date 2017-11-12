import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 潘峰
 * @date 2017/11/11 下午10:10
 */
@Configuration
public class MyConfig {

    @Bean
    public MyBean getMyBen() {
        return new MyBean();
    }

    @Bean
    public Jeep getJeep() {
        return new Jeep();
    }

}
