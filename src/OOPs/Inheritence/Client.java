package OOPs.Inheritence;

public class Client {
    static void main() {
        P obj= new P();
        IO.println(obj.d);
        IO.println(obj.d1);
        obj.fun();
        obj.fun1();
        //case 1
        C object= new C();
        object.fun();
        object.fun1();

        //case 2
        P object1 =new C();
        IO.println(object1.d);
        IO.println(object1.d1);
        IO.println(object1.d2);

    }
}
