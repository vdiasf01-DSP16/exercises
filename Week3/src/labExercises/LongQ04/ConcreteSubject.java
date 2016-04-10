package labExercises.LongQ04;

public class ConcreteSubject implements Subject {

	private ConcreteObserver cObserver;
	
	public ConcreteSubject(ConcreteObserver cObserver) {
		this.cObserver = cObserver;
	}

	@Override
	public void subscribeObserver(Observer observer) {
		cObserver.subscribe();
	}

	@Override
	public void unSubscribeObserver(Observer observer) {
		
	}

	@Override
	public void notifyObservers() {
		
	}

	@Override
	public String subjectDetails() {
		return null;
	}

}
