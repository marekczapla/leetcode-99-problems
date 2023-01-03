package pl.markopolo;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }

        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char letter = pattern.charAt(i);
            String word = words[i];

            if (!charToWord.containsKey(letter)) {
                charToWord.put(letter, word);
            }

            if (!wordToChar.containsKey(word)) {
                wordToChar.put(word, letter);
            }

            if (!charToWord.get(letter).equals(word) || !wordToChar.get(word).equals(letter)) {
                return false;
            }
        }

        return true;
    }
}
