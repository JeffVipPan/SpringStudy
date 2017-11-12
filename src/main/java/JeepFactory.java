import org.springframework.beans.factory.FactoryBean;

/**
 * @author 潘峰
 * @date 2017/11/11 下午10:45
 */
public class JeepFactory implements FactoryBean<Jeep> {

    public Jeep getObject() throws Exception {
        return new Jeep();
    }

    public Class<?> getObjectType() {
        return Jeep.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
