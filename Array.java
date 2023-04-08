public class Array {
    public static void main(String[] args) {

        String [] stringArray;
        stringArray = new String[3];

        stringArray[0]= "Septiadi";
        stringArray[1]= "Habib";
        stringArray[2]= "Ganteng";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        String[] stringArray2 = new String[3];

        String[] namaNama = {"Septiadi", "Habib", "Ganteng"};
        int[] arratInt = new int[]{1,2,3,4,5,6,7,8,9,10};
        long[] arrayLong = {
                10L, 20L, 30L
        };

        System.out.println(arrayLong.length);

        String[][] members = {
                {"Septiadi", "Habib"},
                {"Erick", "Prasetya"},
                {"Bambang"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);

    }
}
