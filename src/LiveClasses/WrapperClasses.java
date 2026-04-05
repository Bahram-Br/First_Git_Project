package LiveClasses;

public class WrapperClasses {

    public static void main(String[] args) {

        String str1 = "$123";
        String str2 = "45.69";

        String str3 = str1.replace("$","");

        int num1 = Integer.parseInt(str3);
        double num2 = Double.parseDouble(str2);

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        int n = 109287;

        String str4 = Integer.toString(n);

        System.out.println(str4 + 2);
    }
}
