package springMybatis0204_ex.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springMybatis0204_ex.customer.dao.CustomerDao;
import springMybatis0204_ex.customer.dao.ReviewDao;
import springMybatis0204_ex.customer.dto.CustomerDto;

@Service
public class ReviewWriteService {
	
	@Autowired
	CustomerDao customerDao;
	@Autowired
	ReviewDao reviewDao;
	
	public void reviewWriteService(int customerId) {
		CustomerDto customerDto = customerDao.readCusId(customerId);
		
		int cnt = reviewDao.selectsList(customerDto.getCustomerId()).size();
		
		customerDto.setReviewCnt(cnt);
		
		customerDao.update(customerDto);
	}
	
}
