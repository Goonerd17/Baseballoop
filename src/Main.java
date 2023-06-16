public class Main {
    public static void main(String[] args) {

        GameConfig gameconfig = new GameConfig();

        GameType game = gameconfig.gameType();

        game.play();
    }
}
