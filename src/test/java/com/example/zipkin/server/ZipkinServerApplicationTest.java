package com.example.zipkin.server;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.zipkin.server.ZipkinServerApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ZipkinServerApplication.class)
public class ZipkinServerApplicationTest {

	@Test
	public void contextLoads() {
	}

}
