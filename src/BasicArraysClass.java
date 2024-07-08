public class BasicArraysClass {

    static void tooString(int[] intlist) {
        System.out.print("[");
        for (int elements : intlist) {
            System.out.print(elements + ",");
        }
        System.out.print("\b]");// \b ile son virgülü sildik
    }

    //tooString() metot için overloading yaptık
    static void tooString(String[] strlist) {
        System.out.print("[");
        for (String elements : strlist) {
            System.out.print(elements + ",");
        }
        System.out.print("\b]");// \b ile son virgülü sildik
    }

    static void filll(int[] intList, int fromIndex, int toIndex, int value) {
        if (fromIndex < 0 || toIndex > intList.length - 1 || fromIndex > toIndex) {
            System.out.println("Hatalı giriş");
        } else {
            for (int i = fromIndex; i <= toIndex; i++) {
                intList[i] = value;
            }
        }
    }
    //filll() metot için overloading yaptık

    static void filll(int[] intList, int value) {
        for (int i = 0; i < intList.length; i++) {
            intList[i] = value;
        }
    }


    static int[] soort(int[] intList) {
        int[] regularForm = intList;
        for (int i = 0; i < intList.length-1; i++) {
            for (int j = i+1; j < intList.length; j++) {


            }
        }
        return regularForm;
    }
}
