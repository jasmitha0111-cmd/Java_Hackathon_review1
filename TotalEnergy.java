import java.util.Scanner;

class TotalEnergy
{
    int calculateTotalEnergy(int morningEnergy, int eveningEnergy) 
    {
        int Total = morningEnergy + eveningEnergy;
        return Total;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int morning = sc.nextInt();
        int evening = sc.nextInt();

        TotalEnergy obj = new TotalEnergy();
        int total = obj.calculateTotalEnergy(morning, evening);
    }
}