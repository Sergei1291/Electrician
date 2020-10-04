package com.epam.electrician.view;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;

public class FileResultPrinterTest {

    private final static String FILE_NAME = "src/test/resources/outputForTest.txt";

    @Test
    public void testPrintShouldWriteFile() throws ViewException {
        //given
        int totalPower = 1500;
        FilePrinter filePrinter = new FilePrinter(FILE_NAME);
        //when
        filePrinter.print(totalPower);
        //then
        String expected = "1500";
        String actual = readFile(FILE_NAME);
        Assert.assertEquals(expected, actual);
    }

    private String readFile(String fileName) throws ViewException {

        FileReader reader = null;
        StringBuilder fileText = new StringBuilder();
        char[] currentSymbol = new char[1];

        try {

            reader = new FileReader(fileName);

            while (reader.read(currentSymbol) != (-1)) {
                fileText.append(currentSymbol);
            }

            return new String(fileText);

        } catch (FileNotFoundException e) {
            throw new ViewException(e);
        } catch (IOException e) {
            throw new ViewException(e);
        } finally {

            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }

}