import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class ListMaker {

    private int charCount;
    private String line;
    private LinkedList<String> validWords;

    public ListMaker(int charCount)
    {
        this.charCount = charCount;
        this.validWords = new LinkedList<>();
    }

    public LinkedList<String> makeList()
    {
        readFile();
        return validWords;
    }

    public void readFile()
    {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            FileReader fileReader = new FileReader(classLoader.getResource("german.dic").getFile());
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) !=  null)
            {
                if(line.length() == charCount)
                {
                    validWords.add(line.toLowerCase());
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
