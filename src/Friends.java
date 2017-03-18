public class Friends {


	public static void main(String[] args){
    	//3. Create an instance of Classmate for each person in your class.
   	 	Classmate student = new Classmate();
    	//4. set descriptions for each Classmate
   	 	student.setDescription("Funny");
   	 //5. Use your getter to print out each description
   	 	System.out.println(student.getDescription());
   	 
	}





}
class Classmate{
	String description;
    
	//1. create a setter that sets a description for this person
	public  void setDescription(String newDescription) {
		description = newDescription;	
	}
	//2. create a getter that gets a description of this person
	public String getDescription() {
		return description;
	}

}



