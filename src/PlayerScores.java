import java.util.HashMap;
import java.util.Map;

public class PlayerScores {
		    public static void main(String args[])
		        throws InterruptedException {
	            
		    	//clearScreen();
		    	
		    	
		    	for (int i=0; i < 40; ++i) {
			    	System.out.println(" ");
		    	}

		    	Player p = new Player("Jill");
		    	p.setWins(5);
		    	p.setLosses(2);
		    	
		    	
		    	Player o = new Player("Sean");
		    	o.setWins(4);
		    	o.setLosses(3);
		    	
		    	
		    	Player n = new Player("Bill");
		    	n.setWins(2);
		    	n.setLosses(4);
		    	
		    	Map<Integer, Player> players = new HashMap<>();
		    	players.put(players.size() + 1,p);
		    	Methods.addMap(players, p);
		    	
		    	players.put(players.size() + 1,o);
		    	Methods.addMap(players, o);
		    	
		    	players.put(players.size() + 1,n);
		    	Methods.addMap(players, n);
		    	
		    			
		    	
		    	
		    	
		    	for (int i=0; i < 2; ++i) {
		    		System.out.println("%d%s%s%s", i+1,, arr[1], arr[2]);
		    	}
		    			
		    	
		    	
	            
		        String importantInfo[] = {
		            "                         * * * * * * * * * * * * * THE BEST PLAYERS! * * * * * * * * * * * * *",
		            " ",
		            "                           RANK           NAME                                     WIN/LOSS",
		            "                           ------------   --------------------------------------   --------",
		            "                            001            Jill                                     50 / 0",
		            "                            002            Sean                                     43 / 2",
		            "                            003            Bill                                     41 / 6",


		            
		            
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
