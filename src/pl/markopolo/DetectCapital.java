package pl.markopolo;

public class DetectCapital {

    public boolean detectCapitalUse(String word) {

        if(word.length() <= 1) return true;

        if(Character.isUpperCase(word.charAt(0))) {
            boolean isFirstCharacter = Character.isUpperCase(word.charAt(1));
            for(int i = 2; i < word.length(); i++) {
                boolean currentCharCase = Character.isUpperCase(word.charAt(i));
                if(currentCharCase != isFirstCharacter) return false;
            }

        }else {
            for(int i = 1; i < word.length(); i++) {
                if(Character.isUpperCase(word.charAt(i))) return false;
            }
        }

        return true;
    }
}
