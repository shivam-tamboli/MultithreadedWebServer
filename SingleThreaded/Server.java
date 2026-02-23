
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
public class Server{

    public void run(){

        int port = 8010;
        ServerSocket socket =  new ServerSocket(port);
        socket.setSoTimeout(10000);
        while (true){
            try{
                System.out.println("Server is listening on port" + port);
                Socket acceptedConnectiom = socket.accept();
                System.out.println("Connection accepted from " + acceptedConnectiom.getRemoteSocketAddress());
                PrintWriter toClient = new PrintWriter(acceptedConnectiom.getOutputStream());
                BufferReader fromClient = new BufferReader(new InputStreamReader(acceptedConnectiom.getInputStream()));
                toClient.println("Hello from the Server");
            }catch (IoException ex){
                ex.printStackTrace();
            }
        }
    }


    public static void main(String[] args){


            Server server = new Server();
            try{
                server.run()
            }catch(Exception ex){
                ex.printStackTrace();
            }
    }
}