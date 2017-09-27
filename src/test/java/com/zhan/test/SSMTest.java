package com.zhan.test;

import java.sql.DriverManager;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhan.user.entity.TUser;
import com.zhan.user.service.IUserService;
//@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
//@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
public class SSMTest
{
	
	@SuppressWarnings("unused")
	private static Logger logger = Logger.getLogger(SSMTest.class);  
	//  private ApplicationContext ac = null;  
	    @Resource  
	    private IUserService userService = null;  
	  
	@Before  
	public void before() {  
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");  
		userService = (IUserService) ac.getBean("userService");
		System.out.println(ac.getBean("userMapper"));
	}  
	  
	public void tesss() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		DriverManager.getConnection("jdbc:mysql://localhost:3306/phone", "root", "jense77");
	}
	  
	@Test
	public void smTest(){
//		insert
		userService.insert(new TUser("lisi","lixiaosi"));
		
		
		//delete
//		userService.deleteById(1);
		
		//update
//		userService.update(new TUser(2,"zhangsan","zhangsansan"));
		
		//select
//		TUser user = userService.getTUserByUsername(new TUser(2,"",""));
//		System.out.println("id:"+user.getId()+",name:"+user.getUsername()+",passwor:"+user.getPassword());
	}
		
		
}
