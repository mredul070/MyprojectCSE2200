import java.sql.Time;

public class Main {
	
public static void dosomething(Animal t ){
		
			if(t instanceof Animal)
			{
				System.out.println("This is a object Animal");
			}
			else {
				System.out.println("This is not a object of Animal");
			}
			
			
	}
public static void variadic(Animal...nanimal)
{
	for(Animal p: nanimal)
	{
		if(p instanceof Birds)
		{
			Birds k=new Birds();
			k.fly();
		}
		if(p instanceof Insects)
		{
			Insects k=new Insects();
			k.valona();
		}
		if(p instanceof Land)
		{
			Land k=new Land();
			k.shukna();
		}
	}
}

	public static void main(String[] args) {
		Birds b=new Birds();
		b.canmove();
		Insects a=new Insects();
		a.canmove();
		Land c=new Land();
		c.canmove();
		Water d=new Water();
		d.canmove();
		Oviparous e=new Oviparous();
		e.canmove();
		Mammal f=new Mammal();
		f.canmove();
		Animal g=new Animal();
		g.canmove(); 
        dosomething(g);
        variadic(a,b,c,d,e,f);
	}

}
