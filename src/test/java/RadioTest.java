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
    public void shouldSetNextRadioNumberIf9() {
        Radio number = new Radio();
        number.nextRadioNumber(9);
        int expected = 0;
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

    @Test
    public void shouldSetPrevRadioNumberIf0() {
        Radio number = new Radio();
        number.prevRadioNumber(0);
        int expected = 9;
        int actual = number.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoildIncreaseVolume() {
        Radio volume = new Radio();
        volume.increaseSoundVolume(1);
        int expected = 2;
        int actual = volume.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoildIncreaseVolumeIf100() {
        Radio volume = new Radio();
        volume.increaseSoundVolume(100);
        int expected = 100;
        int actual = volume.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoildDecreaseVolume() {
        Radio volume = new Radio();
        volume.decreaseSoundVolume(1);
        int expected = 0;
        int actual = volume.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoildDecreaseVolumeIf0() {
        Radio volume = new Radio();
        volume.decreaseSoundVolume(0);
        int expected = 0;
        int actual = volume.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

}
