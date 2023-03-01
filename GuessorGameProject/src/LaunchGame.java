import java.util.*;

class Guessor{
	int guessnum;
	Scanner scan=new Scanner(System.in);
	int guessing()
	{
		guessnum=scan.nextInt();
		return guessnum;	
	}	
}

class Players{
	
	int guessnumplayer;
	Scanner scan=new Scanner(System.in);
	int guessing()
	{
		guessnumplayer=scan.nextInt();
		return guessnumplayer;	
	}
	
}

class Umpire{
	
	int nofromguessor;
	int nofromplayer1;
	int nofromplayer2;
	int nofromplayer3;
	
	Scanner scan=new Scanner(System.in);
	void collectfromguessor()
	{
		//Guesser guessing the number//
		Guessor g=new Guessor();
		System.out.println("Hey guessor kindly guess the number between 1 to 100 only");
		nofromguessor=g.guessing();
		while(nofromguessor>100 || nofromguessor<1)
		{
			System.out.println("You have guessed a invalid number , kindly guess again");
			nofromguessor=g.guessing();
		}
		System.out.println("Wohoooo!!! You have guessed valid number");
	}
	
	void collectfromallplayer()
	{
		Players p1=new Players();
		Players p2=new Players();
		Players p3=new Players();
		
		//Player1 guessing the number//
		System.out.println("Hey player 1 guess the number");
		nofromplayer1=p1.guessing();
		while(nofromplayer1>100 || nofromplayer1<1)
		{
			System.out.println("You have guessed a invalid number, kindly guess again");
			nofromplayer1=p1.guessing();
		}
		System.out.println("Player 1 have guessed valid number...continue");
		
		//Player2 guessing the number//
		System.out.println("Hey player 2 guess the number");
		nofromplayer2=p2.guessing();
		while(nofromplayer2>100 || nofromplayer2<1)
		{
			System.out.println("You have guessed a invalid number, kindly guess again");
			nofromplayer2=p2.guessing();
		}
		System.out.println("Player 2 have guessed valid number..continue");
		
		//Player3 guessing the number//
		System.out.println("Hey player 3 guess the number");
		nofromplayer3=p3.guessing();
		while(nofromplayer3>100 || nofromplayer3<1)
		{
			System.out.println("You have guessed a invalid number, kindly guess again");
			nofromplayer3=p3.guessing();
		}
		System.out.println("Player 3 have guessed valid number ...Waiting for results now");
	}
	
	void compare()
	{		
		
		
		/// by Hyder Abbas //
//		if(nofromguessor==nofromplayer1)
//		{
//			if(nofromguessor==nofromplayer2 && nofromguessor==nofromplayer3)
//			{
//				System.out.println("Match tied, All players won the game");
//			}
//			else if(nofromguessor==nofromplayer2)
//			{
//				
//				System.out.println("Player 1 and player 2 won the game");
//			}
//			
//			else if(nofromguessor==nofromplayer3)
//			{
//				System.out.println("Player 1 and player 3 won the game");
//			}
//			else
//			{
//				System.out.println("Player1 won the game");
//			}
//			
//		}
//		
//		else if(nofromguessor==nofromplayer2)
//		{
//			if(nofromguessor==nofromplayer3)
//			{
//				System.out.println("Player 2 and player 3 won the game");
//			}
//			
//			else
//			{
//			System.out.println("Player 2 won the game");
//			}
//		}
//		
//		else if(nofromguessor==nofromplayer3)
//		{
//			System.out.println("Player 3 won the game");
//		}
//		else
//		{
//			System.out.println("Game Lost ! Try again");
//		}
//	}		
		
		///By Sanil Shetgaonkar ---Enhancing the Guessor Game Project /////
		Players p1=new Players();
		Players p2=new Players();
		Players p3=new Players();
		Guessor g1=new Guessor();
		int player1num,player2num,player3num,guessornum;
		
		if(nofromguessor==nofromplayer1 && nofromguessor==nofromplayer2 && nofromguessor==nofromplayer3)
		{
			System.out.println("Match tied !! All players won the game ...Please have a ReGame");
			System.out.println("Hey Guessor , please guess the number");
			guessornum=g1.guessing();
			collectfromallplayer();
			compare();
		}
		
		else if(nofromguessor==nofromplayer1 && nofromguessor==nofromplayer2)
		{
			System.out.println("Player 1 and Player 2 entering the secound round");	
			System.out.println("Hey Guessor , we are entering second round, please guess the number");
			guessornum=g1.guessing();
			System.out.println("Hey player1 guess the number");
			player1num=p1.guessing();
			while(player1num>100 || player1num<1)
			{
				System.out.println("You have guessed a invalid number, kindly guess again");
				player1num=p1.guessing();
			}
			
			System.out.println("Hey player2 guess the number");
			player2num=p2.guessing();
			while(player2num>100 || player2num<1)
			{
				System.out.println("You have guessed a invalid number, kindly guess again");
				player2num=p2.guessing();
			}
			
			if(player1num==guessornum)
			{
				System.out.println("WOHOOOOOO PLAYER 1 WON THE FINALS");
			}
			else if(player2num==guessornum)
			{
				System.out.println("WOHOOOOOO PLAYER 2 WON THE FINALS");
			}
			else if(player1num==guessornum && player2num ==guessornum)
			{
				System.out.println(" Match Tied again.. Please have a rematch");
				//////////////////
			}
			
		}
				
		else if(nofromguessor==nofromplayer2 && nofromguessor==nofromplayer3)
		{
			System.out.println("Player 2 and Player 3 entering the secound round");	
			System.out.println("Hey Guessor , we are entering second round, please guess the number");
			guessornum=g1.guessing();
			
			System.out.println("Hey player2 guess the number");
			player2num=p2.guessing();
			while(player2num>100 || player2num<1)
			{
				System.out.println("You have guessed a invalid number, kindly guess again");
				player2num=p2.guessing();
			}
			
			System.out.println("Hey player3 guess the number");
			player3num=p3.guessing();
			while(player3num>100 || player3num<1)
			{
				System.out.println("You have guessed a invalid number, kindly guess again");
				player3num=p3.guessing();
			}
			
			if(player2num==guessornum)
			{
				System.out.println("WOHOOOOOO PLAYER 2 WON THE FINALS");
			}
			else if(player3num==guessornum)
			{
				System.out.println("WOHOOOOOO PLAYER 3 WON THE FINALS");
			}
			else if(player2num==guessornum && player3num ==guessornum)
			{
				System.out.println(" Match Tied again.. Please have a rematch");
				//////////////
			}
			
		}
		
		else if(nofromguessor==nofromplayer1 && nofromguessor==nofromplayer3)
		{
			System.out.println("Player 1 and Player 3 entering the secound round");	
			System.out.println("Hey Guessor , we are entering second round, please guess the number");
			guessornum=g1.guessing();
			
			System.out.println("Hey player1 guess the number");
			player1num=p1.guessing();
			while(player1num>100 || player1num<1)
			{
				System.out.println("You have guessed a invalid number, kindly guess again");
				player1num=p1.guessing();
			}
			
			System.out.println("Hey player3 guess the number");
			player3num=p3.guessing();
			while(player3num>100 || player3num<1)
			{
				System.out.println("You have guessed a invalid number, kindly guess again");
				player3num=p3.guessing();
			}
			
			if(player1num==guessornum)
			{
				System.out.println("WOHOOOOOO PLAYER 1 WON THE FINALS");
			}
			else if(player3num==guessornum)
			{
				System.out.println("WOHOOOOOO PLAYER 3 WON THE FINALS");
			}
			else if(player1num==guessornum && player3num ==guessornum)
			{
				System.out.println(" Match Tied again.. Please have a rematch");
			}
			
		}
				
		else if(nofromguessor==nofromplayer1)
		{
			System.out.println("Player 1 won the match");
		}
		
		else if(nofromguessor==nofromplayer2)
		{
			System.out.println("Player 2 won the match");
		}
		
		else if(nofromguessor==nofromplayer3)
		{
			System.out.println("Player 3 won the match");
		}
		
		else
		{
			boolean flag=false;
			int check;
			System.out.println("ALL Lost the game..Please try again");
			System.out.println("Do you want to continue , press 1 to continue and press 0 to exit the game");
			check=scan.nextInt();
			if(check==1)
			{
				collectfromguessor();
				collectfromallplayer();
				compare();
			}
			
			else
			{
				System.out.println("END OF THE GAME .. Please visit again");
			}
				
		}
		
}}

public class LaunchGame {

	public static void main(String[] args) {
		
		Umpire ump=new Umpire();
		ump.collectfromguessor();
		ump.collectfromallplayer();
		ump.compare();
	}

}
