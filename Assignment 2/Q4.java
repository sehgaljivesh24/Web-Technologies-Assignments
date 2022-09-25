public class Q4
{
	public static void main(String[] args) {
	    
		int yrs = 0; 
        double population = 80000;
        while(population < 150000)
        {
            population += 0.05 * population; // population increases 5% annualy
            yrs++;
        }

        System.out.println("The population will exceed 150000 after " + yrs + " years");
	}
}