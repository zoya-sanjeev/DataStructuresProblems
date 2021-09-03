
public class Calendar {
	
	static int maxDaysInMonth[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
		static int findMaxDay(int month, int year) {
			
			if ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0))) {
				maxDaysInMonth[2] = 29;
			}
			int max = 0;
			max=maxDaysInMonth[month];
			return max;
		}

		static int findDayNo(int month, int year) {
			int dayIndex=1;
			int yearIndex=1;
			int dateIndex=1;
            int monthIndex=1;
            int flag=0;
            while(flag==0) {
            	
           
            if (dateIndex == 1 && monthIndex == month && yearIndex == year) {
                flag=1;
            }
            
            if (year % 4 == 0 && year % 100 != 0
                    || year % 100 == 0) {
                    maxDaysInMonth[2] = 29;
                }
      
                else {
                    maxDaysInMonth[2] = 28;
                }
            dayIndex++;
            dateIndex++;
  
            if (dateIndex > maxDaysInMonth[monthIndex]) {
                monthIndex++;
                dateIndex = 1;
            }
  
            if (monthIndex > 12) {
                monthIndex = 1;
                yearIndex++;
            }
  
            if (dayIndex == 7) {
                dayIndex = 0;
            }
            
            }
            
            return dayIndex;
		}

		static int[][] fillCalendar(int max, int firstDay) {
			int A[][] = new int[6][7];
			int dayCounter = 1, z = firstDay;

			for (int i = 0; i < 6; i++) {
				for (int j = firstDay; j < 7; j++) {
					if (dayCounter <= max) {
						A[i][j] = dayCounter;
						dayCounter++;
					}
				}
				firstDay = 0;
			}

			return A;
		}

		 
		static void printCalendar(int A[][],int month, int y) {

			System.out.println("\t\t\t   " + month + " " + y);
			System.out.println("\tSUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");

			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 7; j++) {
					if (A[i][j] != 0)
						System.out.print("\t " + A[i][j]);
					else
						System.out.print("\t ");
				}
				System.out.println();
			}
		}

	public static void main(String[] args) {
		
		int month=Integer.parseInt(args[0]);
		int year=Integer.parseInt(args[1]);
		int noOfDays=findMaxDay(month,year);
		System.out.println(noOfDays);
		int firstDay=findDayNo(month,year);
		System.out.println(firstDay);
		int[][] arr=fillCalendar(noOfDays,firstDay);
		printCalendar(arr,4,1999);

	}

}
