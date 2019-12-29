package _03_smurf;

public class smurfRunner {
public static void main(String[] args) {
	Smurf x = new Smurf("Handy");
	x.getName();
	x.eat();
	Smurf y = new Smurf("papa");
	Smurf z = new Smurf("smurfette");
	y.getName();
	z.getName();
	y.eat();
	z.eat();
	y.getHatColor();
	z.getHatColor();
	y.isGirlOrBoy();
	z.isGirlOrBoy();

}	
}
