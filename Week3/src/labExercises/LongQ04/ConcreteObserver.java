package labExercises.LongQ04;

public class ConcreteObserver implements Observer {

	private ConcreteSubject cSubject;

	public ConcreteObserver(ConcreteSubject cObject) {
		this.cSubject = cObject;
	}
	
	@Override
	public void update(String desc) {
		System.out.println("Description: "+desc);
	}

	@Override
	public void subscribe() {
		this.cSubject.subscribeObserver(this);
	}

	@Override
	public void unSubscribe() {
		this.cSubject.unSubscribeObserver(this);
	}
}
