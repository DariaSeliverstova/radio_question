package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    void shouldRadio() {
        Radio rad = new Radio();


            rad.setCurrentRadio(5);

            int expected = 5;
            int actual = rad.getCurrentRadio();

            assertEquals(expected, actual);

        }

    @Test
        void ShouldNextStation() {
            Radio rad = new Radio();
            rad.setCurrentRadio(11);

            rad.NextStation();
            int expected = 0;
            int actual = rad.getCurrentRadio();

            assertEquals(expected, actual);

        }

        @Test
        void ShouldBeforeStation() {

            Radio rad = new Radio();
            rad.setCurrentRadio(-1);

            rad.BeforeStation();
            int expected = 9;
            int actual = rad.getCurrentRadio();

            assertEquals(expected, actual);

        }

        @Test
        void shouldVolume() {
            Radio rad = new Radio();

            rad.setCurrentVolume(5);

            int expected = 5;
            int actual = rad.getCurrentVolume();

            assertEquals(expected, actual);
        }

        @Test
        void ShouldNextVolume() {
            Radio rad = new Radio();
            rad.setCurrentVolume(11);

            rad.NextVolume();
            int expected = 10;
            int actual = rad.getCurrentVolume();

            assertEquals(expected, actual);
        }

        @Test
        void ShouldBeforeVolume() {
            Radio rad = new Radio();
            rad.setCurrentVolume(-3);

            rad.BeforeVolume();
            int expected = 0;
            int actual = rad.getCurrentVolume();

            assertEquals(expected, actual);
        }

    }

