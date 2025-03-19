class Hello2 {
  public static void main(String[] arguments) {
    System.out.println("Hello World.");
    System.out.println("Line: number 2");
  }
}

class Hello {
  public static void main(String[] arguments) {
    System.out.println("Hello World");
  }
}

class Hello3{
  public static void main(String[] arguments){
    String foo = "IAP 6.092";
    System.out.println(foo);
    foo = "Something else";
    System.out.println(foo);
  }
}

class DoMath {
  public static void main(String[] arguments) {
  double score = 1.0 + 2.0 * 3.0;
  System.out.println(score);
  score = score / 2.0;
  System.out.println(score);
  }
}

class DoMAth2{
  public static void main(String[] arguments){
    double score = 1.0 + 2.0 * 3.0;
    System.out.println(score);
    double copy = score ;
    copy = copy / 2.0;
    System.out.println(copy);
    System.out.println(score);
  }
}