package persp.lesson1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class MainMyClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
//      double f=12.65;
//      System.out.println(Math.round(f));
//        Scanner sc=new Scanner(System.in);
////      System.out.println("Enter first value");
//        int firstN=sc.nextInt();
////      System.out.println("Enter second value"); 
////      int secondN=sc.nextInt();
////      int summ=firstN+secondN;
////      System.out.println("Summa: "+summ);

//		int arr[]=new int[5];
//		for (int i=0; i<arr.length;i++){
//			arr[i]= (int)(Math.random()*21);
////			System.out.println(arr[i]);
		final long millisInAday = 24 * 60 * 60 * 1000;
		final int startYear=1970;
		final int daysInAyear=365;
		final int monthInAyear=12;
						
		long timeMs=System.currentTimeMillis();
		long daysFromStart=timeMs/millisInAday; 
		long currentYear=startYear + daysFromStart/daysInAyear;
		long quantityYears=currentYear-startYear;
		long day=daysFromStart/quantityYears/daysInAyear+1;
		long currentMonth=quantityYears/monthInAyear;
			
		int month = (int) currentMonth;
        switch(month){
            case 0:
        	    System.out.println(day+" "+"January"+" "+currentYear );
        	break;
        	case 1:
        		System.out.println(day+" "+"February"+" "+currentYear );
        	break;
        	case 2:
        		System.out.println(day+" "+"March"+" "+currentYear );
        	break;
        	case 3:
        		System.out.println(day+" "+"April"+" "+currentYear );
        	break;
        	case 4:
        		System.out.println(day+" "+"May"+" "+currentYear );
        	break;
        	case 5:
        		System.out.println(day+" "+"June"+" "+currentYear );
        	break;
        	default:
        		System.out.println("N/A format of the data");
        	break;
        
        }
           //5
        
		
		
		
		
		}
		
	}


