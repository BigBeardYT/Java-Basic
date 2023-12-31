package com.yt.coreclass;

public class testInsert {
    public static void main(String[] args) {
        String[] fields = {"name", "position", "salary"};
        String table = "employee";
        String insert = builderInsertSql(table, fields);
        System.out.println(insert);
        String s = "INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)";

        System.out.println(s.equals(insert) ? "测试成功" : "测试失败");
    }

    public static String builderInsertSql(String table, String[] fields) {
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO " + table + " (");
        for(String field : fields) {
            sb.append(field);
            sb.append(", ");
        }
        sb.delete(sb.length()-2, sb.length());
        sb.append(") VALUES (?, ?, ?)");
        return sb.toString();

    }
}
