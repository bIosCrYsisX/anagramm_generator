import java.io.*;
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
            InputStream in = getClass().getResourceAsStream("german.dic");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));

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
