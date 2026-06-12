package generics_06.pair;

public class PairRunner {
    static void main() {
        Pair<String, Integer> SIpair = new Pair<>("12", 123);
        Pair<String, String> SSpair = new Pair<>("13", "342");
        Pair<Integer, Double> SDpair = new Pair<>(12, 34.5);

        SIpair.print();
        SSpair.print();
        SDpair.print();
    }
}
