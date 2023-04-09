import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {
    @ParameterizedTest
    @CsvSource({
            "10,0",
            "-1,0",
            "8,8",
            "1,1",
            "9,9",
            "0,0",
            "5,5"


    })
    public void shouldSetStation(int newNumberStation, int expected) {
        Radio number = new Radio();
        number.setNumberStation(newNumberStation);
        int actual = number.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "10,1",
            "-1,1",
            "8,9",
            "1,2",
            "9,0",
            "0,1",
            "5,6"

    })
    public void shouldNextStation(int newNumberStation, int expected) {
        Radio number = new Radio();
        number.setNumberStation(newNumberStation);
        number.next();
        int actual = number.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "10,9",
            "-1,9",
            "8,7",
            "1,0",
            "9,8",
            "0,9",
            "5,4"
    })
    public void shouldPrevStation(int newNumberStation, int expected) {
        Radio number = new Radio();
        number.setNumberStation(newNumberStation);
        number.prev();
        int actual = number.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "99,99",
            "100,100",
            "101,100",
            "-1,0",
            "0,0",
            "1,1"
    })
    public void shouldVolume(int newVolume, int expected) {
        Radio number = new Radio();
        number.setVolume(newVolume);
        int actual = number.getVolume();
        Assertions.assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource({
            "10,11",
            "-3,1",
            "8,9",
            "1,2",
            "101,100",
            "0,1",
            "5,6"

    })
    public void shouldNextVolume(int newVolume, int expected) {
        Radio number = new Radio();
        number.setVolume(newVolume);
        number.nextVolume();
        int actual = number.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "10,9",
            "-3,0",
            "8,7",
            "1,0",
            "101,99",
            "100,99",
            "5,4",
            "0,0"

    })
    public void shouldMinusVolume(int newVolume, int expected) {
        Radio number = new Radio();
        number.setVolume(newVolume);
        number.minusVolume();
        int actual = number.getVolume();
        Assertions.assertEquals(expected, actual);
    }

}


