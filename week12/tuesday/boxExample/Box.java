import java.util.ArrayList;

public class Box {
    private ArrayList<Object> mystuff = new ArrayList<>();

    public ArrayList<Object> getMystuff() {
        return mystuff;
    }

    public void setMystuff(ArrayList<Object> mystuff) {
        this.mystuff = mystuff;
    }

    public void addStuff(Object something) {
        mystuff.add(something);
    }

    @Override
    public String toString() {
        String o = "The stuff inside this box: ";
        for (int i = 0; i < mystuff.size(); i++) {
            o += mystuff.get(i) + " ";
        }
        return o;
    }
}
