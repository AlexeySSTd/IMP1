import java.util.Scanner;

public class IMP1 {
    static int result;
    private static class Search {
        int openBracket,closeBracket,usedOpenBracket,usedCloseBracket;
        //The algorithm looks for all ways to write bracket
        public Search(int openBracket, int closeBracket, int usedOpenBracket, int usedCloseBracket) {
            if (openBracket!=0) new Search(openBracket-1,closeBracket,usedOpenBracket+1,usedCloseBracket);
            if (closeBracket!=0&&usedCloseBracket+1<=usedOpenBracket) new Search(openBracket,closeBracket-1,usedOpenBracket,usedCloseBracket+1);
            if (openBracket==0&&closeBracket==0) result+=1;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        new Search(N,N,0,0);
        System.out.println(result);
    }
}
