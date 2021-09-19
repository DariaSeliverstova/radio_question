package ru.netology;

public class Radio {
    private int CurrentRadio;
    private int CurrentVolume;


    public void setCurrentRadio(int NewRadio) {
        int MinRadio = 0;
        int MaxRadio = 9;
        if (NewRadio < MinRadio) {
            return;
        }
        if (NewRadio > MaxRadio) {
            return;
        }
        CurrentRadio = NewRadio;

    }

    public void NextStation() {
        int MinRadio = 0;
        int MaxRadio = 9;
        int NextStation = CurrentRadio;
        int r = CurrentRadio + 1;
        if (r > CurrentRadio) {
            CurrentRadio = MinRadio;
        } else {
            CurrentRadio = NextStation;
        }
    }

    public void BeforeStation() {
        int MinRadio = 0;
        int MaxRadio = 9;
        int BeforeStation = CurrentRadio;
        int r = CurrentRadio - 1;
        if (r < MinRadio) {
            CurrentRadio = MaxRadio;
        } else {
            CurrentRadio = BeforeStation;
        }
    }

    public int getCurrentRadio() {
        return CurrentRadio;
    }

    public void setCurrentVolume(int NewVolume) {
        int MinVolume = 0;
        int MaxVolume = 10;
        if (NewVolume < MinVolume) {
            return;
        }
        if (NewVolume > MaxVolume) {
            return;
        }
        CurrentVolume = NewVolume;

    }

    public void NextVolume() {
        int MinVolume = 0;
        int MaxVolume = 10;
        int NextVolume = CurrentVolume;
        int v = CurrentVolume + 1;

        if (v > MaxVolume) {
            CurrentVolume = MaxVolume;
        } else {
            CurrentVolume = NextVolume;
        }

    }

    public void BeforeVolume() {
        int MinVolume = 0;
        int MaxVolume = 10;
        int BeforeVolume = CurrentVolume;
        int v = CurrentVolume - 1;
        if (v < MinVolume) {
            CurrentVolume = MinVolume;
        } else {
            CurrentVolume = BeforeVolume;
        }
    }


    public int getCurrentVolume() {
        return CurrentVolume;
    }

}

