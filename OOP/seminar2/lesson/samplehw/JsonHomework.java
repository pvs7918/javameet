package samplehw;

import java.io.*;
import java.util.*;

class JsonHomework {
    public static void main(String[] args) {
        // {
        //      "key1": "value1",
        //      "key2": "value2",
        //      "key3": "value3"
        // }
        try (FileWriter writer = new FileWriter("output.json")) {
            writer.write ("{\n");
            for (int i = 0; i < 3; i++) {
                String key = String.format ("key%d", i + 1);
                String value = String.format ("value%d", i + 1);
                writer.write (String.format ("\t\"%s\": \"%s\"%s\n", key, value,
                    i < 3 - 1 ? "," : ""));
            }
            writer.write ("}\n");
        }
        catch (IOException ex) {
            System.err.println(ex.toString());
        }
        // <data>
        //     <student>
        //         <name>Name1</name>
        //         <grade>grade1</grade>
        //     </student>
        // </data>
        try (FileWriter writer = new FileWriter("output.xml")) {
            writer.write ("<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n");
            writer.write ("<data>\n");
            for (int i = 0; i < 3; i++) {
                writer.write ("\t<student>\n");
                writer.write (String.format ("\t\t<name>Name%d</name>\n", i + 1));
                writer.write (String.format ("\t\t<grade>grade%d</grade>\n", i + 1));
                writer.write ("\t</student>\n");
            }
            writer.write ("</data>\n");
        }
        catch (IOException ex) {
            System.err.println(ex.toString());
        }
    }
}
