import java.util.List;

public class MovingAverageCalculator {
    public double calculate(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).sum() / numbers.size();
    }
}
