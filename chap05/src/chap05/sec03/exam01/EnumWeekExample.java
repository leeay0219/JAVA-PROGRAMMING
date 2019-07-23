package chap05.sec03.exam01;
import java.util.Calendar; 

public class EnumWeekExample {

	public static void main(String[] args) {

		Calendar today1 = Calendar.getInstance();
		int week = today1.get(Calendar.DAY_OF_WEEK);
		int year = today1.get(Calendar.YEAR);
		int month = today1.get(Calendar.MONTH);
		int day = today1.get(Calendar.DAY_OF_MONTH);
		int hour = today1.get(Calendar.HOUR);
		int minute = today1.get(Calendar.MINUTE);
		int second = today1.get(Calendar.SECOND);
		int ampm = today1.get(Calendar.AM_PM);
		
		Week today = null;
		
		switch(week) {
			case 1: 
				today = Week.SUNDAY; break; 
			case 2: 
				today = Week.MONDAY; break;
			case 3: 
				today = Week.TUESDAY; break;
			case 4: 
				today = Week.WEDNESDAY; break;
			case 5: 
				today = Week.THURSDAY; break;
			case 6: 
				today = Week.FRIDAY; break;
			case 7: 
				today = Week.SATURDAY; break;
		}
		System.out.println("Today: " + today);
		
		if (today == Week.SUNDAY) {
			System.out.println("Soccer day");
		} else {
			System.out.println("Java day"); 
		}
		
		System.out.println(year + "년 " + month + "월 " + day + "일 " + today + " " + ampm + hour + "시 " + minute + "분 " + second + "초");
		
		String strDate = "" + year + "년 "; 
		strDate += (month+1) + "월 "; 
		strDate += day + "일 ";
		String[] weekArray = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"}; 
		strDate += weekArray[week-1] + " "; 
		strDate += (ampm ==Calendar.AM)?"오전 ":"오후 ";
		strDate+= hour + "시 ";
		strDate+= minute + "분 ";
		strDate+= second + "초";
		System.out.println(strDate); 
		
	}

}
