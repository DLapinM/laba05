package itmo.laba5;

import java.util.Calendar;

public class Laba5
{
    public static void main(String[] args)
    {
        String text1 = "белеет парус одинокий в тумане моря голубом";
        String longestword = MyMethods.GetLongestWord(text1);
        System.out.println(longestword);
        System.out.println("");



        Boolean checker1 = MyMethods.CheckForPalindrom("шалаш");
        Boolean checker2 = MyMethods.CheckForPalindrom("вигвам");

        System.out.println(checker1);
        System.out.println(checker2);
        System.out.println("");



        String str0 = MyMethods.ChangeBadWords("бяка");
        String str1 = MyMethods.ChangeBadWords("бяка какая-то");
        String str2 = MyMethods.ChangeBadWords("какая-то бяка");
        String str3 = MyMethods.ChangeBadWords("Слово бяка - плохое. Пожалуйста, не используйте такие слова, как бяка, в ваших текстах.");
        String str4 = MyMethods.ChangeBadWords("какая-то бяка какая-то бяка");

        System.out.println(str0);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println("");



        String str5 = MyMethods.GetInvertedWordsInString("Учимся программировать на Java");
        System.out.println(str5);
        System.out.println("");



        String myStr = "Россия - наша Родина, Россия - наша страна, да здравствует Россия";
        String mySubstr = "Россия";
        int n = MyMethods.GetQuantitySubstringsInString(myStr, mySubstr);
        System.out.println(n);
    }
}