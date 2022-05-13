import java.util.*;

public class CYOADriver {

	public static void main(String[] args) {
		// ctrl + space syso
		
		System.out.println("Hi");
		
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		
		System.out.print("Input your name NOW: ");
		String name = scan.next();
		
		CYOAObject story = new CYOAObject(name);
		
		boolean con = true;
		boolean lloop = true;
		String choice;
		
		while (con == true) {
			System.out.println(story.one_starting());
			choice = scan2.nextLine();
			lloop=true;
			
			// CHOICE 1 LOOP
			while (lloop) {
				// System.out.println("debug: "+choice); 
				
				if (choice.equalsIgnoreCase("head back")) {
					System.out.println(story.one_headback());
					lloop=false;
				} else if (choice.equalsIgnoreCase("head sideways")) {
					System.out.println(story.one_headside());
					lloop=false;
				} else if (choice.equalsIgnoreCase("head forward")) {
					
					System.out.println(story.one_headforward());
					choice = scan2.nextLine();
					// CHOICE 2 LOOP
					int peaceChosen = 0;
					while (lloop) {
						
						if (choice.equalsIgnoreCase("peace treaty")) {
							// logic for repeating typing in "peace treaty" over and over again
							if (peaceChosen==0) {
								peaceChosen=1;
								System.out.println(story.two_peace());
								choice = scan2.nextLine();
							} else if (peaceChosen==1) {
								peaceChosen=2;
								System.out.println(story.two_peace_secret());
								choice = scan2.nextLine();
							} else if (peaceChosen==2) {
								peaceChosen=3;
								System.out.println(story.two_peace_secret2());
								choice = scan2.nextLine();
							} else if (peaceChosen==3) {
								System.out.println(story.two_peace_secret3());
								lloop=false;
							}
						} else if (choice.equalsIgnoreCase("fight it")||choice.equalsIgnoreCase("fight")) {
							System.out.println(story.two_fight());
							lloop=false;
						} else if (choice.equalsIgnoreCase("run away")) {
							
							System.out.println(story.two_run());
							choice = scan2.nextLine();
							// CHOICE 3 LOOP
							while (lloop) {
								if (choice.equalsIgnoreCase("block low")) {
									System.out.println(story.three_low());
									choice = scan2.nextLine();
									while (lloop) {
										if (choice.equalsIgnoreCase("claw at crocodiles")||choice.equalsIgnoreCase("claw at the crocodiles")||choice.equalsIgnoreCase("claw")) {
											System.out.println(story.four_claw());
											lloop=false;
										} else if (choice.equalsIgnoreCase("escape")||choice.equalsIgnoreCase("escape up hatch")||choice.equalsIgnoreCase("escape up the sewer hatch")) {
											System.out.println(story.four_sewer());
											lloop=false;
										} else if (choice.equalsIgnoreCase("paddle away")) {
											System.out.println(story.four_paddle());
											// GOOD ENDING
											lloop=false;
										} else {
											System.out.println(story.not_really());
											choice = scan2.nextLine();
										}
									}
								} else if (choice.equalsIgnoreCase("block center")) {
									System.out.println(story.three_center());
									// GOOD ENDING
									lloop=false;
								} else if (choice.equalsIgnoreCase("block high")) {
									System.out.println(story.three_high());
									lloop=false;
								} else {
									System.out.println(story.not_really());
									choice = scan2.nextLine();
								}
							}
							
						} else {
							System.out.println(story.not_really());
							choice = scan2.nextLine();
						}
						
					}
					
				} else {
					System.out.println(story.not_really());
					choice = scan2.nextLine();
				}
				
			}
			
			System.out.println("Restart? Input r to restart: ");
			choice = scan.next();
			if (!choice.equalsIgnoreCase("r")) {
				con = false;
			}
		}
		System.out.println("Bye bye!");
		
		scan.close();
		scan2.close();
	}

}
