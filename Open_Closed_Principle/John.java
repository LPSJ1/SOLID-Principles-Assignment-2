package Open_Closed_Principle;

// John entity
public class John implements ocp {

    static int height;
    static int weight;

    public double CalculateBMI() {

        return (double) John.height /John.weight;
    }
}
