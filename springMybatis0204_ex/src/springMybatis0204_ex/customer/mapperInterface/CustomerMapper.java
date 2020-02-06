package springMybatis0204_ex.customer.mapperInterface;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import springMybatis0204_ex.customer.dto.CustomerDto;



public interface CustomerMapper {
	
	@Select("select * from customer where customer_id=#{customerId}")
	public CustomerDto readCusId(int customerId);
	
	@Select("select * from customer where user_id=#{userId}")
	public CustomerDto readUserId(String userId);
	
//	@Select("select * from customer")
//	public List<CustomerDto> readList();
	
	public List<CustomerDto> readList();
	
	@Select("select * from customer limit #{startIndex}, #{numCnt}")
	public List<CustomerDto> readListLimit(@Param("startIndex")int startIndex, @Param("numCnt")int numCnt);
	
//	@Update("update customer set name=#{name}, birth=#{birth} where customer_id=#{customerId}")
//	public void update(CustomerDto customerDto);
	
	public void update(CustomerDto customerDto);
	
//	@Insert("insert into customer values(#{customerId},#{userId},#{name},#{birth},#{regDate})")
//	public void insert(CustomerDto customerDto);
	
	public void insert(CustomerDto customerDto);
	
	@Delete("delete from customer where customer_id=#{customerId}")
	public void deleteCusId(int customerId);
	
	@Delete("delete from customer where user_id=#{userId}")
	public void deleteUserId(String userId);
	
}
