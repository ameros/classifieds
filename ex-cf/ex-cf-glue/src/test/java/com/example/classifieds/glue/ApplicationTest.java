package com.example.classifieds.glue;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.classifieds.realestate.advertisement.AdvertisementRepository;
import com.example.classifieds.realestate.commands.AssignAdCommandHandler;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { GlueConfiguration.class})
public class ApplicationTest {

	@Autowired Application application;

	@Test
	public void glue() {
		Assert.assertNotNull(application);
	}

}
