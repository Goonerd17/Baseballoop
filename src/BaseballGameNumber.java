import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BaseballGameNumber implements GameNumber {

    // 랜덤한 넘버 길이가 바뀔 수 있는 상황과, 다른 외부적인 개입에서 해당 멤버를 보호하는 것을 고려하여  private 사용
    private static int RandomNumberLength = 3;

    @Override
    public int getGameNumber() {
        return RandomNumberLength;
    }

    @Override
    public String makeGameNumber() {
        return Stream.generate(() -> new Random().nextInt(10))
                .distinct()
                .limit(RandomNumberLength)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
