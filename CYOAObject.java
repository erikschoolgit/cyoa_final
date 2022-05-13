
public class CYOAObject {
	private String name;
	
	public CYOAObject(String name) {
		this.name = name;
		// System.out.println(name);
	}
	
	public String one_starting() {
		return "Your name is "+name+" and while on the way to your job you have seemed to stumble into the middle of an alleyway which is totally unknown to you.\nThe brick buildings on your right and left tower over you in an oppressing manner with their windows smashed and unlit from the inside, leading you to wonder what could even possibly lie within.\nThe dumpsters nearby reek of uneaten beef and used jeans, and display an unpleasant green color from the metal plating that makes them up.\n\nYou can either choose to go back the way you come, or proceed forwards down the rest of the alleyway, hoping for an exit. What do you do?";
	}
	
	public String one_headback() {
		return "You decide to walk back the way whence you came, and nothing bad happens to you. You manage to get to work on time as normal.\nGOOD ENDING";
	}

	public String one_headforward() {
		// TODO Auto-generated method stub
		return "You delve deeper into the alleyway, anxiously pacing forward.\nWith each step you can feel your pacing echo more and more as the buildings get taller and close on in.\nSuddenly, you spot something moving behind you and you turn around to spot an alley cat which has deemed you in its territory.\nIt seems to be just about ready to pounce and you and probably rip your face off, probably.\nYou can either fight it, run away, or try to negotiate a peace treaty.\nWhat do you do?";
	}
	
	public String not_really() {
		return "That's not an option, input again:";
	}

	public String two_fight() {
		return "You raise your fists up and assume a sparring pose, ready to punch the stray into oblivion if it ever decided to lunge at you.\nUnfortunately for you your hands are not very durable when it comes to claws and the cat upon attacking easily overpowers you and sends you to your deathbed.\nYOU DIED!";
	}

	public String two_peace() {
		return "You try to get the cat to agree to a peace treaty, but it seems to be asking hard terms of you now that it is in an advantageous position in this conflict.\nA heavy sum of tuna cans you’ll have to pay, and also the deed to your house. Where would you even be able to live? You can’t accept these terms!\nYou’ll have to either fight or run away instead; what do you want to do?";
	}

	public String two_run() {
		return "You decide to hide away from the cat.\nWhat worth is there exactly in trying to fight that little feral thing, when it could easily claw your skin off?\nYou turn around and head deeper into the alleyway as the cat begins to hiss and chase after you.\nYour footsteps echo through the alley as your feet beat themselves on the ground.\nYou manage to keep a distance for a while until you run into an inconvenient dead end.\nThe cat has cornered you and is about to attack!\nDo you decide to block high, center, or low? CHOOSE WISELY.";
	}

	public String three_low() {
		return "You guard the lower half of your body by tensing your legs.\nUnfortunately for you, you probably should have been guarding your face instead, as the cat leaps high and begins to claw your face.\nThis attack causes you to stumble back into a sewer drain, where you and the cat get isolated on wooden planks on the water.\nSuddenly, as you regain your composure, you realize a ring of city sewer crocodiles seems to be surrounding you and the cat.\nNow this is a tricky situation!\nYou two will need to work together in order to get out of this one.\nDo you decide to claw at the crocodiles, escape up the sewer hatch, or paddle the board away?";
	}
	
	public String three_center() {
		return "You decide to block your stomach, where the cat proceeds to lunge at.\nIt grabs and begins to claw at your arms, causing you to whip them around.\nThis motion causes the kitty to get flung at the wall, pacifying it and making it run away.\nYou managed to defeat the cat and exit the alleyway safely!\nYou made it to work with only scratches on your arms and a story to tell…\nGOOD ENDING";
	}
	
	public String three_high() {
		return "You decide to try and cover your face.\nUnfortunately for you the cat aims for your legs, causing you to trip backwards and slam your head on the wall behind you, causing you to fall unconscious.\nSomehow, you were never seen again, due to the fact nobody in the entire city walks down that alleyway, like ever.\nYOU DIED!";
	}

	public String two_peace_secret() {
		return "You do remember that you couldn't do that, right? Try another option (fight it) or (run away.)";
	}

	public String two_peace_secret2() {
		return "You think you're funny by doing this, "+name+"? Well, you are not. Try another option.";
	}

	public String two_peace_secret3() {
		return "Suddenly, upon you trying to negotiate a peace treaty with a cat again for the umpteenth time, (when told repeateadly that you couldn't,) reality collapses, purging both you and the kitty into the darkness for the rest of eternity.\nBAD ENDING";
	}

	public String one_headside() {
		return "That wasn't exactly a way you could head, as you walk straight smack into a hard brick wall, leading you to get a concussion and die. YOU DIED!";
	}
	
	public String four_claw() {
		return "You get the cat to try and claw at the crocodiles surrounding you in the murky waters.\nUnfortunately this provokes them and it does not end up going very well for you\n(you get drug into the water filled with you-know-what! Ewww! Not to mention you are swallowed whole…)\nYOU DIED!";
	}
	
	public String four_sewer() {
		return "You stand on the cat and reach your hand for the sewer drain, missing and tripping over, sending you and the cat careening off the side of the raft and into the stomachs of the various sewer crocodiles.\nHow unfortunate, and clumsy!\nYOU DIED!";
	}
	
	public String four_paddle() {
		return "You and the cat begin to slowly paddle the board away from the crocodiles with your hands.\nLuckily for you, it seems that the crocodiles may have not really registered you were there in the first place, and they let you through.\nYou and the cat climb out of the sewers via a rusty maintenance ladder and you become the bestest of friends after this whole incident.\nGOOD ENDING";
	}
}
