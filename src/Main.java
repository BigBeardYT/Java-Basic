public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int n = 9;
        for(int i = 1;i < n;i++){
            for(int j = 1;j < n;j++){
                System.out.print("i * j = " + i * j);
                if(j == i){
                    System.out.println();
                }
            }
        }
    }
}
