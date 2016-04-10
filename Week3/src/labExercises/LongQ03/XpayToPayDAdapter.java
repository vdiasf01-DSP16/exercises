package labExercises.LongQ03;

/**
 * The Xpay to PayD Adapter.
 * 
 * @author Vasco
 *
 */
public class XpayToPayDAdapter implements Xpay {
	
	/**
	 * The payD implementation to adapt to.
	 */
	private PayD payD;

	public XpayToPayDAdapter(PayD payD) {
		this.payD = payD;
	}
	
	@Override
	public String getCreditCardNo() {
		return payD.getCustCardNo();
	}

	@Override
	public void setCreditCardNo(String creditCardNo) {
		payD.setCustCardNo(creditCardNo);
	}

	@Override
	public String getCustomerName() {
		return payD.getCardOwnerName();
	}

	@Override
	public void setCustomerName(String customerName) {
		payD.setCardOwnerName(customerName);
	}

	@Override
	public String getCardExpMonth() {
		return payD.getCardExpMonthDate();
	}

	@Override
	public void setCardExpMonth(String cardExpMonth) {
		payD.setCardExpMonthDate(cardExpMonth);
	}

	@Override
	public String getCardExpYear() {
		return null;
	}

	@Override
	public void setCardExpYear(String cardExpYear) {
	}

	@Override
	public Short getCardCVVNo() {
		return payD.getCVVNo().shortValue();
	}

	@Override
	public void setCardCVVNo(Short cardCVVNo) {
		payD.setCVVNo(cardCVVNo.intValue());
	}

	@Override
	public Double getAmount() {
		return payD.getTotalAmount();
	}

	@Override
	public void setAmount(Double amount) {
		payD.setTotalAmount(amount);
	}
}
