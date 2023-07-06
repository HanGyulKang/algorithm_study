package basic.algorithm2021.month03;

public class help_youra_homework {
    final static String STR = "abcd efg hijk";

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        String[] strArr = STR.split(" ");

        for (String s : strArr) {
            sb.append(s);
        }
        System.out.println("1번 방식 : " + sb.toString());
        System.out.println("2번 방식 : " + STR.replace(" ", ""));

        sb = new StringBuffer();
        sb.append(STR.substring(0,STR.indexOf(" ")))
                .append((STR.substring(STR.indexOf(" ") + 1, STR.lastIndexOf(" "))))
                .append(STR.substring(STR.lastIndexOf(" ") + 1));
        System.out.println("3번 방식 : " + sb.toString());

        sb = new StringBuffer();
        for (int i = 0; i < STR.length(); i++) {
            char c = STR.charAt(i);
            if(' ' != c) {
                sb.append(c + "");
            }
        }
        System.out.println("4번 방식 : " + sb.toString());
        System.gc();
    }
}
