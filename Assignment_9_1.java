package assignment_9_1;
		import java.util.*; 
		//This Assignment helped me to master the concepts of HashMap and its use.
		 

		public class Assignment_9_1         //Class declaration containing main function. 
		{
			public static void main(String[] args)        //main function declaration. and because it is static, program execution starts from main function.
			{
				HashMap<Integer,String> employeeDetails = new HashMap<Integer,String>();
				        //Creating HashMap to store the Employee details to store Integer as a code and String as a name.
				
				//Details of first Employee.
				Integer keyCode=new Integer(1);       //Creating first key or employee code.
				String valueName="Lumjing";          //Creating String to map with the key.
				employeeDetails.put(keyCode, valueName);       //Putting the key and String is mapped to it in HashMap using put function.
				
				//Details of second Employee.
		        keyCode=new Integer(2);       //Creating second key or employee code.
			    valueName="Santosh";          //Creating String to map with the key.
			    employeeDetails.put(keyCode, valueName);       //Putting the key and String is mapped to it in HashMap using put function.
			    
			  //Details of third Employee.
		        keyCode=new Integer(3);       //Creating third key or employee code.
			    valueName="Baskar";          //Creating String to map with the key.
			    employeeDetails.put(keyCode, valueName);       //Putting the key and String is mapped to it in HashMap using put function.
			    
			  //Details of fourth Employee.
		        keyCode=new Integer(4);       //Creating fourth key or employee code.
			    valueName="Madhav";          //Creating String to map with the key.
			    employeeDetails.put(keyCode, valueName);       //Putting the key and String is mapped to it in HashMap using put function.
			    
			  //Details of fifth Employee.
		        keyCode=new Integer(5);       //Creating fifth key or employee code.
			    valueName="Shyam";          //Creating String to map with the key.
			    employeeDetails.put(keyCode, valueName);       //Putting the key and String is mapped to it in HashMap using put function.
			    
			    //Details of 5 Employees are added in HashMap.
			    
			    Iterator listReader=employeeDetails.keySet().iterator();
			              //Iterator of type Integer and getting keySet() to iterate through the list.
			    
			    while(listReader.hasNext())        //While loop to iterate through the loop.
			    {
			    	Integer codeEncrypt = (Integer) listReader.next();      //Getting the key for the specific value.
			    	
			    	System.out.println("Employee ID is "+codeEncrypt.toString()+" and Name of Employee is "+employeeDetails.get(codeEncrypt));
			    	                 //Printing Statement.
			    }
			    
			}    //End of main function.

		}    //End of class.

	
