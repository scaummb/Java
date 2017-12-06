package PrepareTest.test11_QueueTest;

public class Command {
	private String string;
	//Construction
	public Command(){}
	public Command(String string){
		this.string = string;
	}
	//Set/Get
	public String getString() {
		return string;
	}
	public void setString(String string) {
		this.string = string;
	}
	//operation
	public void operation (){
		System.out.println("insert finished: "+string);
	}
}
