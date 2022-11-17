import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrencyConverter {
	
	private double middleRate;
	private double rsd;
	private double eur;

	public void setMiddleRate(double middleRate) {
		this.middleRate = middleRate;
	}
	
	public void showMenu() throws InterruptedException {
		Thread.sleep(1000);
			System.out.println("Unestie broj i izaberite željenu opciju: ");
			System.out.println("============================================");
				Thread.sleep(1000);
			
		
		System.out.println("Pritisnite 1 za konverotvanje EUR-RSD");
		System.out.println("Pritisnite 2 za konverotvanje RSD-EUR");
		System.out.println("Pritisnite 0 da izadjete iz programa");
		System.out.println("============================================");
	}
	
	public void exchangeEurToRsd() throws InterruptedException {
		CurrencyConverter exchange = new CurrencyConverter();
		Scanner numberInput = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###");
		
		exchange.setMiddleRate(117.29448);
		
		System.out.print("Unesite koliko eura želite da pretvorite u dinare: ");
		exchange.eur = numberInput.nextInt();
		exchange.rsd = exchange.eur * exchange.middleRate;
		System.out.println("Za " + exchange.eur + " eura dobili ste " + df.format(exchange.rsd) + " dinara \n \n \n");
		System.out.println("============================================");
		
		
	}
	
	public void exchangeRsdToEur() {
		CurrencyConverter exchange = new CurrencyConverter();
		Scanner numberInput = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###");
		
		exchange.setMiddleRate(117.29448);
		
		System.out.print("Unesite koliko dinara želite da pretvorite u eure: ");
		exchange.rsd = numberInput.nextInt();
		exchange.eur = exchange.rsd / exchange.middleRate;
		System.out.println("Za " + exchange.rsd + " dinara dobili ste " + df.format(exchange.eur) + " eura \n \n \n");
	}
	
	
	public void mainMenu() throws InterruptedException {
		
		CurrencyConverter exchange = new CurrencyConverter();
		Scanner numberInput = new Scanner(System.in);
		
		
		int options;
		boolean start = true;


		while(start){
			
			exchange.showMenu();
			options = numberInput.nextInt();
			
			switch(options) {
			default:
				System.out.println("Nepostojeća opcija! \n \n \n");
				break;
			case 1:
				exchange.exchangeEurToRsd();
				break;
			case 2:
				exchange.exchangeRsdToEur();
				break;
			case 0:
				System.out.println("Uspešno se izašli iz programa");
				start = false;
				numberInput.close();
				break;
			}
		} 
			
}; 
		

	
	public static void main(String[] args) throws InterruptedException {
		
		CurrencyConverter exchange = new CurrencyConverter();
		
		exchange.mainMenu();
		
	}
	
}
