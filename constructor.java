

class Akshit {

    Akshit(int i) {

        System.out.println("hello"+i);
    }

}



class Mand extends Akshit {
    
    Mand() {
        super(60);
    
        System.out.println("MAND CALLED");
}

}

class constructor {
    public static void main(String[] args) {
        
    
    

        Mand m1 = new Mand();
       Akshit a1 = new Akshit(67);
    }
  }




