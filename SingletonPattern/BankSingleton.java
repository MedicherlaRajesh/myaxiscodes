package SingletonPattern;

public class BankSingleton {
    private static BankSingleton bankSing = new BankSingleton();
    
    

private BankSingleton(){

}
static BankSingleton getObject(){
    return bankSing;
}
public void checkStatus(int time){
    if(time>9 && time<18){
        System.out.println("Bank is open");
    }else{
        System.out.println("Bank is closed");
    }
}
public static void main(String[] args){
    BankSingleton obj = BankSingleton.getObject();
    obj.checkStatus(12);

}

}
