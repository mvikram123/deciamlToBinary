class Conversion{
    static void decimalToBinary(int a)
    {
        int binary[]=new int[20];
        int index=0;
        while(a>0)
        {
            int rem=a%2;
            binary[index++]=rem;
            a=a/2;
        }
        for(int i=index-1; i>=0; i--)
        {
            System.out.print(binary[i]);
        }


    }
}
public class Main
{
    public static void main(String[] args) {


        int a=12;
        Conversion.decimalToBinary(a);


    }
}