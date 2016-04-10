package labExercises.LongQ04;

import java.util.ArrayList;
import java.util.List;

public class CommentaryObject implements Commentary {
	
	private List<Observer> observerList;

	private String commentaryDescription;

	public CommentaryObject(ArrayList<Observer> arrayList, String string) {
		this.observerList = arrayList;
		this.commentaryDescription = string;
	}

	@Override
	public void subscribeObserver(Observer observer) {
	    observerList.add(observer);
	}

	@Override
	public void unSubscribeObserver(Observer observer) {
	    observerList.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for ( Observer o : observerList ) {
			o.update(subjectDetails());
		}
	}

	@Override
	public String subjectDetails() {
		return commentaryDescription;
	}

	@Override
	public void setDesc(String desc) {
		this.commentaryDescription = desc;
		notifyObservers();
	}

}
