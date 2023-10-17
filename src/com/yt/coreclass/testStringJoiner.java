package com.yt.coreclass;

import java.util.StringJoiner;

public class testStringJoiner {
    public static void main(String[] args) {
        String [] names = {"Bob", "Alice", "Grace"};
        var sj = new StringJoiner(",", "Hello ", "!");
        for(String name : names) {
            sj.add(name);
        }
        System.out.println(sj.toString());

        String [] fields = {"name", "position", "salary"};
        String table = "employee";
        String select = buildSelectSql(table, fields);
        System.out.println(select);
        String srcSql = "SELECT name, position, salary FROM employee";
        System.out.println(srcSql.equals(select) ? "OK" : "fail");

    }

    public static String buildSelectSql(String table, String[] fields) {
        StringJoiner sj = new StringJoiner(", ", "SELECT ", " FROM " + table);
        for(String field : fields) {
            sj.add(field);
        }
        return sj.toString();
    }
}
