package com.fengjunzi.learning.scala.difference.writing;
/**
 * @author: Shi, LongCheng
 * @createTime: 3/12/2022$ PM8:00$
 * @version 1.0
 * @description
 */
public class simpleDemoWithJava {


    /**
     * java ways to get whether contains upper case for 1 string
     * @param str
     * @return true if has upper case, false otherwise
     *
     */
    public boolean containsUpperCase(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    /**
     * java stream ways to get whether contains upper case for 1 string
     * @param str
     * @return true if has upper case, false otherwise
     *
     */
    public boolean containsUpperCaseWithStream(String str) {
        return str.chars().anyMatch(Character::isUpperCase);
    }
}
