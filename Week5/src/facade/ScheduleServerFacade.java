package facade;

/**
 * The Schedule Server Facade implementation wrapping the ScheduleServer implementation.
 * 
 * @author Vasco
 *
 */
public class ScheduleServerFacade extends ScheduleServerImpl implements ScheduleServerFacadeInterface {

	/**
	 * Constructor getting an instance of the implemented ScheduleServer.
	 * 
	 * @param scheduleServer
	 */
	public ScheduleServerFacade() {
		super();
	}
	
	/**
	 * Facade: Starting the server.
	 */
	@Override
	public void start() {
		System.out.println("FACADE: Start...");
		super.startBooting();
		super.readSystemConfigFile();
		super.init();
		super.initializeContext();
		super.createSystemObjects();
		System.out.println("Start working......"); 
		System.out.println("After work done.........");	
	}

	/**
	 * Facade: Stopping the server.
	 */
	@Override
	public void stop() {
		System.out.println("FACADE: Stop...");
		super.releaseProcesses(); 
		super.destory(); 
		super.destroySystemObjects(); 
		super.destroyListeners(); 
		super.destoryContext(); 
		super.shutdown();
	}
}
