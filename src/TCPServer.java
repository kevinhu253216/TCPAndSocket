import java.net.*;

public class TCPServer {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(6666);
        ss.accept();
        System.out.println("A client is accept!");


    }

}
