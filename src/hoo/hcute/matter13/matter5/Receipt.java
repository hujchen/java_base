package hoo.hcute.matter13.matter5;

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

import java.util.Calendar;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.Locale;

import static java.util.Calendar.MAY;

public class Receipt {



    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //传入一个sb 接收格式化后的字符串
        Formatter formatter = new Formatter(sb, Locale.US);
//        formatter.format("%4$2s %3$2s %2$2s %1$2s", "a", "b", "c", "d");
//        System.out.println(sb.toString());
        //%[argument_index$][flags][width][.precision]conversion
        // argument_index: 可选，是一个十进制数，用于表明参数在参数列表中的位置
        // flags 可选，用来控制输出格式
        // width 可选，是一个正整数，表示输出的最小长度
        // precision 可选，用来限定输出精度
        // conversion 必须，用来表示如何格式化参数的字符

//        formatter.format(Locale.FRANCE,"e= %+10.4f",Math.E);
//        System.out.println(sb.toString());
//
//
//        System.out.format("Local time: %tT", Calendar.getInstance());
//        System.out.println();
//
//        System.err.printf("Unable to open file '%1$s': %2$s","abc.txt","打开文件错误");
//        System.out.println();
//
//        Calendar c = new GregorianCalendar(1995,Calendar.MAY,23);
//        String s = String.format("Duck's Birthday: %1$tb %1$te, %1$tY" ,c);
//        System.out.println(s);

        formatConversion();


    }

    private static void formatConversion(){
        System.out.println(String.format("'b': 将参数格式化为boolean类型输出，'B'的效果相同，但是结果中字母为大写。%b ,%B", false,true));
        System.out.println(String.format("'h': 将参数格式化为散列输出，原理：Integer.toHexString(arg.hashcode())，'H'的效果相同，但结果中字母大写。%h","ABC"));
    }

    private static void formatFlags(){

    }
}
