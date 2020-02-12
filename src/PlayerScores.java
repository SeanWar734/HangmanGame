		
		public class PlayerScores {
		    public static void main(String args[])
		        throws InterruptedException {
	            
		    	//clearScreen();
		    	
		    	
		    	for (int i=0; i < 40; ++i) {
			    	System.out.println("                                                                                                    ");

		    	}

	            
		        String importantInfo[] = {
		            "                         * * * * * * * * * * * * * THE BEST PLAYERS! * * * * * * * * * * * * *",
		            "                           RANK           NAME                                     WIN/LOSS",
		            "                           ------------   --------------------------------------   --------",
		            " ",
		            " ",
		            " ",
		            " ",
		            " ",
		            " ",
		            " ",
		            " ",
		            " ",
		            " ",
		            " ",
		            " ",
		            " ",
		            " ",
		            " ",
		            " ",
		            " ",
		            " ",
		            " ",
		            " ",
		            " ",

		        };

		        for (int i = 0; i < importantInfo.length; i++) {
		            //Pause for 4 seconds
		            Thread.sleep(300);
		            //Print a message
		            System.out.println(importantInfo[i]);
		        }
	
		
		
		
	}
			public static void clearScreen() {  
				for (int i = 0; i < 50; ++i) System.out.println();
			} 
		    
}
