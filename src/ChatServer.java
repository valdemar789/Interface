public class ChatServer {

    private ServerGUI server;

    public void start(int port) {
        if (server != null && server.isAlive()) {
            System.out.println("Server already stared");
        } else {
            server = new ServerGUI("Chat server", port);
        }
    }

    public void stop() {
        if (server == null || !server.isAlive()) {
            System.out.println("Server is not running");
        } else {
            server.interrupt();
        }
    }
}
