public class Time {

    int seconds;
    int minutes;
    int hours;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public static Time sum(Time start, Time stop) {
        Time add = new Time(0, 0, 0);

        if (start.seconds > stop.seconds) {
            --stop.minutes;
            stop.seconds += 60;
        }

        add.seconds = stop.seconds - start.seconds;

        if (start.minutes > stop.minutes) {
            --stop.hours;
            stop.minutes += 60;
        }

        add.minutes = stop.minutes + start.minutes;
        add.hours = stop.hours + start.hours;

        return (add);
    }

    public static void main(String[] args) {

        Time start = new Time(9, 20, 14);
        Time stop = new Time(10, 24, 50);
        Time add;

        add = sum(start, stop);
        System.out.printf("%d:%d:%d\n", add.hours, add.minutes, add.seconds);
    }
}
