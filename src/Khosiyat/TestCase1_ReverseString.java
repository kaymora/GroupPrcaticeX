package Khosiyat;

public class TestCase1_ReverseString {

    public static void main(String[] args) {

        String str= "java";
        String reversed= "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversed+=str.charAt(i) + " ";

        }
        System.out.println(reversed);

        }
        }

