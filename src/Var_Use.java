public class Var_Use {
    public static void main(String[] args) {
        // jvm会自动根据var后面new的内容生成对应的变量
        // StringBuffer sb = new StringBuffer();
        var sb = new StringBuffer();
        for(int i = 0;i < 10;i++){
            sb.append(String.valueOf(i));
        }
        System.out.println(sb.toString());
        System.out.println("1.2 * 2 = " + 1.2 * 2);

    }
}
