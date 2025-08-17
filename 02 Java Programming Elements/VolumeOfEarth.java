public class VolumeOfEarth {
    public static void main(String[] args){
		int radius = 6378;
		double pi = 3.14;
		double volume = (4/3)*pi*(radius^3);
		double Volume_in_cubic_miles = volume * 0.239913;
		System.out.println("The volume of earth in cubic kilometers is " + volume + " and cubic miles is " + Volume_in_cubic_miles);
		}
}

