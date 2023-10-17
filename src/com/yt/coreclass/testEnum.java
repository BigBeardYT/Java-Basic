package com.yt.coreclass;

public class testEnum {
    public static void main(String[] args) {
        Weekday day = Weekday.SUN;
//        int day = 1;
        System.out.println(day);
        System.out.println(day.dayValue);
        System.out.println(day.chinese);
        if(day == Weekday.SAT || day == Weekday.SUN) {
            System.out.println("RELAX");
        } else {
            System.out.println("WORK");
        }
    }

    enum Weekday {
        MON(1, "星期一"), TUE(2, "星期二"), WED(3, "星期三"),
        THU(4, "星期四"), FRI(5, "星期五"), SAT(6, "星期六"),
        SUN(0, "星期天");
        public final int dayValue;
        public final String chinese;
        private Weekday(int dayValue, String chinese) {
            this.dayValue = dayValue;
            this.chinese = chinese;
        }

        @Override
        public String toString() {
            return this.chinese;
        }
    }
}
