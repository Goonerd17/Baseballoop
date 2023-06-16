public class BaseballGameLogic implements GameLogic {
    //RandomNumberLength와 마찬가지
    private static int[] result = new int[2];
    private static int strike = 0;
    private static int ball = 0;

    private final GameNumber gameNumber;
    public BaseballGameLogic(GameNumber gameNumber) {
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

        if (result[0] == 0 && result[1] > 0 ){
            resultStr = result[1] + "B";
        } else if (result[0] > 0 && result[1] == 0){
            resultStr = result[0] + "S";
        } else {
            resultStr = result[1] + "B"+result[0] + "S";
        }
        return resultStr;
    }
}
