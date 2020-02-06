package springMybatis0204_ex.customer.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import springMybatis0204_ex.customer.dto.CustomerDto;
import springMybatis0204_ex.customer.mapperInterface.CustomerMapper;


@Repository
public class CustomerDao {
	
	@Autowired
	private CustomerMapper customerMapper;
	
	public void insert(CustomerDto customerDto) {
		customerMapper.insert(customerDto);
	}
	
	public void update(CustomerDto customerDto) {
		customerMapper.update(customerDto);
	}
	
	public void deleteCusId(int customerId) {
		customerMapper.deleteCusId(customerId);
	}
	public void deleteUserId(String userId) {
		customerMapper.deleteUserId(userId);
	}
	public CustomerDto readCusId(int customerId) {
		return customerMapper.readCusId(customerId);
	}
	public CustomerDto readUserId(String userId) {
		return customerMapper.readUserId(userId);
	}
	public List<CustomerDto> readList(){
		return customerMapper.readList();
	}
	public List<CustomerDto> readListLimit(int startIndex, int numCnt){
		return customerMapper.readListLimit(startIndex, numCnt);
	}
	
}
