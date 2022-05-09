package dp;
import java.io.File;
import java.util.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\java\\abc.txt");
		//Main m = new Main();
		try {
			file.createNewFile();
		}
		catch(IOException e) {
			System.out.println("Exception occured while creating the file....");
		}
		//Different commands for file handling....
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter String to convert into uppercase");
		String inputString = "";
		try {
			inputString = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("inputString after converting to upper case is : "+ inputString.toUpperCase());
		ArrayList<Integer> al = new ArrayList<Integer>();
		QueueusingArrayList queue  = new QueueusingArrayList(al,0,-1);
		System.out.println("Implemting queue using ArrayList....");
		System.out.println("Enter 1 to add an element");
		System.out.println("Enter 2 to pop an element");
		System.out.println("Enter 3 to view peek element");
		System.out.println("Enter 4 to delete an element");
		System.out.println("Enter 5 to print the queue");
		System.out.println("Enter any num >5 to exit");
		Scanner sc = new Scanner(System.in);
		int test=1;
		while(test<=5) {
			test=sc.nextInt();
			switch(test) {
			case 1 :System.out.println("Enter val to add");
				    queue.add(sc.nextInt());
				    break;
			case 2 :queue.pop();
			        break;
			case 3 : System.out.println("peek element is : "+queue.peek());
			         break;
			case 4 : System.out.println("Enter val to delete");
			         queue.deleteElement(sc.nextInt());
			         break;
			case 5 : queue.printQueue();
			         break;
			default : test=10;
			}
		}
		
	}

}
