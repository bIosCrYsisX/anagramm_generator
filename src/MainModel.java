import java.util.LinkedList;

public class MainModel {

    private String inputWord;
    private LinkedList<String> validWords;
    private LinkedList<String> invalidWords = new LinkedList<>();
    private int candidates;
    private int[] countCharsInput = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private int[] countCharsActualWord = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

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

    public void removeValidWord(String word) {
        validWords.remove(word);
    }

    public void addWordInvalid(String word) {
        invalidWords.add(word);
    }

    public LinkedList<String> getInvalidWords() {
        return invalidWords;
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

    public int[] getCountCharsActualWord() {
        return countCharsActualWord;
    }

    public void setCountCharsActualWord(int[] countCharsActualWord) {
        this.countCharsActualWord = countCharsActualWord;
    }
}
