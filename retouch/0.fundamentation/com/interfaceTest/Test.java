package com.interfaceTest;
import java.util.ArrayList;
interface Stuff{}
//¿óÊ¯
interface Ore extends Stuff{}
//ÎäÆ÷
interface Weapon extends Stuff{}
//À¬»ø
interface Rubbish extends Stuff{}
//½ð¿ó
class Gold implements Ore{
	public String toString(){
		return "Gold";
	}
}
//Í­¿ó
class Copper implements Ore{
	public String toString(){
		return "Copper";
	}
}
//Ç¹
class Gun implements Weapon{
	public String toString(){
		return "Gun";
	}
}
//Áñµ¯
class Grenade implements Weapon{
	public String toString(){
		return "Grenade";
	}
}
//Ê¯Í·
class Stone implements Rubbish{
	public String toString(){
		return "Stone";
	}
}

public class Test {
	public static ArrayList<Stuff> collectStuff(Stuff[] s){
		ArrayList<Stuff> al = new ArrayList<Stuff>();
		for(int i = 0;i < s.length; i++){
			if(! (s[i] instanceof Rubbish))
				//ArrayList.add()
				al.add(s[i]); 
		}
		return al;
	}

	public static void main(String[] args) {
		Stuff[] s = {new Gold(),new Copper(),new Gun(),new Grenade(),new Stone()};
		ArrayList<Stuff> al = collectStuff(s);
		System.out.println("The useful stuff collection are: ");
		for(int i = 0;i < al.size();i++){
			System.out.println(al.get(i));
			System.out.println("*"+al.get(i).getClass());
		}
	}

}
