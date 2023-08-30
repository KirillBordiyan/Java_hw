package kirill.metanit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MetString {
    public static void main(String[] args) {
        //String not immutable
        String str1 = new String(); //== "";
        String str2 = new String(new char[]{'h','i','!','!'});//hi!!
        String str3 = new String(new char[]{'h','i','!','!'}, 0,2);//strt - [0], length 2
        System.out.println(str3); //hi

        if(str1.isEmpty()){
            System.out.println("empty string");
        }


        List<Character> list = new ArrayList<>();
        list.add('1');
        list.add('2');
        list.add('3');
        System.out.println(list);

        String val = String.join(", ", list.get(0).toString(),list.get(1).toString(),list.get(2).toString());
        System.out.println(val);

        String val2 = list.get(0).toString().concat(list.get(1).toString());
        System.out.println(val2+"\n");

        String s1 = "Java";
        String s2 = "doc java";

        boolean res2 = s1.regionMatches(0, s2, 4, 4);//false, case not ignore
        System.out.println(res2);
        boolean res3 = s1.regionMatches(true,0, s2, 4, 4); //true
        System.out.println(res3);

        StringBuilder sb = new StringBuilder();

//        StringBuffer strBuffer = new StringBuffer("world");
//        int startIndex = 1;
//        int endIndex = 4;
//        char[] buffer = new char[endIndex-startIndex];
//        strBuffer.getChars(startIndex, endIndex, buffer, 0);
//        System.out.println(buffer); // orl

        String mail = "kirill-Bordiyan@gmail.com";
        System.out.println("\n"+mail.matches("[A-Za-z.-]+@[\\da-z.]+com"));//true

        String mail2 = "Kirillbordiyan1999@mail.com";
        System.out.println(mail2.matches("[A-Za-z.\\d-]+@[a-z.]+com"));
        System.out.println("1");


    }

}


