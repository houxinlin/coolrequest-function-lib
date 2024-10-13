package dev.coolrequest.function;

public class CoolRequestPublicFunction {
    public static class Time {
        public static long timestamp() {
            return System.currentTimeMillis();
        }
    }

    public static class Color {

    }

    public static class Address {

    }

    public static class Phone {
        private static String[] telFirst = "134,135,136,137,138,139,150,151,152,157,158,159,130,131,132,155,156,133,153".split(",");

        public static String randPhoneNumber() {
            String first = telFirst[Int.randInt(0, telFirst.length - 1)];
            String second = String.valueOf(Int.randInt(1, 888) + 10000).substring(1);
            String third = String.valueOf(Int.randInt(1, 9100) + 10000).substring(1);
            return first + second + third;
        }
    }

    public static class UUID {
        public static String uuid() {
            return java.util.UUID.randomUUID().toString();
        }

        public static String uuidWithOutDelimiter() {
            return uuid().replaceAll("-", "");
        }
    }

    public static class Int {
        public static int randInt(int start, int end) {
            return (int) (Math.random() * (end - start + 1) + start);
        }
    }

    public static class Date {

    }

}
