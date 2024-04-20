package itmo.laba5;

public class MyMethods
{
    public static String GetLongestWord(String text)
    {
        String[] words = text.split(" ");

        String longestWord = words[0];

        for (String word : words)
        {
            if (word.length() > longestWord.length())
            {
                longestWord = word;
            }
        }

        return longestWord;
    }

    public static String GetInvertWord(String word)
    {
        char[] wordArr = word.toCharArray();

        char[] reverseArr = new char[wordArr.length];

        int j = 0;
        for (int i = wordArr.length - 1; i >= 0; i--)
        {
            reverseArr[j] = wordArr[i];
            j++;
        }

        String reverse = "";

        for (char sym : reverseArr)
        {
            reverse += sym;
        }

        return reverse;
    }

    public static Boolean CheckForPalindrom(String word)
    {
        String reverse = GetInvertWord(word);

        if (word.equals(reverse)) return true;
        else return false;
    }

    public static String ChangeBadWords(String text)
    {
        return text.replaceAll("бяка", "[вырезано цензурой]");
    }

    public static int GetQuantitySubstringsInString(String string, String substring)
    {
        if(string.equals(substring)) return 1;
        if (substring.length() > string.length()) return 0;

        char[] stringArray = string.toCharArray();

        int q = 0;

        String str = "";

        for (int j = 0; j <= stringArray.length - substring.length(); j++)
        {
            str = "";
            for (int i = j; i < substring.length()+j; i++)
            {
                str += stringArray[i];
            }
            if (str.equals(substring)) q++;
        }

        return q;
    }

    public static String GetInvertedWordsInString(String text)
    {
        String[] words = text.split(" ");

        if (words.length <= 1) return text;

        String rezString = "";

        for (int i = 0; i < words.length; i++)
        {
            rezString += MyMethods.GetInvertWord(words[i]);
            if (i < words.length - 1) rezString += " ";
        }

        return rezString;
    }
}