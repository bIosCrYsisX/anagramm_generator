import java.util.LinkedList;

public class MainModel {

    private String inputWord;
    private LinkedList<String> validWords;
    private int candidates;
    private int[] countCharsInput = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public String getInputWord() {
        return inputWord;
    }

    public void setInputWord(String inputWord) {
        this.inputWord = inputWord;
    }

    public LinkedList<String> getValidWords() {
        return validWords;
    }

    public void setValidWords(LinkedList<String> validWords) {
        this.validWords = validWords;
    }

    public int getCandidates() {
        return candidates;
    }

    public void setCandidates(int candidates) {
        this.candidates = candidates;
    }

    public int[] getCountCharsInput() {
        return countCharsInput;
    }

    public void setCountCharsInput(int[] countCharsInput) {
        this.countCharsInput = countCharsInput;
    }
}
