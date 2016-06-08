package com.clouway.IO.task2;

import java.io.*;

public class WriteToFile {
    private InputStreamReader input = null;
    private BufferedReader in = null;
    private PrintWriter output = null;

    public void writeInFile(String fileName){
        boolean flag = true;
        input = new InputStreamReader(System.in);
        in = new BufferedReader(input);

        try {
            output = new PrintWriter(fileName, "UTF-8");
        } catch (IOException e) {
            System.out.println("Output error!");
        }

        while(flag){
            String temp = "";
            try {
                temp = in.readLine();
            } catch (IOException e) {
                System.out.println("Input error!");
            }
            if(temp.equals(".")){
                flag = false;
            }else {
                output.println(temp);
            }
        }

        if(output != null){
            output.close();
        }
        if(in != null){
            try {
                in.close();
            } catch (IOException e) {
                System.out.println("Error while closing input stream!");
            }
        }
        if(input != null){
            try {
                input.close();
            } catch (IOException e) {
                System.out.println("Error while closing input stream!");
            }
        }
    }
}
