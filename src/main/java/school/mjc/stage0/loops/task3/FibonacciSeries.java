package school.mjc.stage0.loops.task3;

public class FibonacciSeries {

    public void printFibonacci(int lastFibonacci) {
        for (int i = 0; i<lastFibonacci; i++){
            if (i == 0){
                System.out.println(0);
            }else if (i == 1 || i ==2){
                System.out.println(1);
            }else {
                System.out.println(i - 1);
            }
        }
    }
}
