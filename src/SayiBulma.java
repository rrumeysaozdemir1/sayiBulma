

public class SayiBulma {
    public static void main(String[] args) {
        int aranacak = 3;
        int[] numbers = new int[] {1,2,3,4,6,8,0};
        boolean varMi= false;



        for(int number : numbers){
            if(number == aranacak){
                varMi=true;
                break;
            }
        }
        if(varMi){
            System.out.println("sayı mevcuttur!");
        }
            else{
                System.out.println("Sayı Mevcut Değildir!");
            }
        }
    }

