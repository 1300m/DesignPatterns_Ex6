package facade;

public class ServerManager {
    private ScheduleServer scheduleServer;

    public ServerManager() {
        scheduleServer = new ScheduleServer();
    }

    public void startServer() {
        scheduleServer.startBooting();
		scheduleServer.readSystemConfigFile();
		scheduleServer.init();
		scheduleServer.initializeContext();
		scheduleServer.initializeListeners();
		scheduleServer.createSystemObjects();
		System.out.println("Start working......");
    }

    public void stopServer() {
        System.out.println("After work done.........");
		scheduleServer.releaseProcesses();
		scheduleServer.destory();
		scheduleServer.destroySystemObjects();
		scheduleServer.destoryListeners();
		scheduleServer.destoryContext();
		scheduleServer.shutdown();
    }
}
