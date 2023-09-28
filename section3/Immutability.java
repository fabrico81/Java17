package section3;

import org.junit.jupiter.api.Test;

public class Immutability {

    @Test
    public void playWithString() {
        String s1 = "Hello";
        String s2 = s1;
        s1 = "World";
        System.out.println(s1);
        System.out.println(s2);
    }

    @Test
    public void playWithInt() {
        int i1 = 1;
        int i2 = i1;
        i1 = 2;
        System.out.println(i1);
        i1 += 1;
        System.out.println(i1);
        System.out.println(i2);
    }

    @Test
    public void playWithStringBuilder() {
        StringBuilder sb = new StringBuilder("Hello");
        StringBuilder sb2 = sb;
        sb.append(" World");
        System.out.println(sb);
        System.out.println(sb2);
    }

    @Test
    public void playWithStringBuffer() {
        StringBuffer sb = new StringBuffer("Hello");
        StringBuffer sb2 = sb;
        sb.append(" World");
        System.out.println(sb);
        System.out.println(sb2);
    }

    @Test
    public void playConvertsSentencesToLowerCase() {
        String sentence = "The quick brown fox jumps over the lazy dog";
        String lowerCaseSentence = sentence.toLowerCase();
        System.out.println(lowerCaseSentence);
    }

    @Test
    public void playRemoveAllTheSpaces() {
        String sentence = "The quick brown fox jumps over the lazy dog";
        String sentenceWithoutSpaces = sentence.replaceAll(" ", "");
        System.out.println(sentenceWithoutSpaces);
    }

    @Test
    public void playReversesTheString() {
        String sentence = "The quick brown fox jumps over the lazy dog";
        String reversedSentence = new StringBuilder(sentence).reverse().toString();
        System.out.println(reversedSentence);
    }

    @Test
    public void playCountTheNumberOfWords() {
        String sentence = "The quick brown fox jumps over the lazy dog";
        String[] words = sentence.split(" ");
        System.out.println(words.length);
    }


    @Test
    public void playCountTheNumberOfVowels() {
        String sentence = "The quick brown fox jumps over the lazy dog";
        int count = 0;
        for (char c : sentence.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        System.out.println(count);
        System.out.println(sentence.chars().filter(c -> c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u').count());
    }
}
