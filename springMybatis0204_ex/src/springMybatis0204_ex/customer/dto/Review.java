package springMybatis0204_ex.customer.dto;

public class Review {
	private int reviewId;
	private int customerId;
	private String review;
	public Review(int reviewId, int customerId, String review) {
		super();
		this.reviewId = reviewId;
		this.customerId = customerId;
		this.review = review;
	}
	public Review() {
		super();
	}
	public int getReviewId() {
		return reviewId;
	}
	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", customerId=" + customerId + ", review=" + review + "]";
	}
		
}
