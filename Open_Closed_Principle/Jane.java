package Open_Closed_Principle;

// Jane entity
public class Jane implements ocp {

    static int height;
    static int weight;

    public double CalculateBMI() {

        return Jane.height/Jane.weight;
    }
}
