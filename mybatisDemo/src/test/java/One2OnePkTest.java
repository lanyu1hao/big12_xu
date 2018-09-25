import com.oldboy.mybatis.domain.User;
import com.oldboy.one2one.pk.Husband;
import com.oldboy.one2one.pk.Wife;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class One2OnePkTest {
    @Test
    public void testInsert() throws IOException {
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        //创建会话工厂(builder模式)
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(in);
        //开启会话，相当于连接
        SqlSession sess = sf.openSession();
        Husband h = new Husband();
        h.setHname("tom2");

        Wife w = new Wife();

        w.setWname("jerry2");
        w.setHusband(h);

        sess.insert("husbands.insert",h);
        sess.insert("wifes.insert",w);
        sess.commit();
        sess.close();
        System.out.println("ok");
    }


    @Test
    public void testSearch() throws IOException {
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        //创建会话工厂(builder模式)
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(in);
        //开启会话，相当于连接
        SqlSession sess = sf.openSession();
        Husband h = sess.selectOne("husbands.selectone", 1);
        sess.commit();
        sess.close();
        System.out.println("ok");
    }


    @Test
    public void tesSearch() throws IOException {
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        //创建会话工厂(builder模式)
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(in);
        //开启会话，相当于连接
        SqlSession sess = sf.openSession();
        Wife w = sess.selectOne("wifes.selectone", 1);
        sess.commit();
        sess.close();
        System.out.println("ok");
    }
}
