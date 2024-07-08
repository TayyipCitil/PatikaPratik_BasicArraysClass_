public class Main {
    public static void main(String[] args) {
        //Arrays sınıfına ait toString(),fill(),sort(),binarySearch(),copyOfRange(),eguals()
        // hazır metotları taklit edeceğiz tooString(),filll(),soort(),search(),coopy(),equalss()
        int[] intList1={1,2,3,4,5};
        int[] intList2={1,2,3,4,5};
        int[] intList3={5,5,5,5,5};
        int[] intList4={-2,4,0,3,4,12,45,-3,44,56,-100};
        String[] strList1={"a","b","c","d","e"};
        String[] strList2={"a","b","c","d","e"};
        String[] strList3={"c","e","f","l","m"};


        BasicArraysClass.tooString(intList1);

        System.out.println("\n================");
        BasicArraysClass.filll(intList3,10);
        BasicArraysClass.filll(intList3,1,3,4);
        BasicArraysClass.tooString(intList3);

        System.out.println("\n================");
        BasicArraysClass.tooString(strList1);

        System.out.println("\n================");
        BasicArraysClass.soort(intList4);
        BasicArraysClass.tooString(intList4);


    }

}
