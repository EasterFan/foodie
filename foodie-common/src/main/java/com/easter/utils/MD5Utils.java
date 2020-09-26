package com.easter.utils;

import org.apache.commons.codec.binary.Base64;

import java.security.MessageDigest;

/**
 * @Author EasterFan working on 2020/9/26 8:23 下午
 * @Description
 * @Version 1.0
 */
public class MD5Utils {
    public static String getMD5Str(String strValue) throws Exception {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        return Base64.encodeBase64String(md5.digest(strValue.getBytes()));
    }

    public static void main(String[] args) {
        try {
            String md5 = getMD5Str("123456");
            System.out.println(md5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}