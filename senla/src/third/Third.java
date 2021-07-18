package third;

public class Third {
    public static void vectorsManipulation(Vector v1,Vector v2) {
        System.out.println(v1.getLength());
        System.out.println(v2.getLength());
        System.out.println(v1.mult(v2));
        System.out.println(v2.mult(v1));
    }
}
