import java.util.Scanner;

public class BaseballGame implements GameType {

    GameNumber gameNumber;
    GameLogic gameLogic;

    public BaseballGame(GameNumber gameNumber, GameLogic gameLogic) {
        this.gameNumber = gameNumber;
        this.gameLogic = gameLogic;
    }

    @Override
    public void play() {

        Scanner input = new Scanner(System.in);

        String randomNumber = gameNumber.makeGameNumber();
        System.out.println("컴퓨터가 숫자를 생성하였습니다. 답을 맞춰보세요!");

        int count = 1;

        while (true) {

            System.out.print(count + "번째 시도 : ");
            String inputNumber = input.nextLine();

            int[] result = gameLogic.getRule(inputNumber, randomNumber);
            String resultStr = gameLogic.getResult(result);

            if (result[0] == 3) {
                System.out.println(resultStr);
                System.out.println(count +" 번만에 맞히셨습니다.");
                System.out.println("게임을 종료합니다");
                break;
            }
            System.out.println(resultStr);
            count++;
        }
    }

}
