class Main {
  public static void main(String[] args) {
    int mod;
    for (int x = 102; x >= 66; x = x-1){
      mod = x % 2;
      if (mod == 1){
        System.out.println("Value of x : " + x );
        System.out.println("\n");
      }
    }
  }
}