package itmo.laba5;

public class Laba5
{
    public static void main(String[] args)
    {
        String text1 = "белеет парус одинокий в тумане моря голубом";
        String longestword = MyMethods.getLongestWord(text1);
        System.out.println(longestword);
        System.out.println("");



        Boolean checker1 = MyMethods.checkForPalindrom("шалаш");
        Boolean checker2 = MyMethods.checkForPalindrom("вигвам");

        System.out.println(checker1);
        System.out.println(checker2);
        System.out.println("");



        String str0 = MyMethods.changeBadWords("бяка", "бяка", "[вырезано цензурой]");
        String str1 = MyMethods.changeBadWords("бяка какая-то", "бяка", "[вырезано цензурой]");
        String str2 = MyMethods.changeBadWords("какая-то бяка", "бяка", "[вырезано цензурой]");
        String str3 = MyMethods.changeBadWords("Слово бяка - плохое. Пожалуйста, не используйте такие слова, как бяка, в ваших текстах.", "бяка", "[вырезано цензурой]");
        String str4 = MyMethods.changeBadWords("какая-то бяка какая-то бяка", "бяка", "[вырезано цензурой]");

        System.out.println(str0);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println("");



        String str5 = MyMethods.getInvertedWordsInString("Учимся программировать на Java");
        System.out.println(str5);
        System.out.println("");



        String myStr = "Россия - наша Родина, Россия - наша страна, да здравствует Россия";
        String mySubstr = "Россия";
        int n = MyMethods.getQuantitySubstringsInString(myStr, mySubstr);
        System.out.println(n);
    }
}