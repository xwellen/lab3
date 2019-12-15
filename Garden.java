public class Garden {
    private Plants[] plants;

    public Garden(Plants[] plants) {
        this.plants = plants;
    }

    @Override
    public String toString() {
        String vegetables = "";
        for (int i = 0; i < plants.length; i++) {
            vegetables+=plants[i]+" ";
        }
        return "Garden with " +vegetables;
    }
}
