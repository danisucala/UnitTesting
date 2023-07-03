import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class IsPositiveTest {
    @Test
    public void checkIsPositiveTrue() {
        IsPositive number = new IsPositive();
        boolean result = number.isPositive(3.5);
        Assertions.assertTrue(result, "ai dat-o in bara");
    }

    @Disabled
    @Test
    public void checkIsPositiveFalse(){
        IsPositive number = new IsPositive();
        boolean result = number.isPositive(-4.7);
        Assertions.assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(doubles = {1.5, 4.6, 8.9, Double.MAX_VALUE})
    public void checkIsPositiveParameterized(double numberFromValues) {
        IsPositive numberToCheck = new IsPositive();
        boolean result = numberToCheck.isPositive(numberFromValues);
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(doubles = {-1.5, -4.6 - 8.9})
    public void checkIsPositiveParametrizedNegative(double numberFromValues) {
        IsPositive numberToCheck = new IsPositive();
        boolean result = numberToCheck.isPositive(numberFromValues);
        Assertions.assertFalse(result);
    }
}