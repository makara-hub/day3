public class Main {
public static void main(String[] args) {
String s = "racecar";
String r = "";
char ch;
for (int i = 0; i < s.length(); i++) {
ch = s.charAt(i);
r = ch + r;
}
if (s.equals(r)) {
System.out.println(true);
} else {
System.out.println(false);
}
}
}
