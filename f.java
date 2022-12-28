inport java.util.Scaner;
class Student
{        
     String USN,Name,Branch,Phone;
     Scanner input = new Scanner(system.in);
     void read()
	{
		System.out.println("Enter The Student Details");
		System.out.println("Enter USN");
		USN=input.nextLine();
  		System.out.println("Enter The Name");
		Name=input.nextLine();
		System.out.println("Enter your Branch");
		Branch=input.nextLine();
		System.out.println("Enter The Phone Num");
		Phone=input.nextLine();

	}
  	void display()
	{
		System.out.printf("%-20s%-20s%-20s%-20s",USN,Name,Branch,Phone);
	}
}
class studentdetails
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(system.in);
		System.out.println("Enter The Number of Student Details To Be Created:);
		int number=input.nextInt();
		Student s=new Student[number];
		for(int i=0; i<number; i++)
		{	
			s[i]=new Student();
			s[i].read();
		}

		//display student information 
		System.out.printf("%-20s%-20s%-20s%-20s","USN","Name","Branch","Phone");
		for(int i=0;i<number; i++)
		 {
			System.out.println();
			s[i].display();
      	 }
    input.close();
	}

}
