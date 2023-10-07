import java.io.FileNotFoundException;

public class EnneagramDriver {
    public static void main(String[] args) throws FileNotFoundException {
        int [] temp;
        Enneagram fall2023 = new Enneagram("src/RHETI_Data.csv");
//        Enneagram fall2023 = new Enneagram("RHETI_Data.csv");
        fall2023.processResults();
        System.out.println(fall2023.printResults(0, 2));
        System.out.println("Count traits\n"+fall2023.countTraits(2, 2));
        System.out.println("Personality type\n"+fall2023.personalityTypes(0, 2));
        System.out.println(fall2023.printResults(0, 2));
        System.out.println("Count Class");
        temp = fall2023.countClass(0, 2);
        for(int i = 1; i < temp.length; i++) {
            System.out.println(i + ": " + temp[i]);
        }
        System.out.println("Most common trait\n"+fall2023.mostCommonType(0, 15));

    }
}
