package persp.lesson1;

public class CurrentDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final long millisInAday = 24 * 60 * 60 * 1000;
		final int startYear=1970;
		final int daysInAyear=365;
		final int daysInMonth=30;
		final int monthInAyear=12;
		final int leapDays=11;
						
		long timeMs=System.currentTimeMillis();
		System.out.println(timeMs);
		long daysFromStart=timeMs/millisInAday;
		System.out.println(daysFromStart);
		long currentYear=startYear + daysFromStart/daysInAyear;
		System.out.println(currentYear);
		long quantityYears=currentYear-startYear;
		System.out.println(quantityYears);
		long day=daysFromStart/quantityYears/daysInAyear+1;
		long day1=((daysFromStart-quantityYears*daysInAyear)/daysInMonth)+(leapDays-10)+1;
		System.out.println(day1);
		long currentMonth=quantityYears/monthInAyear;
		long currentMonth1=((daysFromStart/daysInMonth)/monthInAyear)/monthInAyear;
		System.out.println(currentMonth1);
		System.out.println(day1+"."+currentMonth1+"."+currentYear);
		System.out.println(day+"."+currentMonth+"."+currentYear);
			
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
