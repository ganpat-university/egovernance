import java.util.Scanner;

import java.io.*;

class EraserThread implements Runnable {
   private boolean stop;
 
   /**
    *@param The prompt displayed to the user
    */
   public EraserThread(String prompt) {
       System.out.print(prompt);
   }

   /**
    * Begin masking...display asterisks (*)
    */
   public void run () {
      stop = true;
      while (stop) {
         System.out.print("\010*");
   try {
      Thread.currentThread().sleep(1);
         } catch(InterruptedException ie) {
            ie.printStackTrace();
         }
      }
   }

   /**
    * Instruct the thread to stop masking
    */
   public void stopMasking() {
      this.stop = false;
   }
}




 class PasswordField {

   /**
    *@param prompt The prompt to display to the user
    *@return The password as entered by the user
    */
   public static String readPassword (String prompt) {
      EraserThread et = new EraserThread(prompt);
      Thread mask = new Thread(et);
      mask.start();

      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      String password = "";

      try {
         password = in.readLine();
      } catch (IOException ioe) {
        ioe.printStackTrace();
      }
      // stop masking
      et.stopMasking();
      // return the password entered by the user
      return password;
   }
}




  class egovernance{
  	String name,rname;
  	int flag=1;
  	String password,rpassword,rp;
  	Scanner sc=new Scanner(System.in);

  	void register()
  	{
  	System.out.println("enter username : ");
  	rname=sc.nextLine();

  //	System.out.println("enter password : ");
      String rpassword = PasswordField.readPassword("Enter password :");
  	//rpassword=sc.nextLine();
     
      rp=rpassword;
  	}
  	
  	void login()
  	{
  		System.out.println("\n\n======Welcome======\n\n");	
  		System.out.println("\tLogin");	
  		System.out.println("enter username : ");
  		name=sc.nextLine();	

      String password = PasswordField.readPassword("Enter password :");
     
  		//password=sc.next();	

  		System.out.println("======================");
  		
  		if (name.equals("harsh") && password.equals("hn1212"))
  		{
  		System.out.println("login successfully");
  		System.out.println("======================");
  		}
		else if(name.equals(rname) && password.equals(rp))
  		{
  		System.out.println("login successfully");
  		System.out.println("======================");
  		}
  		else
  		{
  			System.out.println("login fail");
        
  		System.out.println("======================");
  		flag=0;
  		}
  	}
  	void display()
  	{
  		int i=1,c,exit=0;
  		if (flag==1)
  		 {
  			
  			while(i==1){
  					System.out.println("=========================================================");
  					System.out.println("\n\n\nEnter 1 for motor vehicle act act\n");
  					System.out.println("Enter 2 for Article 370 of the Constitution of India\n");
  					System.out.println("Enter 3 for Union Government notifies Plastic Waste Management Rules 2016\n");
            
            c=sc.nextInt();
  					System.out.println("=========================================================\n\n\n");
  					switch(c)
  					{
  					case 1:
  					System.out.println("================================================================================================================\n");
  					System.out.println("New penalty amounts under Motor Vehicles Amendment Act, 2019 from September 1\n");
  					System.out.println("Violation of road regulations :\tRs 500 to Rs 1,000\n");
  					System.out.println("Traveling without Ticket :\tRs 500 \n");
					  System.out.println("Disobedience of orders of Authority and refusal to share information :\tRs 2000 \n");
					  System.out.println("Unauthorised use of vehicles without license :\t Rs 5,000\n");
					  System.out.println("Driving without license :\t Rs 5,000\n");
					  System.out.println("Driving despite disqualification :\t Rs 10,000\n");
					  System.out.println("Over-speeding :\tRs 1000 - Rs 2000 for light motor vehicle, Rs 2,000 - Rs 4,000 \n\t\tfor medium passenger or goods vehicles and impounding of driving \n\t\tlicense for second/subsequent offence.");
  					System.out.println("\n\n================================================================================================================\n");
  					
  					break;
  					case 2:
  					System.out.println("================================================================================================================\n");
  					System.out.println("Article 370 of the Indian constitution gave special status to Jammu and Kashmir—a state");
  					System.out.println("in India, located in the northern part of the Indian subcontinent, and a part of the ");
  					System.out.println("larger region of Kashmir, which has been the subject of dispute between India, Pakistan,");
					  System.out.println("and China since 1947[1][2]—conferring it with the power to have a separate constitution,");
					  System.out.println("a state flag and autonomy over the internal administration of the state.[3][4] The government ");
					  System.out.println("of India revoked this special status in August 2019 through a Presidential Order and the passage");
					  System.out.println(" of a resolution in Parliament.");
  					System.out.println("\n\n================================================================================================================\n");
  					
  					break;
  					
            case 3:
            System.out.println("================================================================================================================\n");
            System.out.println("\nKey new rules\n");
            System.out.println("Introduction of concept of extended producer responsibility (EPR) and Responsibility\nof waste generators.\n");
            System.out.println("Rural areas have been included and Gram Panchayats have been given more responsibility.\n");
            System.out.println("Banned plastic carry bags thinner than 50 microns. It is mandatory for producers to\n keep record of vendors to whom they supply raw material for manufacturing \n packaging plastics.\n");
            System.out.println("Retailers and street vendor providing will be fined if their products in plastic \npackaging which do not conform to the new rules.\n");
            System.out.println("Individual and bulk waste generators like offices, industries, commercial establishment \n must segregate the plastic waste at source.\n");
            System.out.println("These individual and bulk waste generators should handover the segregate waste and\n pay user fee as per bye-laws of the local bodies.\n");
            System.out.println("Persons organising public events like marriages, public gatherings are responsible\n for the management of waste generated during these events.\n");
            System.out.println("Minimum thickness of the plastic bags increased from 40-50microns. Manufacturing and\n use of non-recyclable multi-layered plastic will be phased out in 2 years.\n");
            System.out.println("\n\n================================================================================================================\n");
            
            break;
            

            default :
			  		System.out.println("you enter  wrong number");
  					break;
  					}
  					System.out.println("enter 1 for continue and enter  11 for logout");
  					exit=sc.nextInt();
  					if (exit==11) {
              
  						break;
  					}
  				}
  		}
  	}
  	
  	public static void main(String[] args) {
  		egovernance eg=new egovernance();
  		Scanner msc=new Scanner(System.in);

  		int c;
  		System.out.println("Enter 1 for Register");
  		System.out.println("Enter 2 for login");
  		c=msc.nextInt();
  		switch(c)
  		{
  		case 1:
  		eg.register();
  		eg.login();
  		eg.display();
  		break;	
  		case 2:
  		eg.login();
  		eg.display();
  		break;
  		default :
  		System.out.println("you enter  wrong number");
  		break;
  		}
  		
  		
  	}
  }