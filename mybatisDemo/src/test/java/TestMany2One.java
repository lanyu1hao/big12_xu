import com.oldboy.mybatis.domain.Item;
import com.oldboy.mybatis.domain.Order;
import com.oldboy.mybatis.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * 测试多对一关系
 */
public class TestMany2One {
	@Test
	public void testInsert() throws IOException {
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(in);
		SqlSession sess = sf.openSession();

		User u = new User();
		Order o = new Order();

		o.setOrderNo("no001");
		o.setPrice(2000);
		//设置关联
		o.setUser(u);

		sess.insert("users.insert" , u) ;

		sess.insert("orders.insert" , o) ;
		sess.commit();
		sess.close();
	}

	@Test
	public void testSelectOne() throws IOException {
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(in);
		SqlSession sess = sf.openSession();
		Order o = sess.selectOne("orders.selectOne" ,3) ;

		System.out.println(o);
		sess.close();
	}

	@Test
	public void testOne2Many() throws IOException {
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(in);
		SqlSession sess = sf.openSession();
		User u = sess.selectOne("users.selectById" , 2) ;
		u.getOrders() ;
		sess.close();
	}

	@Test
	public void testInsertItem() throws IOException {
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(in);
		SqlSession sess = sf.openSession();

		Order o = new Order();
		o.setId(3);

		Item i1 = new Item();
		i1.setIname("i1");
		//i1.setOrder(o);
		sess.insert("orderitems.insert" , i1) ;
		//
		sess.commit();
		sess.close();
	}

	/**
	 * 携带两次外连接对订单查询
	 */
	@Test
	public void testSelectOrder() throws IOException {
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(in);
		SqlSession sess = sf.openSession();
		Order o = sess.selectOne("orders.selectOne" , 3) ;

		sess.commit();
		sess.close();
	}

	/**
	 * 携带两次外连接对订单查询
	 */
	@Test
	public void testSelectItem() throws IOException {
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(in);
		SqlSession sess = sf.openSession();
		Item i = sess.selectOne("orderitems.selectOne" , 1) ;
		sess.commit();
		sess.close();
	}
}
