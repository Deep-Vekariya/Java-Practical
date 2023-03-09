class Time{
	int hour;
	int minute;
	int second;

    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

	Time(){}
    
    public Time Sum(Time t2) {
        Time total = new Time();
        total.hour = t2.hour + hour;
        total.minute = t2.minute + minute;
        total.second = t2.second + second;
        return total;
    }
    
    public String toString() {
        return "[Hour : " + hour + ", Minute : " + minute + ", Second : " + second + "]";
    }
}


public class TimeMain{
	public static void main(String[] args){
		Time t1 = new Time(0,0,0);
        Time t2 = new Time(0, 0, 0);
        Time total = t1.Sum(t2);

        System.out.println("Total Time Is : " + total);
	}
}
	
