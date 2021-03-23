import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

enum weeks{
		MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
	}
/*enum weekdays{
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY;
}
enum weekends{
	SATURDAY,SUNDAY;
}*/
	public class enumcls {
	public static void main(String[] args) {
		Set<weeks> set1= EnumSet.allOf(weeks.class);
		System.out.println("the entire weeks are:"+set1);

		Set<weeks> set2= EnumSet.noneOf(weeks.class);
		System.out.println("the entire weeks are:"+set2);
		
	/*	Set<weekdays> set3= EnumSet.allOf(weekdays.class);
		System.out.println("the entire weeks are:"+set3);

		Set<weekends> set4= EnumSet.allOf(weekends.class);
		System.out.println("the entire weeks are:"+set4);*/
		
		Set<weeks> set5= EnumSet.of(weeks.SATURDAY,weeks.SUNDAY);
		System.out.println("the weekends are:"+set5);

		Set<weeks> set6= EnumSet.of(weeks.MONDAY,weeks.TUESDAY,weeks.WEDNESDAY,weeks.THURSDAY,weeks.FRIDAY);
		System.out.println("the weekdays are:"+set6);



	}

}
