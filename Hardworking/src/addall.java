import java.util.ArrayList;

public class addall {

	public static void main(String[] args) 
	{
		ArrayList l1=new ArrayList();
        l1.add(10);
        l1.add(10);
        l1.add(30);
        l1.add(40);
        System.out.println(l1);
        ArrayList l2=new ArrayList();
        l2.add('a');
        l2.add('b');
        l2.add('c');
        System.out.println(l2);
        l1.addAll(l2);
        System.out.println(l1);
		// TODO Auto-generated method stub

	}

}
