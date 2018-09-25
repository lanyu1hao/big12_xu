import com.oldboy.sm.domain.User;
import com.oldboy.sm.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {

    @Test
    public void test() throws Exception {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        DataSource ds = (DataSource) ac.getBean("dataSource");
        Connection conn = ds.getConnection();
        Statement sta = conn.createStatement();
        ResultSet set = sta.executeQuery("select version()");
        if(set.next()){
            String s = set.getString(1);
            System.out.println(s);
        }
        set.close();
        sta.close();
        conn.close();
    }

    @Test
    public void testInsert() throws Exception {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        UserService us = (UserService) ac.getBean("userService");
        User u = new User();
        u.setName("uuuuuuu");
        u.setAge(444444);
        us.insertUser(u);

    }
}
