import org.junit.jupiter.api.Test;
import ru.netology.Radio;
import org.junit.jupiter.api.Assertions;
public class RadioTest {

    @Test
    public void shouldSetRadioNumber() {
        Radio number = new Radio();
        number.setCurrentRadioNumber(5);
        int expected = 5;
        int actual = number.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioNumber() {
        Radio number = new Radio();
        number.nextRadioNumber(1);
        int expected = 2;
        int actual = number.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioNumber() {
        Radio number = new Radio();
        number.prevRadioNumber(1);
        int expected = 0;
        int actual = number.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

}
