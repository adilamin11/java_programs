class trackobjects {
    public static int count;

    public trackobjects() {
        count++;
    }
}

public class slip14q1 {

    public static void main(String args[]) {
        trackobjects obj1 = new trackobjects();
        trackobjects obj2 = new trackobjects();
        trackobjects obj3 = new trackobjects();
        System.out.println("total no of objects " + trackobjects.count);
    }

}
