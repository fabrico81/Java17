package section5;

public class SecondAndMinuteChallenge {

    public static void main(String[] args) {
        System.out.println(getDurationString(3945));

    }

    public static String getDurationString(int second) {

        int minute = second / 60;
        return getDurationString(minute, second);
    }

    public static String getDurationString(int minute, int second) {
        if (minute < 0 || second < 0 || second > 59) {
            return "Invalid value";
        }

        int hour = minute / 60;
        int remainingMinute = minute % 60;
        int remainingSecond = second % 60;
        return hour + "h " + remainingMinute + "m " + remainingSecond + "s";
    }
}
