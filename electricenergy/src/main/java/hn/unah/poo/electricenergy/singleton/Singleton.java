package hn.unah.poo.electricenergy.singleton;

public class Singleton {
private static Singleton uniqueInstance;

private Singleton(){

}
public static Singleton getIntance(){
    if(uniqueInstance == null){
        uniqueInstance = new Singleton();
    }
    return uniqueInstance;

}
}
