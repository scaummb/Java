package com.interfaceTest;
import java.util.ArrayList;
interface Stuff{}
//��ʯ
interface Ore extends Stuff{}
//����
interface Weapon extends Stuff{}
//����
interface Rubbish extends Stuff{}
//���
class Gold implements Ore{
	public String toString(){
		return "Gold";
	}
}
//ͭ��
class Copper implements Ore{
	public String toString(){
		return "Copper";
	}
}
//ǹ
class Gun implements Weapon{
	public String toString(){
		return "Gun";
	}
}
//��
class Grenade implements Weapon{
	public String toString(){
		return "Grenade";
	}
}
//ʯͷ
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
