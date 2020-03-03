package by.matusevich.task18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PunctuactionNumber {
    public static void main(String[] args) {
        String str=" Если люди полагают, что видят тебя в последний раз, они начинают действительно смотреть на тебя. Иначе они говорят с тобой о своих проблемах с банком, о песне, которая играет по радио, или поправляют прическу, пока ты говоришь.\n" +
                "А тут тебе принадлежит все их внимание.\n" +
                "Они начинают слушать, а до того просто ждали своей очереди заговорить.\n" +
                "И даже когда они заговаривают, они уже не говорят про себя. Они говорят с тобой, и после этого разговора вы оба чувствуете себя немного другими.";
        Pattern pattern = Pattern.compile("[!.,;:?\\-]");
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()){
            count++;
        }
        System.out.println(count);
    }
}
