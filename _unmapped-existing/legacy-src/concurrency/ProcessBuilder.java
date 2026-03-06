package concurrency;

import java.io.*;


public class ProcessBuilder {

      public static void main(String[] args) throws Exception {

            Process p = new java.lang.ProcessBuilder("cmd", "/c", "echo", "Hi, I am Kar").start();

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()))) {
                  System.out.println(reader.readLine());
            } catch (IOException e){
                  throw new Exception("Exception", e);
            }
      }
}

