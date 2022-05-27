package com.ninjas.world;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Sonu Kumar
 */
public class SQLQueryGenarater {

    public static void createFile(List<String> dataList, int fileNumber) throws IOException {
        FileWriter writer = new FileWriter("/Users/sonukumar/Desktop/delete_data_2/output" + fileNumber + ".txt");
        for (String str : dataList) {
            writer.write(str + System.lineSeparator());
        }
        writer.close();
    }

    public static void main(String[] args) throws IOException {
        LineIterator iterator = FileUtils.lineIterator(new File("/Users/sonukumar/Downloads/data2.txt"), "UTF-8");
        int batchSize = 1500000;
        try {

            List<String> list = new ArrayList<>();
            int fileNumber = 1;
            while (iterator.hasNext()) {
                String line = iterator.nextLine();
                String query = "delete from customer_metadata where id = " + line + ";";
                list.add(query);
                if (list.size() == batchSize || (!iterator.hasNext())) {
                    createFile(list, fileNumber);
                    fileNumber++;
                    list = new ArrayList<>();
                }
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
    }
}


