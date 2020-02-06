package springMybatis0204_ex.customer.mapperInterface;

import java.util.List;

import springMybatis0204_ex.customer.dto.Review;

public interface ReviewMapper {
	
	public int insertReview(Review review);
	
	public List<Review> selectList(int customerId);
	
}
