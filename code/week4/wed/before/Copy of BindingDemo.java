//1. DoubleProperty is an interface, SimpleDoubleProperty
//2. x d1.bind(d2)
//3. unbinding
//4. re-bind d2.bind(d1)
//5. Review Property objects
//6. Demo binding/unbinding
//7. Dicuss uni-directional and bi-directional binding
//8. goto NodeStyleRotateDemo.java

package week4.tue;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

import java.sql.SQLOutput;


public class BindingDemo {
    public static void main(String[] args) {
        SimpleDoubleProperty d1 = new SimpleDoubleProperty(1);
        SimpleDoubleProperty d2 = new SimpleDoubleProperty(2);
        d1.bind(d2);
        SimpleDoubleProperty d3 = new SimpleDoubleProperty(3);
        d1.bind(d3);
        //d1.setValue(15);
        System.out.println("d1 is " + d1.getValue()
                + " and d2 is " + d2.getValue());
        d2.setValue(70.2);
        System.out.println("d1 is " + d1.getValue()
                + " and d2 is " + d2.getValue());

        d1.bind(d2.divide(2));

        System.out.println("d1 is " + d1.getValue()
                + " and d2 is " + d2.getValue());

        d2.bindBidirectional(d1);


        System.out.println("d1 is " + d1.getValue()
                + " and d2 is " + d2.getValue());

        //LEAVE AT FIRST d1.unbind();
        //d2.bind(d1);
        //d1.setValue(100.5);
        //System.out.println("d1 is " + d1.getValue()
        //        + " and d2 is " + d2.getValue());


    }
}
