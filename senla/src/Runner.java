import first.First;
import fiveth.Fiveth;
import fourth.Fourth;
import second.Second;
import seven.Seven;
import six.Six;
import third.Third;
import third.Vector;

public class Runner {

    public static void main(String[] args) {
        First.stringCount();

        Second.sum();

        Vector v1 = new Vector(1, 2, 7, 8);
        Vector v2 = new Vector(1, 2, 3, 8);
        Third.vectorsManipulation(v1, v2);

        Fourth.primeFactors();

        Fiveth f = new Fiveth();
        f.stringManipulation();

        Six.bigFigure();

        Seven s = new Seven();
        s.setMaxValue(8);// 8-max volume safe
    }
}
