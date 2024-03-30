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
    public void shouldSetRadioNumberIfMoreThan9() {
        Radio number = new Radio();
        number.setCurrentRadioNumber(10);
        int expected = 0;
        int actual = number.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioNumberIfLessThan0() {
        Radio number = new Radio();
        number.setCurrentRadioNumber(-1);
        int expected = 0;
        int actual = number.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioNumber() {
        Radio number = new Radio();
        number.setCurrentRadioNumber(1);
        number.nextRadioNumber();
        int expected = 2;
        int actual = number.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioNumberIf9() {
        Radio number = new Radio();
        number.setCurrentRadioNumber(9);
        number.nextRadioNumber();
        int expected = 0;
        int actual = number.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioNumber() {
        Radio number = new Radio();
        number.setCurrentRadioNumber(1);
        number.prevRadioNumber();
        int expected = 0;
        int actual = number.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioNumberIf0() {
        Radio number = new Radio();
        number.setCurrentRadioNumber(0);
        number.prevRadioNumber();
        int expected = 9;
        int actual = number.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio volume = new Radio();
        volume.setSoundVolume(1);
        volume.increaseSoundVolume();
        int expected = 2;
        int actual = volume.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeIf100() {
        Radio volume = new Radio();
        volume.setSoundVolume(100);
        volume.increaseSoundVolume();
        int expected = 100;
        int actual = volume.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio volume = new Radio();
        volume.setSoundVolume(1);
        volume.decreaseSoundVolume();
        int expected = 0;
        int actual = volume.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIf0() {
        Radio volume = new Radio();
        volume.setSoundVolume(0);
        volume.decreaseSoundVolume();
        int expected = 0;
        int actual = volume.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

}