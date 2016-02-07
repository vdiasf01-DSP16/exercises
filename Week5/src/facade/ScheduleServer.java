package facade;

/**
 * Client's ScheduleServer
 * 
 * @author Vasco
 *
 */
public interface ScheduleServer {
	
	void startBooting();
	void readSystemConfigFile();
	void init();
	void initializeContext();
	void initializeListeners();
	void createSystemObjects();
	void releaseProcesses();
	void destory();
	void destroySystemObjects();
	void destroyListeners();
	void destoryContext();
	void shutdown();
}
