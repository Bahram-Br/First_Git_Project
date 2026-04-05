package LiveClasses;

public class FilterCharacter {

    public static void main(String[] args) {

        String str = "Hello $3^#&@7@%&# 1254";
        String digits ="";
        String letters ="";
        String special ="";

        for (char ch: str.toCharArray()){
            //System.out.println("Each character is: " + ch);
            if (Character.isDigit(ch)){
                digits += ch;
            } else if(Character.isLetter(ch)){
                letters += ch;
            } else {
                special += ch;
            }
        }
        System.out.println("Digits: " + digits);
        System.out.println("Letters: " + letters);
        System.out.println("Special: " + special);

        //for (int i = 0; i < str.length(); i++) {
        //    System.out.println("Each character is: " + str.charAt(i));
        //}
    }



}
