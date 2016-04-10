package labExercises.LongQ04;
/**
 * Subscribing and unsubscribing users from the SMS service.
 * 
 * @author Vasco
 *
 */
public class SMSUsers implements Observer {

	private Subject subject;

	private String string;
	
	/**
	 * The SMS subject
	 * @param subject
	 * @param string
	 */
	public SMSUsers(Subject subject, String string) {
		this.subject = subject;
		this.string = string;
	}

	@Override
	public void update(String desc) {
		this.string = desc;
		System.out.println(desc);
	}

	@Override
	public void subscribe() {
		this.subject.subscribeObserver(this);
		
	}

	@Override
	public void unSubscribe() {
		this.subject.unSubscribeObserver(this);
	}
}