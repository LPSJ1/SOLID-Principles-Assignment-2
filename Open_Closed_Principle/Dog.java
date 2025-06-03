package Open_Closed_Principle;

// Dog entity
public class Dog implements ocp {

    static int height;
    static int weight;

    public double CalculateBMI() {

        return Dog.height/Dog.weight;
    }
}
