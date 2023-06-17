public class BaseballGameLogic1 implements GameLogic {
    //RandomNumberLength와 마찬가지
    private int[] result = new int[2];
    private int strike = 0;
    private int ball = 0;

    private GameNumber gameNumber;

    public BaseballGameLogic1(GameNumber gameNumber) {
        this.gameNumber = gameNumber;
    }

    @Override
    public int[] getRule (String inputNumber, String randomNumber) {

        for (int i = 0; i < gameNumber.getGameNumber(); i++) {
            if (inputNumber.charAt(i) == randomNumber.charAt(i)) {
                strike++;
            } else {
                if (randomNumber.indexOf(inputNumber.charAt(i)) >= 0) {
                    ball++;
                }
            }
        }
        result[0] = strike;
        result[1] = ball;

        return result;
    }


    @Override
    public String getResult(int[] result){

        String resultStr = null;

        if (result[0] == 0 && result[1] > 0 ){ return resultStr = result[1] + "B"; }
        if (result[0] > 0 && result[1] == 0){ return resultStr = result[0] + "S"; }

        return resultStr = result[1] + "B"+result[0] + "S";
    }
}
