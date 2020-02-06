package springMybatis0204_ex.customer.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import springMybatis0204_ex.customer.dto.Review;
import springMybatis0204_ex.customer.mapperInterface.ReviewMapper;

@Repository
public class ReviewDao {
	
	@Autowired
	ReviewMapper reviewMapper;
	
	public int insertReview(Review review) {
		return reviewMapper.insertReview(review);
	}
	public List<Review> selectsList(int customerId){
		return reviewMapper.selectList(customerId);
	}
}
