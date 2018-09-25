import com.oldboy.many2many.Student;
import com.oldboy.many2many.Teacher;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Many2Many {
    public static void main(String[] args) throws Exception {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(in);
        SqlSession sess = sf.openSession();
        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher();

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();

        t1.addStudent(s1 , s2 , s3);
        t2.addStudent(s2 , s3 , s4);

        sess.insert("teas.insert" , t1);
        sess.insert("teas.insert" , t2);

        sess.insert("stus.insert" , s1);
        sess.insert("stus.insert" , s2);
        sess.insert("stus.insert" , s3);
        sess.insert("stus.insert" , s4);

        sess.insert("teas.insertLink" , t1);
        sess.insert("teas.insertLink" , t2);

        sess.commit();
    }
}
