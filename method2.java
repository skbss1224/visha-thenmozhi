package visha_theanmozhi;

class visha{
	public void learning() {
		System.out.println("now visha learning java");
	}
	public void creating() {
		System.out.println("now visha creating a new project");
	}
}

class thenmozhi extends visha {
	public void listening() {
		System.out.println("now thenmozhi listening java class");
	}
	public void big() {
		System.out.println("now thenmozhi creating big project");
	}
}
class sasi extends thenmozhi {
	public void java(){
		System.out.println("now sasi explaned java class");
	}
}

public class method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sasi hello=new sasi();
		hello.java();
		hello.big();
		hello.creating();
		hello.learning();
		hello.listening();
	}

}
