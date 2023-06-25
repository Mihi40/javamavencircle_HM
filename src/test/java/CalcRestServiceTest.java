
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.javaqa.javaqamvn2.services.CalcRestService;

public class CalcRestServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/calc.scv")
    public void shouldCalcRestServiceExact(int expected, int income, int expenses, int trashold) {
        CalcRestService service = new CalcRestService();
        int actual = service.calculate(income, expenses, trashold);
        Assertions.assertEquals(expected, actual);
    }
}