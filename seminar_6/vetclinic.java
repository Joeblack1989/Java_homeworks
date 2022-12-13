package seminar_6;

import java.util.HashSet;

public class vetclinic {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        cat cat_1 = new cat("Barsick", 91554239, 3.5);
        cat cat_2 = new cat("Vaska", 91554238, 3.5);
        cat cat_3 = new cat("Marsel", 91554239, 3.5);
        System.out.println(cat_1.equals(cat_2));
        System.out.println(cat_1.equals(cat_3));
        // cat_1.create_note("Первичный прием");
        // cat_1.create_note("Наблюдение");
        // cat_1.print_notes();
        HashSet<cat> all_cats = new HashSet<>();
        all_cats.add(cat_1);
        all_cats.add(cat_2);
        all_cats.add(cat_3);
        System.out.println(all_cats);
        int hash_1 = cat_1.hashCode();
        System.out.println(hash_1);
        // System.out.println(cat_2.hashCode());
        // System.out.println(cat_3.hashCode());
        System.out.println(cat_2.hashCode());
}
}