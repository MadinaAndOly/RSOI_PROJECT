package rsoi.Util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.annotations.common.annotationfactory.AnnotationFactory;

import java.io.File;


/**
 * Created by madina on 11.05.14.
 */
public class HibernateUtil {
    private static final SessionFactory sessionFactory
            = configureSessionFactory();

    /**
     * ???????? ???????
     * @return {@link SessionFactory}
     * @throws HibernateException
     */
    private static SessionFactory configureSessionFactory()
            throws HibernateException {

       Configuration configuration = new Configuration().configure(new File("src/hibernate.cfg.xml"));

        StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());

        return configuration.buildSessionFactory(ssrb.build());
    }

    /**
     * ???????? ??????? ??????
     * @return {@link SessionFactory}
     */
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
