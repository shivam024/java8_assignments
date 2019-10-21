package hello;

public class Date {
	
	
	
	    private int year;
	    private int month;
	    private int day;
	    private boolean shortDisplay = true;
	    
	    

	    public Date() {
	        setDate(2000, 01, 01);
	    }

	    public Date(int yy, int mm, int dd) {
	        setDate(yy, mm, dd);
	    }

	    public Date(int yy, int mm) {
	        setDate(yy, mm);
	    }

	    public Date(int yy) {
	        setDate(yy);
	    }

	    public Date(Date otherDate) {
	        setDate(otherDate);
	    }

	    public Date(String dateStr) {
	        setDate(dateStr);
	    }

	    public void setDate(int yy, int mm, int dd) {
	        setYear(yy);
	        setMonth(mm);
	        setDay(dd);
	    }

	    public void setDate(int yy, int mm) {
	        setYear(yy);
	        setMonth(mm);
	        setDay(1);
	    }

	    public void setDate(int yy) {
	        setYear(yy);
	        setMonth(1);
	        setDay(1);
	    }

	    public void setDate(Date otherDate) {
	        int yy = getYear();
	        int mm = getMonth();
	        int dd = getDay();
	        setYear(yy);
	        setMonth(mm);
	        setDay(dd);
	    }

	    public void setDate(String dateStr) {
	        int length = dateStr.length();
	        int indexCount = 0;
	        if (length >= 0) { // basically checking to see if the date even exists
	            if (dateStr.indexOf('/') >= 0) {
	                int index = dateStr.indexOf('/');
	                indexCount++;
	                String dd = dateStr.substring(index+1, dateStr.length());
	                if (dd.substring(1, dd.length()).lastIndexOf('/') >= 0 ) {
	                    int index2 =  dd.lastIndexOf('/');
	                    indexCount++;
	                    String yy = dd.substring(index2+1, dd.length());
	                    if (yy.lastIndexOf('/') >= 0) {
	                        indexCount++;
	                    }
	                    String mm = dateStr.substring(0, index);
	                    dd = dd.substring(0, index2);
	                    yy = yy.substring(0, yy.length());
	                    System.out.println(mm + "\n" + dd + "\n" + yy );
	                    int y = Integer.parseInt(yy);
	                    int d = Integer.parseInt(dd);
	                    int m = Integer.parseInt(mm);
	                    setYear(y);
	                    setMonth(m);
	                    setDay(d);
	                }
	            }
	        }

	    }

	    public void setYear(int yy) {
	        if (yy >= 1900) {
	            year = yy;
	        } else {
	            throw new IllegalArgumentException("lol");
	        }
	    }

	    public void setMonth(int mm) {
	        if (mm >= 1 && mm <= 12) {
	            month = mm;
	        } else {
	            throw new IllegalArgumentException("not cool");
	        }
	    }

	    public void setDay(int dd) {
	        if (dd >= 1 && dd <= 31) {
	            day = dd;
	        } else {
	            throw new IllegalArgumentException("stupid");
	        }
	    }

	    public int getYear() {
	        return year;
	    }

	    public int getMonth() {
	        return month;
	    }

	    public int getDay() {
	        return day;
	    }

	    public void setShortDisplay() {
	        shortDisplay = true;
	    }

	    public void setLongDisplay() {
	        shortDisplay = false;
	    }

	    public boolean isShortDisplay() {
	        if (shortDisplay) {
	            return true;
	        } else {
	            return false;
	        }
	    }

	    public void incrementDay() {
	        day++;
	        if (day > 31) {
	            day = 1;
	            incrementMonth();
	        }
	    }

	    public void incrementMonth() {
	        month++;
	        if (month > 12) {
	            month = 1;
	            incrementYear();
	        }
	    }

	    public void incrementYear() {
	        year++;
	    }

	    public boolean equals(Object other) {
	        Date that = (Date) other;
	        if (this.day == that.day && this.month == that.month && this.year == that.year) {
	            return true;
	        } else {
	            return false;
	        }
	    }

	    public boolean before(Date otherDate) {
	        Date that = otherDate; 
	        if (this.year < that.year) return true;
	        if (this.month < that.month) return true;
	        if (this.day < that.day) return true;
	        else return false;
	    }

	    public String toString() {
	        boolean check = isShortDisplay();
	        if (check) {
	            if (month < 10 && day < 10) {
	                return "0" + month + "/" + "0" + day + "/" + year;
	            }
	            if (month < 10 && day > 10) {
	                return "0" + month + "/" + day + "/" + year;
	            }
	            if (month > 10 || day < 10) {
	                return month + "/" + "0" + day + "/" + year;
	            } else {
	                return  month + "/" + day + "/" + year;
	            }
	        } else {
	            return monthString(month) + " " + day + ", " + year;
	        }
	    }

	    public static String monthString(int month) {
	        if (month >= 1 && month <= 12) {
	            String[] stringMonth = {"", "January", "February", "March", "April", "June", "July",
	                "August", "September", "October", "November", "December"};
	        return stringMonth[month];
	        } else {
	            throw new IllegalArgumentException();
	        }
	    }
	}

