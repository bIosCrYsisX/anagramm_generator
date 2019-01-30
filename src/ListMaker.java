import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;

public class ListMaker {

    private int charCount;
    private int candidates = 0;
    private String line;
    private LinkedList<String> validWords;
    private MainController mainController;
    private int[] countCharsInput;

    public ListMaker(int charCount, int[] countCharsInput)
    {
        this.charCount = charCount;
        this.validWords = new LinkedList<>();
        this.mainController = new MainController();
        this.countCharsInput = countCharsInput;
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
                    if(Arrays.equals(mainController.countChars(line.toLowerCase()), countCharsInput))
                    {
                        validWords.add(line.toLowerCase());
                    }
                    candidates++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getCandidates() {
        return candidates;
    }
}
