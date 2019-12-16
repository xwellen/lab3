import java.util.Arrays;
import java.util.Objects;

public class Garden {
    private Plants[] plants;
    private boolean messed;

    public Garden(Plants[] plants) {
        messed = false;
        this.plants = plants;
    }

    public void messGarden(Double time){
        messed = true;
        System.out.println(this + " перепутали за "+ time + "мин.");
    }


    public void isMessed() {
        if (messed){
            System.out.println("на " + this + "не понятно что растет.");
        }
        else {
            System.out.print("на " + this + "вполне понятно что растет:");
            for (int i = 0; i < plants.length; i++) {
                System.out.print(plants[i] + ", ");
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        String vegetables = "";
        for (int i = 0; i < plants.length; i++) {
            vegetables+=plants[i]+" ";
        }
        return "Garden with " +vegetables;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        else return false;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(messed);
        result = 31 * result + Arrays.hashCode(plants);
        return result;
    }
}
