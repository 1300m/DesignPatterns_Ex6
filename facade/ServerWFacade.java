package facade;

public class ServerWFacade {
    public static void main(String[] args) {
        ServerManager serverManager = new ServerManager();

        serverManager.startServer();

        serverManager.stopServer();
    }
}
