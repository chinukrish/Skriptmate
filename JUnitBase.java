package com.scriptless.test.base;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.scriptless.test.configuration.JUnitConfiguration;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JUnitConfiguration.class)
public abstract class JUnitBase {
	
	@Before
	public void before()
	{
		//before
	}
	
	@Before
	public void after()
	{
		//after
	}
}