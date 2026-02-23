package Multithreaded;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {

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
