package com.mjie.bytecode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;

/**
 * @author panmingjie
 * @date 2018/10/20 23:01
 */
public class MyTest3 {
    public void test() {
        try {
            InputStream is = new FileInputStream("C://test.txt");
            ServerSocket serverSocket = new ServerSocket(8080);
            serverSocket.accept();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {

        } finally {
            System.out.println("finally");
        }
    }
}
