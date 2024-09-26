package JavaFundamentals;
public class MultiplicationOOP {
    private int value1,value2;
    MultiplicationOOP(){
        this.value1=value1;
        this.value2=value2;
    }
    void putvalue1(int value1){
        this.value1=value1;
    }
    void putvalue2(int value2){
        this.value2=value2;
    }
    int getMultiplication(){
        return value1*value2;
    }
    public static void main(String[] args) {

        //1st object
        MultiplicationOOP object1=new MultiplicationOOP();
        object1.putvalue1(10);
        object1.putvalue2(20);
        int mul=object1.getMultiplication();
        System.out.println("The first object returned "+mul);

        //2nd Object
        MultiplicationOOP object2=new MultiplicationOOP();
        object2.putvalue1(30);
        object2.putvalue2(40);
        mul=object2.getMultiplication();
        System.out.println("The second object returned "+mul);
    }
}
