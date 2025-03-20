package ro.ulbs.paradigme.lab3.util.PasswordMaker;

import java.security.SecureRandom;

public class PasswordMaker {
    private static final PasswordMaker instance;
    private static int instanceCounter = 0;

    static {
        instance = new PasswordMaker("DefaultUser");
    }

    private static final int MAGIC_NUMBER = new SecureRandom().nextInt(6) + 5;
    private final String magicString;
    private final String name;
    private static final SecureRandom random = new SecureRandom();

    private PasswordMaker(String name) {
        this.name = name;
        this.magicString = StringRandomizer.getRandomString(20);
    }

    public static PasswordMaker getInstance() {
        instanceCounter++;
        return instance;
    }

    public static int getInstanceCounter() {
        return instanceCounter;
    }

    public String getPassword() {
        String part1 = StringRandomizer.getRandomString(MAGIC_NUMBER);
        String part2 = getRandomSubstring(magicString, 10);
        String part3 = String.valueOf(name.length());
        int part4 = random.nextInt(51);

        return part1 + part2 + part3 + part4;
    }

    private String getRandomSubstring(String str, int length) {
        int start = random.nextInt(str.length() - length + 1);
        return str.substring(start, start + length);
    }
}