package com.epam.electrician.view;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;;

public class FilePrinter implements Printer {

    private final String fileName;

    public FilePrinter(String fileName) {

        this.fileName = fileName;
    }

    @Override
    public void print(int result) throws ViewException {

        BufferedWriter bufferedWriter = null;

        try {
            bufferedWriter = new BufferedWriter(new FileWriter(this.fileName));
            String resultString = String.valueOf(result);
            bufferedWriter.write(resultString);
        } catch (IOException e) {
            throw new ViewException(e);
        } finally {

            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();  //log
                }
            }

        }

    }

}