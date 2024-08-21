public class Main {
  public static void main(String[] args) {

    Friends luis = new Luis();
    Friends darren = new Darren();
    Friends rj = new Rj();
    
    // abstract method 
    luis.sayName();
    darren.sayName();
    rj.sayName();

    // regular methods 
    luis.eat();
    darren.eat();
    rj.eat();

    luis.study();
    darren.study();
    rj.study();

    luis.play();
    darren.play();
    rj.play();
    }
}
