import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.Socket;
import java.net.SocketException;

public class EchoClient {

    Socket socket = null;
    OutputStream out = null;
    InputStream in = null;
    PrintWriter pw = null;
    BufferedReader br = null;
    Exception e = null;

    public void start() {
        try {
            this.socket = new Socket("192.168.10.128", 1982);
            this.out = socket.getOutputStream();
            this.in = socket.getInputStream();
            this.pw = new PrintWriter(new OutputStreamWriter(out));
            this.br = new BufferedReader(new InputStreamReader(in));

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String line = null;
            while ((line = br.readLine()) != null) {
                if (line.equals("quit"))
                    break;

                this.pw.println(line);
                this.pw.flush();
                String echo = this.br.readLine();
                System.out.println("서버로부터 전달받은 문자열 :" + echo);
            }
        } catch (Exception e) {
            this.e = e;
            System.out.println("무슨 에러가 났을까요 ? " + e.getMessage());

            try {
                System.out.println("자원을 해제합시다.");
                if (this.pw != null)
                    this.pw.close();
                if (this.br != null)
                    this.br.close();
                if (this.socket != null)
                    this.socket.close();
            } catch (Exception e1) {
                this.e = e1;
                System.out.println("해제하다가 죽을 일은 없기를~ " + e1.getMessage());
            } finally {
                if (this.e instanceof SocketException || this.e instanceof ConnectException) {
                    System.out.println("재연결 시도... 단, 서버가 죽었다면 니가 무한루프에 빠져죽을것이다.");
                    this.start();
                }
            }
        }
    }

    public static void main(String[] args) {
        new EchoClient().start();
    }

}
