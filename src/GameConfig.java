public class GameConfig {

    public GameNumber gameNumber() {
        return new BaseballGameNumber();
    }

    public GameLogic gameLogic() {
        return new BaseballGameLogic(gameNumber());
    }

    public GameType gameType () {
        return new BaseballGame(gameNumber(), gameLogic());
    }
}
