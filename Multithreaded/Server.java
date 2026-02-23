package Multithreaded;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.function.Consumer;

public class Server {

    public Consumer<Socket> getConsumer(){
        return(clientSocket) -> {
            try{
                PrintWriter toClient =  new PrintWriter(clientSocket.getOutputStream());
                toClient.println("Hello from the server");
                toClient.close();
                clientSocket.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        };
    }

    public static void main(String[] args) {
        int port = 8010;
        try{
            ServerSocket serverSocket = new ServerSocket(port);
            serverSocket.getSoTimeout(10000);
            System.out.println("Server is listening on port : " + port);
            while(true){
                Socket acceptedSocket = serverSocket.accept();    
                Thread thread = new Thread();       
            
            }
        }
    }
    
    
}
