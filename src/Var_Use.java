public class Var_Use {
    public static void main(String[] args) {
        // jvm会自动根据var后面new的内容生成对应的变量
        // StringBuffer sb = new StringBuffer();
        var sb = new StringBuffer();
        for(int i = 0;i < 10;i++){
            sb.append(String.valueOf(i));
        }
        System.out.println(sb.toString());

        // 除法运算是向下还是向上取整？ -- 都不是，而是取其中的整数部分，小数自动忽略
        var num = 5;

        System.out.println("5 / 2 = " + num / 2);
        System.out.println("5 / 3 = " + num / 3);

        System.out.println("1.2 * 2 = " + 1.2 * 2);
        System.out.println("1.2 * 4 = " + 1.2 * 4);

    }
}
