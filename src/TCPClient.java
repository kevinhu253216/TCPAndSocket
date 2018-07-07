import java.io.IOException;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1",6666); //建立与Server的6666端口的连接
                                                            //client端口是自己随机选择的

    }


}
