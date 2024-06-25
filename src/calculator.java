import java.util.Scanner;
class calculator
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days for which temperatures need to be recorded");
        int n = sc.nextInt();
        int temp[] = new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            System.out.print("Temperature for the day "+(i+1)+" ");
            temp[i]=sc.nextInt();
            sum +=temp[i];
        }
        double avg=sum/n;
        int count=0;
        for(int i=0;i<temp.length;i++){
            if(temp[i]>avg){
                count++;
            }

        }
        System.out.println("The average temperature is: "+avg);
        System.out.println("The number of days above average temperatures are: "+count);
    }
}
