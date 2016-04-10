package labExercises.LongQ04;

/**
 * The Subject.
 * 
 * @author Vasco
 *
 */
public interface Subject {
	void subscribeObserver(Observer observer);
	void unSubscribeObserver(Observer observer);
	void notifyObservers();
	String subjectDetails();
}
