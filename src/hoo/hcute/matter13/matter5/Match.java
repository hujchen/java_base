package hoo.hcute.matter13.matter5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Match {

    public static void main(String[] args) {
        String s = "AABBBCCCCCC";
        Pattern compile = Pattern.compile("(A+)(B+)(C+)");
        Matcher matcher = compile.matcher(s);
        String group = matcher.group();
        System.out.println(group);
    }
}
