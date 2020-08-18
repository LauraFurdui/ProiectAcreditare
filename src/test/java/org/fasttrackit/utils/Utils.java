package org.fasttrackit.utils;

import java.util.Random;

public class Utils {
//    public static String randomString(int length) {
//        int rightLimit = 122; // letter 'z'
//        int leftLimit = 97; // letter 'a'
//        Random random = new Random();
//
//        return random.ints(leftLimit, rightLimit + 1)
//                .limit(length)
//                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
//                .toString();
//
//    }

    public static String randomString(int length) {
        String SALTCHARS = "abcdefghijklmnopqrstuvxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < length) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
}
