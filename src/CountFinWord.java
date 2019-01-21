import java.util.Scanner;
public class CountFinWord {
    private int CountFinWord_(String str){
        String[] strings;
        strings = str.split(" ");
        return strings[strings.length-1].length();
    }
    public static void main(String[] args){
        System.out.println("请输入一段文字");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        string = string.trim();
        System.out.println(new CountFinWord().CountFinWord_(string));
    }
}
