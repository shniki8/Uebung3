public class H3_main {
public static void main(String[] args) {
    int max = 5;
    int fix = 2;
    int wartend = 2;
    boolean istVoll;
    if (fix >= max) {
        istVoll = true;
    }
    else{
        istVoll = false;
    }


    while (!istVoll) {
        if(wartend == 0){
            break;}
        fix++;
        wartend--;
        if (fix >= max) {
        istVoll = true;
        break;
    }
      }  
    
    System.out.println("fix "+fix +" istVoll? " + istVoll + "Wartend: " + wartend);
}
}
