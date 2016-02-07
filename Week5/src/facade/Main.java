package facade;

public class Main {

	public static void main(String[] args) {
		ScheduleServerFacade scheduleServer = new ScheduleServerFacade();
		
		scheduleServer.start();
		scheduleServer.stop();
	}
}
