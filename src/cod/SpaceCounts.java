package cod;

public class SpaceCounts {
	public static void getSpaceCount(){

		String name= "Velocity training centre pune";

		String str = name.replace(" ","");
		int count = name.length();
		int counts = str.length();
		int totalCountOfSpace = count-counts;
		System.out.println(totalCountOfSpace);
		}

		public static void main (String [] args){

		getSpaceCount();
		}

}
