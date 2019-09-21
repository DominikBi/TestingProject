package dominik.InternetFileGetter;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;

public class Main {
    ServerSocket serverSocket;

    public static void main(String[] args){

    }
    private void run(){
            while (true) {
                try {
                    URL url = new URL("");
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                try {
                    serverSocket = new ServerSocket();

                    Socket client = serverSocket.accept();

                    DataOutputStream dataOutputStream = new DataOutputStream(client.getOutputStream());

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

    }
}
