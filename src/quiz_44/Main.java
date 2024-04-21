package quiz_44;

public class Main {

	public static void main(String[] args) {
		Test t = new Test();
		t.fun(10);
		t.fun(2, 2);
		t.fun('S');

		Test t1 = new Base();
		t1.fun(20);

		Test t2 = new Derived();
		t2.fun(50);

	}

}
//Test t;
//t= new Test();
//t.fun(10);
//t.fun(2 , 2);
//t.fun('S');
//
//t = new Base();
//t.fun(20);
//
//
//t = new Derived();
//t.fun(50);Test t;
//t= new Test();
//t.fun(10);
//t.fun(2 , 2);
//t.fun('S');
//
//t = new Base();
//t.fun(20);
//
//
//t = new Derived();
//t.fun(50);




