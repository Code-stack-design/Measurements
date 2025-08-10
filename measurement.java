import java.util.*;

public class SizeConverterApp {
    static final double INCH_TO_CM = 2.54;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter gender (M/W): ");
        String gender = sc.nextLine().trim().toUpperCase();

        System.out.print("Enter measurement unit (in/cm): ");
        String unit = sc.nextLine().trim().toLowerCase();

        System.out.print("Chest or Bust measurement: ");
        double chest = sc.nextDouble();
        sc.nextLine();
        System.out.print("Waist measurement: ");
        double waist = sc.nextDouble();
        sc.nextLine();

        if (unit.equals("in")) {
            chest *= INCH_TO_CM;
            waist *= INCH_TO_CM;
        }

        System.out.println("\nConverted to centimeters: Chest = " + chest + " cm, Waist = " + waist + " cm\n");

        System.out.println("H&M Size:");
        System.out.println(" Men: " + lookupHMSize(chest));
        System.out.println(" Women: " + lookupHMWomenSize(chest, waist));

        System.out.println("\nZara Size:");
        System.out.println(" Men: " + lookupZaraMenSize(chest));
        System.out.println(" Women: " + lookupZaraWomenSize(chest, waist));
    }

    static String lookupHMSize(double chestCm) {
        if (chestCm < 85) return "XS";
        else if (chestCm < 95) return "S";
        else if (chestCm < 105) return "M";
        else if (chestCm < 115) return "L";
        else return "XL or above";
    }

    static String lookupHMWomenSize(double bustCm, double waistCm) {
        if (bustCm < 90 && waistCm < 70) return "S";
        else if (bustCm < 100 && waistCm < 80) return "M";
        else if (bustCm < 110 && waistCm < 90) return "L";
        else return "XL or above";
    }

    static String lookupZaraMenSize(double chestCm) {
        if (chestCm < 90) return "S";
        else if (chestCm < 98) return "M";
        else if (chestCm < 104) return "L";
        else return "XL or above";
    }

    static String lookupZaraWomenSize(double bustCm, double waistCm) {
        if (bustCm < 86 && waistCm < 66) return "S";
        else if (bustCm < 96 && waistCm < 78) return "M";
        else if (bustCm < 104 && waistCm < 90) return "L";
        else return "XL or above";
    }
}
