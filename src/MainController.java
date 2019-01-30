import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainController {

    private MainModel mainModel;

    public MainController()
    {
        this.mainModel = new MainModel();
    }

    public void getWord()
    {
        System.out.println("German input word: ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            mainModel.setInputWord(in.readLine());
            mainModel.setCountCharsInput(countChars(mainModel.getInputWord()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createListValidWords()
    {
        ListMaker listMaker = new ListMaker(mainModel.getInputWord().length(), mainModel.getCountCharsInput());
        mainModel.setValidWords(listMaker.makeList());
        mainModel.setCandidates(listMaker.getCandidates());
    }

    public void printValidWords()
    {
        for (int i = 0; i < mainModel.getValidWords().size(); i++)
        {
            System.out.println(mainModel.getValidWords().get(i));
        }
        System.out.println(mainModel.getCandidates() + " candidates");
    }

    public int[] countChars(String word)
    {
        int[] counts = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < word.length(); i++)
        {
            switch(word.charAt(i))
            {
                case 'a': counts[0]++; break;
                case 'b': counts[1]++; break;
                case 'c': counts[2]++; break;
                case 'd': counts[3]++; break;
                case 'e': counts[4]++; break;
                case 'f': counts[5]++; break;
                case 'g': counts[6]++; break;
                case 'h': counts[7]++; break;
                case 'i': counts[8]++; break;
                case 'j': counts[9]++; break;
                case 'k': counts[10]++; break;
                case 'l': counts[11]++; break;
                case 'm': counts[12]++; break;
                case 'n': counts[13]++; break;
                case 'o': counts[14]++; break;
                case 'p': counts[15]++; break;
                case 'q': counts[16]++; break;
                case 'r': counts[17]++; break;
                case 's': counts[18]++; break;
                case 't': counts[19]++; break;
                case 'u': counts[20]++; break;
                case 'v': counts[21]++; break;
                case 'w': counts[22]++; break;
                case 'x': counts[23]++; break;
                case 'y': counts[24]++; break;
                case 'z': counts[25]++; break;
            }
        }
        return counts;
    }
}
