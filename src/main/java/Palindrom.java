import java.util.Scanner; // импорт сканера

class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое слово или фразу: ");
        String phrase1 = sc.nextLine();
        System.out.println(phrase1);
        StringBuffer rev = new StringBuffer(phrase1).reverse();
        String strRev = rev.toString();
        if (phrase1.equalsIgnoreCase(strRev)) {
            System.out.println("Это полиндром");
        } else {
            System.out.println("Не полиндром");
        }


    }
}