package MD5;

import MD5.MD5checksum;

public class Main {

    public static void main(String[] args) {

        String filePath = "D:\\Programms\\workspace\\MD5\\bin\\fileno1.txt";

        MD5checksum file = new MD5checksum(filePath);

        System.out.println("MD5: " + file.getMD5());
    }
}