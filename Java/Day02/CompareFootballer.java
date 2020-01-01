import java.util.Comparator;
public class CompareFootballer implements Comparator<Footballer> {
    public int compare(Footballer arg0, Footballer arg1) {
        if(arg0.getGoal() > arg1.getGoal())
            return 1;
        else if (arg0.getGoal() < arg1.getGoal())
            return -1;
        else return 0;
    }
}