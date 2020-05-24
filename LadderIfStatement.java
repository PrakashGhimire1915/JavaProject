public class LadderIfStatement {
public static void main(String[] args) {
	
// 	String gamer=pcgamer, mobilegamer;

// 		if(gamer==pcgamer){
// 			System.out.println("You are a PC Gamer.");
// 		}

// 		else if(gamer==mobilegamer){
// 			System.out.println("You are a Mobile Gamer.");
// 		}
// 		else {
// 			System.out.println("You are a both Player.");
// 		}
// 	}
// }

	int marks = 65;
        
        if( marks > 75 )      
        {
            System.out.println("Distinction");
        }
        else if( marks > 60 ) 
        {
            System.out.println("First Class"); 
        }
        else if( marks > 50 ) 
        {
            System.out.println("Second Class"); 
        }
        else
        {
            System.out.println("Fail");  
        }
    
    }
}