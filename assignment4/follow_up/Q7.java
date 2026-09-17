class Time {
    int hour, minute, second;

    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    void displayTime() {
        System.out.printf("%02d:%02d:%02d\n",
                hour, minute, second);
    }

    Time addTime(Time t) {

        int sec = this.second + t.second;
        int min = this.minute + t.minute + sec / 60;
        int hr = this.hour + t.hour + min / 60;

        sec %= 60;
        min %= 60;

        return new Time(hr, min, sec);
    }
}
public class Q7 {
    public static void main(String[] args) {

        Time t1 = new Time(2, 45, 50);
        Time t2 = new Time(3, 20, 30);

        Time result = t1.addTime(t2);

        System.out.print("Total Time = ");
        result.displayTime();
    }
}