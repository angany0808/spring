package test;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import springMybatis0204_ex.customer.dao.CustomerDao;
import springMybatis0204_ex.customer.dao.ReviewDao;
import springMybatis0204_ex.customer.dto.CustomerDto;
import springMybatis0204_ex.customer.dto.Review;
import springMybatis0204_ex.customer.mapperInterface.ReviewMapper;
import springMybatis0204_ex.customer.service.ReviewWriteService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/springContext.xml")
public class MyTest {
	
	@Autowired
	private CustomerDao customerDao;
	@Autowired
	private ReviewDao reviewDao;
	@Autowired
	private ReviewWriteService reviewWriteService;
	
	
	@Test
	public void insertTest() {
		reviewWriteService.reviewWriteService(1);
	}
	
	
}
