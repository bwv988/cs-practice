public class MiscTest {
    
    public void q1() {
        int sum = 0;
        for (int i = 1; i < 1000; i++)
            for (int j = 0; j < i; j++)
                sum++;
    
        System.out.println(sum);
    }
    
    public static void main(String[] args) {
        MiscTest obj = new MiscTest();
        
        obj.q1();
    }
}