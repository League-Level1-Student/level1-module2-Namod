package _04_tea_maker;

import _04_tea_maker.Kettle.Water;

public class TeaMakerRunner {
public static void main(String[] args) {
   TeaBag t = new TeaBag("Green");
   t.getFlavor();
   Cup c = new Cup();
   Kettle k = new Kettle();
   Water x =k.getWater();
   k.boil();
  
   if(x.isHot()==true) {
	   c.makeTea(t, x);
   }
	
	
	
	
}
}
