 
// TextAdventureTwoPointO.java


// Written by: Mason Z.
// Modified Date: June 8th, 2023
// Alternate version of the TextAdventure

import java.util.Scanner;
import java.util.Random;

public class TextAdventureTwoPointO {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//Introduction
		int gameLoop = 1; 
		
		while (gameLoop < 2) {
		String Introduction;
		System.out.println("Welcome to Escape. In this game, you are an undercover spy captured by the enemy. Your job is to escape from the enemy alive.");
		System.out.println("Do you wish to proceed? Y/N");
		Introduction = s.next();
		
		if (Introduction.equals("Y")) {
			//Setup
			String Name;
			System.out.println("Please pick a name for yourself");
			Name = s.next();
			
			
			
			//Story Intro
			//Story Intro Variables
			String Action1;
		
		
			System.out.println("You find yourself in a dark room. You've been captured by the enemy after being revealed as an undercover agent.");
			System.out.println("You now await for the perfect moment to escape...");
			System.out.println("You hear a knock, the guard walks in with a metal tray with food");
			System.out.println("A - Do nothing | B - Grabs food and eats | C - grab the metal food plate and smash it into his head ");
			Action1 = s.next();
			
			//First Action
			
			//A - END
			if (Action1.equals("A")) {
				System.out.println("You do nothing. Eventually, you are tortured for information and executed. Mission Failed.");
			}
			
			
			//B - See the piece of paper
			else if (Action1.equals("B")) {
				String Action2;
				
				System.out.println("You grab the food plate and eat. He walks out. You then notice a piece of white paper in your food");
				System.out.println("Agent [REDACTED] - First Floor, Red Door. Extraction will be awaiting you there. We will wait for as long as you need. Destroy this note after you understand what you need to do. Stay safe, stay alive. Good Luck " + Name +".");
				System.out.println("You then rip the message into small pieces and discreetly discarding them through the toilet. You wait until the guards to leave for their lunch break. Luckily, you hear loud construction sounds that might mask the sound of the c4 exploding.");
				System.out.println("A - Set the c4 on the door | B - Set the c4 on the wall");
				Action2 = s.next();
				
				if(Action2.equals("B")) {
					System.out.println("You activate the c4, exploding the wall next to you. Unluckily, the next room is another similarly looking cell. You try to use the rest of the c4 to blow open the door, but it wasn't enough. In the process, you also raised the suspicions of the guards, who after the 2nd explosion rushed to check on you. - Mission Failed. ");
				}
				
				else if (Action2.equals("A")) {
					String Action3;
					
					System.out.println("It works. The door falls to the ground. You then bolt out of the door. At the end of the hallway, you run into construction worker. They don't seem to be aware of who you are, so you quickly say a greeting before turning left. You walk down the hallway into a stairwell. Below, you notice two armed enemy agents on their lunch break. ");
					System.out.println("A - Use the c4 and throw it as a grenade | B - use the c4 as distraction");
					Action3 = s.next();
					
					if (Action3.equals("A")) {
						System.out.println("The c4 explodes, knocking the two agents to the ground. Since it was not designed to be used as a actual grenade, it also backfires and knocks you out. - Mission Failed.");
					}
					
					else if (Action3.equals("B")) {
						String Action4;
						
						System.out.println("The distraction works, they drop there food. You quickly hide in one of the rooms as the run past you. You then walk down the stairs. You also notice among their lunches is their keys. You take it and unlock the doors and run down another set of hallways and stairs. ");
						System.out.println("A - Turn Right to a Black Door | B - Turn Left to Red Door");
						Action4 = s.next();
						
						if (Action4.equals("A")) {
							System.out.println("You see a motorcycle and some cars. None of the keys you stole seem to work on the cars, but you were able to take the motorcycle. You then get out. However, an hour after your escape, they catch up to you. You then notice the tracker in the motorcycle. But it was too late. You try to speed up but eventually, you run out of gas. Mission Failed.");
						}
						
						else if (Action4.equals("B")) {
							//Randomizer - Randomizer Code is from Educative.io 
							Random rand = new Random(); 
							int int_random = rand.nextInt(100); 
							float float_random=rand.nextFloat();
							
							System.out.println("You open a red door, then you see it, a white van. The window opens, and you see a familiar face. He says: Hey Agent " + Name + "! Haven't seen you for " + int_random + " days. Nice to see you safe. Let's get you out of here. Hop in! - Mission Successful");
						}
					}
				}
				
			}  
			
			
			//C - Grab the plate
			else if (Action1.equals("C")) {
				String Action2;
				
				System.out.println("You grabs the plate, spilling all of its contents. You then hit the guard hard in the head. He falls to the ground with a large thud.");
				System.out.println("A - Take the guards uniform and wears it, hides the body under your bed, and walks out the door | B - Bolts out the door");
				Action2 = s.next();
				
				if (Action2.equals("B")) {
					System.out.println("You bolt out the door. You run down the hallway when in the corner of your eye, you spot it, a old security camera. Suddenly, the alert is sounded and two men comes out from the shadows, ambushing you - Mission Failed");
				}
				
				else if (Action2.equals("A")) {
					String Action3;
					
					System.out.println("You slowly walk out the door. Even though you have escape the cell, you must maintain secrecy. Then, you spot it, an old security camera.");
					System.out.println("Luckily, the guards was given caps that now you can use to your advantage. you lowered the cap over your face, hiding your identity..for now");
					System.out.println("You take a left turn. You find an open door to  a room full of weapons. You take a silenced pistol, a rifle, knife, extra ammo, and you put on protective gear on top the uniform.");
					System.out.println("You then walk down the hallway to a stairwell, you then see at the end two armed agents at the bottom. They don't see you.");
					System.out.println("A - Stealth, use the silenced gun to take them out | B - Surprise Attack, use the rifle to catch them off guard before they can return fire");
					Action3 = s.next();
					
					if (Action3.equals("B")) {
						String Action4;
						System.out.println("They drop to the ground dead. However, soon after, the alarm is sounded.");
						System.out.println("A - Bolt down the stairwell | B - Go back up the stairwell and down the hallway");
						Action4 = s.next();
						
						if (Action4.equals("A")) {
							System.out.println("You reach the stairwell, but the doors are LOCKED. You begin to panic. Soon, the enemies reach you. You try to fight back, successfully eliminating 4 more until you get wounded and captured. - Mission Failed.");
						}
						
						if (Action4.equals("B")) {
							System.out.println("You meet enemy agents at the turn. You try to fire but was shot in the head. - Mission Failed.");
						}
					}
					
					if (Action3.equals("A")) {
						String Action5;
						System.out.println("They drop to the ground dead. No one was alerted. You then slowly walk down the stairs while scanning for more enemies. You take the enemy agents keys.");
						System.out.println("You proceed to unlock the door and walk down another set of stairs to meet another hallway.");
						System.out.println("A - Turn Right to a Black Door | B - Turn Left to a Red Door");
						Action5 = s.next();
						
						if (Action5.equals("B")) {
							//Randomizer - Randomizer Code is from Educative.io 
							Random rand = new Random(); 
							int int_random = rand.nextInt(100); 
							float float_random=rand.nextFloat();
							
							System.out.println("You open a red door, then you see it, a white van. The window opens, and you see a familiar face. He says: Hey Agent " + Name + "! Haven't seen you for " + int_random + " days. Nice to see you safe. Let's get you out of here. Hop in! - Mission Successful");
						}
						else if (Action5.equals("A")) {
							System.out.println("You see a motorcycle and some cars. You decide not to steal any to not waste any time. You then bolt out into the forest for better coverage and hiding spots. Eventually, you get lost in the forest - To be continued? ");
						}
					}
				}
			}
			
			
			
	
			
			
		}
		
		//Game Not Started/Error
		else if (Introduction.equals("N")) {
			System.out.println("Game OVER");
			gameLoop = 3;
		}
		else {
			System.out.println("ERROR, Please enter either Y or N - Restart the client in order to begin the game");
		}
		
	

	}
}
}
