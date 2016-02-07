package facade;

/**
 * The Server implementation as is done by the client.
 * 
 * @author Vasco
 *
 */
public class ScheduleServerImpl implements ScheduleServer {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void startBooting() {
		System.out.println("startBooting...");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void readSystemConfigFile() {
		System.out.println("readSystemConfigFile...");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void init() {
		System.out.println("init...");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void initializeContext() {
		System.out.println("initializeContext...");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void initializeListeners() {
		System.out.println("initializeListeners...");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void createSystemObjects() {
		System.out.println("createSystemObjects...");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void releaseProcesses() {
		System.out.println("releaseProcesses...");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void destory() {
		System.out.println("destroy...");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void destroySystemObjects() {
		System.out.println("destroySystemObjects...");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void destroyListeners() {
		System.out.println("destroyListeners...");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void destoryContext() {
		System.out.println("destroyContext...");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void shutdown() {
		System.out.println("shutdown...");
	}

}
