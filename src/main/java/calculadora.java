class calculadora{
  int num1;
  int num2;
  int total;

  public void soma(int n1, int n2){
    System.out.println("Operação sub");
    this.num1 = n1;
    this.num2 = n2;
    total = num1 + num2;
    System.out.println("O total da sub é "+ total);
  }
}
