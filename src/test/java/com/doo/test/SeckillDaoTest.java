package com.doo.test;

import java.nio.MappedByteBuffer;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.doo.dao.SeckillDao;
import com.doo.entity.Seckill;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SeckillDaoTest {
	@Autowired
	private SeckillDao seckillDao;
	
	@Test
	public void testQueryById(){
		
		long seckillId = 1000;
		//SeckillDao mDao =  sqlSession.getMapper(SeckillDao.class);
		
		Seckill seckill = seckillDao.queryById(seckillId);
		System.out.println(seckill.getName());
	}
}
