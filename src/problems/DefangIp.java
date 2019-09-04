package problems;

public class DefangIp {
    public static String defangIPaddr(String address) {
        return address.replaceAll("\\.","[.]");
    }

    public static void main(String[] args) {
        System.out.println(defangIPaddr("255.100.50.0"));
    }
}
