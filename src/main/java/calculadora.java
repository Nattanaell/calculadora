import java.util.Scanner;

class calculadora{

  private int num1;
  private int num2;
  private int total;
  Scanner ler = new Scanner(System.in);
  //método de menu
  


  
//metodo de soma 
public void soma(){

Scanner n1 = new Scanner(System.in);
calculadora calc = new calculadora();

int total;
  
  System.out.println("calculadora de soma\n\nInsira o numero: ");
  calc.setnum1(n1.nextInt());
  System.out.println("Insira o 2° numero; ");
  calc.setnum2(n1.nextInt());
  total = calc.getnum1() + calc.getnum2();
System.out.println("A soma dos valores é: " + total );
}

public int getnum1(){
  return num1;
  
}
public void setnum1(int num1){
  this.num1 = num1;

}
public int getnum2(){
  return num2;
  
}
public void setnum2(int num2){
  this.num2 = num2;

}
public int gettotal(){
  return total;
  
}
}
