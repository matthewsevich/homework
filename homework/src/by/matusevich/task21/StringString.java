package by.matusevich.task21;

public class StringString {
    public static void main(String[] args) {
        String str = " ";
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 10_000; i++)
            str += "съешь ещё этих мягких французских булок, да выпей чаю";
        System.out.println("10_000 конкатенаций String " + (System.currentTimeMillis() - t1) + " милисекунд");

        StringBuilder stringBuilder
                = new StringBuilder("");
        long t2 = System.currentTimeMillis();

        for (int i = 0; i < 10_000; i++)

            stringBuilder.append("съешь ещё этих мягких французских булок, да выпей чаю");
        System.out.println("10_000 конкатенаций StringBuilder " + (System.currentTimeMillis() - t2) + " милисекунд");

    }
}
