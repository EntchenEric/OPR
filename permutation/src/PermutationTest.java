public class PermutationTest {
    public static void main(String[] args) {
        //#1
        Permutation p = new Permutation(10);

        //#2
        System.out.println(p.asText());

        //#3
        boolean result = p.generateNext();
        System.out.println(result);

        //#4
        System.out.println(p.asText());

        //#5
        for (int i = 0; i < 362_878; i++) {
            p.generateNext();
        }

        //#6
        System.out.println(p.asText());

        //#7
        result = p.generateNext();
        System.out.println(result);

        //#8
        System.out.println(p.asText());

        //#9
        for (int i = 0; i < 3_265_918; i++) {
            p.generateNext();
        }

        //#10
        System.out.println(p.asText());

        //#11
        result = p.generateNext();
        System.out.println(result);

        //#12
        System.out.println(p.asText());

        //#13
        result = p.generateNext();
        System.out.println(result);

        //#14
        System.out.println(p.asText());
    }
}
