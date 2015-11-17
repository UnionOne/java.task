package task04.client;

import task04.base.Check;
import task04.io.Reader;
import task04.io.Writer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vaas on 17.11.2015.
 */
public class javase06task04 {
    public static void main(String[] args) throws Throwable {
        /*Check check = new Check();
        System.out.print(check.toString());*/

        final String path = "checks";

        List<Check> checkList = new ArrayList<>();
        Writer writer = new Writer(path);
        Reader reader = new Reader(checkList, path);

        checkList.add(new Check());
        checkList.add(new Check("kotleta", 10, 2, 30));

        writer.writeToFile(checkList);
        reader.readFromFile();
        writer.writeToConsole(checkList);

    }
}
