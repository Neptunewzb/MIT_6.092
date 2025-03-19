class Baby {
  String name;
  boolean isMale;
  double weight = 5.0;
  double decibels;
  int numPoops = 0; 
  Baby[] siblings = new Baby[0]; // Initialize the siblings array

  Baby(String myname, boolean malebaby){
    name = myname;
    isMale = malebaby;
  }

  void sayHi(){
    System.out.println("Hi, my name is " + name);
  }
  
  void poop() {
    numPoops += 1;
    System.out.println("Dear mother, "+ "I have pooped. Ready the diaper.");
  }

  void eat(double foodWeight) {
    if (foodWeight >= 0 && foodWeight < weight) {
      weight = weight + foodWeight;
    }
  }
  
  public static void main (String[] arguments){
  Baby shiloh = new Baby("Shiloh Jolie-Pitt", true);
  Baby knox = new Baby("Knox Jolie-Pitt", true);
  
  shiloh.sayHi();
  shiloh.eat(1);
  
  // You might also want to establish the sibling relationship
  Baby[] shilohs_siblings = {knox};
  shiloh.siblings = shilohs_siblings;
  
  Baby[] knoxs_siblings = {shiloh};
  knox.siblings = knoxs_siblings;
  }
}
