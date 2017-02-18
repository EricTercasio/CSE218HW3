package p1;

/**
 * Created by Eric on 2/18/2017.
 */
public class Demo {
    public static void main(String[] args){
        GenericBag genericBag = new GenericBag(20);
        genericBag.add("Hello");
        genericBag.add(25);
        genericBag.add(2.3);
        genericBag.add(false);

        genericBag.display();

        genericBag.find("Hello");
        genericBag.find(22);

        genericBag.remove("Hello");

        genericBag.display();
    }
}
