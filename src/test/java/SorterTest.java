import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.test.qa.Sorter;
import java.util.Arrays;

public class SorterTest {
    Sorter sorter = new Sorter();
    @Test
    public void SorterTest(){

        var result = sorter.sort(Arrays.asList(4, 3, 2, 1, 6, 5));
        Assertions.assertIterableEquals(Arrays.asList(1, 2, 3, 4, 5, 6), result);
    }
}
