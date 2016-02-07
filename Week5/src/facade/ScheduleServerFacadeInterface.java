package facade;

/**
 * Our facade interface which wraps the ScheduleServer interface.
 * 
 * @author Vasco
 *
 */
public interface ScheduleServerFacadeInterface extends ScheduleServer {
	
	/**
	 * Starting the server.
	 */
	public void start();

	/**
	 * Stopping the server.
	 */
	public void stop();
}
