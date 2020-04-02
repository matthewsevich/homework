package by.matusevich.task22;


public class Main {

    static TimeInterval timeDay = new TimeInterval(70);
    static TimeInterval timeDay2 = new TimeInterval(0,1,10);

        public static void main(String[] args) {

            System.out.println(timeDay2.toSeconds());
            System.out.println(timeDay.toSeconds());
            System.out.println(timeDay.compareTo(timeDay2));

    }
}
