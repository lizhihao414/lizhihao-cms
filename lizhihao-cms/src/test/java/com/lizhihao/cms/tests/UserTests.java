package com.lizhihao.cms.tests;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lizhihao.cms.dao.ArticleDao;
import com.lizhihao.cms.dao.UserDao;
import com.lizhihao.cms.pojo.Article;
import com.lizhihao.cms.pojo.ArticleTag;
import com.lizhihao.cms.pojo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class UserTests {
	@Autowired
	private UserDao userDao;
	@Autowired
	private ArticleDao articleDao;
	
	@Test
	public void test() {

		/*
		 * List<User> userList = userDao.select(null); System.out.println(userList);
		 * 
		 * User selectById = userDao.selectById(199); System.out.println(selectById);
		 * 
		 * int delete = userDao.delete("153"); System.out.println(delete);
		 */
		List<ArticleTag> list = articleDao.select(null);
		System.out.println(list);
	}
}
