public class Test {

    public static void main(String[] args) {
        System.out.println("iexplore:");
        http://www.nwpu.edu.cn;
        System.out.println(":maximize");

        System.out.println("-----------------------");
        tag:
        for (int i = 0 ; i < 10 ; i++){
            for (int j = 0 ; j < 10 ; j++){
                System.out.println(i+"-"+j);
                if (j==4){
                    break tag; // 用于跳出多层循环，类似于c语言中的goto语法，同样不推荐使用
                }
            }
        }
    }
}
