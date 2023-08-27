package Class11;

public class HW3 {
    public static void main(String[] args) {
        String str = "dferddd123$$$$";

        int upperCase = 0;
        int lowerCase = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(Character.isUpperCase(c)){
                upperCase++;
            }
            if(Character.isLowerCase(c)){
                lowerCase++;
            }
        }
        System.out.println("The amount of upper case letters are :" + upperCase);
        System.out.println("The amount of lower case letters are :" + lowerCase);
    }
}
