package lesson6;

public class DZUtils {

    public static int numberWordsInText(String text) {
        int countWords = 0;
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            countWords++;
        }
        return countWords;
    }

    public static int numberWordsInText2(String text) {
        String[] words = text.split(" ");
        return words.length;
    }

    public static void reverseCharInWords(String text) {
        int lengthText = text.length() - 1;
        String reverse = "", temp = "";
        for (int i = 0; i <= lengthText; i++) {
            temp += text.charAt(i);
            if ((text.charAt(i) == ' ') || (i == lengthText)) {
                for (int j = temp.length() - 1; j >= 0; j--) {
                    reverse += temp.charAt(j);
                    if ((j == 0) && (i != lengthText))
                        reverse += " ";
                }
                temp = "";
            }
        }
        System.out.println(reverse);
    }

    public static void reverseWordByWord(String text) {
        StringBuilder result = new StringBuilder();
        String[] words = text.split(" ");
        for (String word : words) {
            char[] charArray = word.toCharArray();
            int iEnd = word.length() - 1;
            StringBuilder temp = new StringBuilder();
            for (int i = iEnd; i >= 0; i--) {
                temp.append(charArray[i]);
            }
            result.append(temp);
            result.append(" ");
        }
        System.out.println(result);
    }

    public static void countSoglasFromText(String text) {
        int countSoglas = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'b' || text.charAt(i) == 'c' || text.charAt(i) == 'd' || text.charAt(i) == 'f'
                    || text.charAt(i) == 'g' || text.charAt(i) == 'h' || text.charAt(i) == 'j' || text.charAt(i) == 'k'
                    || text.charAt(i) == 'l' || text.charAt(i) == 'm' || text.charAt(i) == 'n' || text.charAt(i) == 'p'
                    || text.charAt(i) == 'q' || text.charAt(i) == 'r' || text.charAt(i) == 's' || text.charAt(i) == 't'
                    || text.charAt(i) == 'v' || text.charAt(i) == 'w' || text.charAt(i) == 'x' || text.charAt(i) == 'y'
                    || text.charAt(i) == 'z' || text.charAt(i) == 'B' || text.charAt(i) == 'C' || text.charAt(i) == 'D'
                    || text.charAt(i) == 'F' || text.charAt(i) == 'G' || text.charAt(i) == 'H' || text.charAt(i) == 'J'
                    || text.charAt(i) == 'K' || text.charAt(i) == 'L' || text.charAt(i) == 'M' || text.charAt(i) == 'N'
                    || text.charAt(i) == 'P' || text.charAt(i) == 'Q' || text.charAt(i) == 'R' || text.charAt(i) == 'S'
                    || text.charAt(i) == 'T' || text.charAt(i) == 'V' || text.charAt(i) == 'W' || text.charAt(i) == 'X'
                    || text.charAt(i) == 'Y' || text.charAt(i) == 'Z') {
                countSoglas++;
            }
        }
        System.out.println(countSoglas);
    }

    public static double valueTrinagle(double valueA, double valueB, double valueC) {
        double poluperimetrTr = ((valueA + valueB + valueC) / 2);
        double areaTri = Math.sqrt(poluperimetrTr * (poluperimetrTr - valueA) * (poluperimetrTr - valueB) * (poluperimetrTr - valueC));
        return areaTri;
    }

    public static double valueTrinagle2(double valueA, double valueB) {
        int stepen = 2;
        double areaTri2 = valueB / 4 * (Math.sqrt(4 * Math.pow(valueA, stepen) - Math.pow(valueB, stepen)));
        return areaTri2;
    }

    public static int ChetNumbers(Integer[] numArray) {
        int countChet = 0;
        for (int i = 1; i <= numArray.length; i++) {
            if (i % 2 == 0) {
                countChet++;
            }
        }
        return countChet;
    }

    public static boolean PassVer(String text) {
        return (text.matches("^.*[A-Z].*$")) & (text.matches("^.*[0-9].*$")) & (text.length() > 8);
    }
}