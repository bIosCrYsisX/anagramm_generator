public class Main {

    public static void main(String[] args) {
        start();
    }

    private static void start()
    {
        MainController mainController = new MainController();
        mainController.getWord();
        mainController.createListValidWords();
        mainController.tryWords();
        mainController.removeInvalidWords();
        mainController.printValidWords();

        start();
    }
}
