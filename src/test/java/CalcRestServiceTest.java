
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.javaqamvn2.services.CalcRestService;

public class CalcRestServiceTest {
    @Test
    public void shouldCalcRestServiceExact() {
        CalcRestService service = new CalcRestService();

        int expected = 3;
        int actual = service.calculate(10000, 3000, 20000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcRestServiceElse() {
        CalcRestService service = new CalcRestService();

        int expected = 2;
        int actual = service.calculate(100000, 60000, 150000);

        Assertions.assertEquals(expected, actual);
    }
}