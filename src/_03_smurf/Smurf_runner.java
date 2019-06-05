package _03_smurf;

public class Smurf_runner {
	public static void main(String[] args) {
		Smurf handy_smurf = new Smurf("Handy");
		handy_smurf.eat();
		System.out.println(handy_smurf.getName());
		Smurf papa_smurf = new Smurf("Papa");
		System.out.println(papa_smurf.getName());
		System.out.println(papa_smurf.getHatColor());
		System.out.println(papa_smurf.isGirlOrBoy());
		Smurf smurfette = new Smurf("Smurfette");
		System.out.println(smurfette.getName());
		System.out.println(smurfette.getHatColor());
		System.out.println(smurfette.isGirlOrBoy());
	}

}
