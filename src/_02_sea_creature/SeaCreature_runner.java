package _02_sea_creature;

public class SeaCreature_runner {
	public static void main(String[] args) {
		SeaCreature spongebob = new SeaCreature("spongebob");
		System.out.println(spongebob.getName());
		spongebob.eat();
		spongebob.laugh();
		SeaCreature patrick = new SeaCreature("patrick");
		System.out.println(patrick.getName());
		patrick.eat();
		patrick.laugh();
		SeaCreature squidward = new SeaCreature("squidward");
		System.out.println(squidward.getName());
		squidward.eat();
		squidward.laugh();
	}
}
