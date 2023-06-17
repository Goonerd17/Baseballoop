public class BaseballGameLogic2 implements GameLogic{
    private int[] result = new int[2];
    private int strike = 0;
    private int ball = 0;
    private GameNumber gameNumber;

    public BaseballGameLogic2(GameNumber gameNumber) {
        this.gameNumber = gameNumber;
    }

    @Override
    public int[] getRule(String str1, String str2) {

        //새롭게 바뀔 수 있는 스트라이크, 볼판정의 게임룰
        return new int[0];
    }

    @Override
    public String getResult(int[] intArr) {

        //새로운 룰에 의해 얻을 수 있는 결과
        return null;
    }
}
