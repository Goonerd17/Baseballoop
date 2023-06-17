public class GameConfig {

    // OCP와 DIP를 지키기 위해 만든 설정자.
    // 각 클래스들이 구현체가 아닌 추상체에 의존할 수 있게끔 도와주기에 DIP를 지킬 수있고,
    // BaseballGameLogic1을 2로 바꿀시, 이 부분만 수정하면 되기에 OCP를 지킬 수 있다.
    // 이러한 점은 유지보수에 용이성 제공

    public GameNumber gameNumber() {
        return new BaseballGameNumber();
    }

    public GameLogic gameLogic() {
        return new BaseballGameLogic1(gameNumber());
    }

    public GameType gameType () {
        return new BaseballGame(gameNumber(), gameLogic());
    }
}
