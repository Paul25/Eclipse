package persp.lesson1;

public class CurrentDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

	}

}
