
// class first {
//      static int mynum[]= {1,3,5,6,7};
//         static int i=0;

//     public static int myMethod(){

//         for (int i = 0; i <= 4; i++) {

//             System.out.println(mynum[i]);

//         }
//             return mynum[i];
//         }
//     public static void main(String args[]) {

//          myMethod();

//         }

//     }




class first {
    public static void main(String args[]) {
         int mynum[] = { 1, 3, 5, 6, 7 };
         myMethod(mynum);
    
    }
 
    public static void myMethod(int[] num) {

        for (int i = 0; i <= 4; i++) {

            System.out.println(num[i]);

        }
    }


}
