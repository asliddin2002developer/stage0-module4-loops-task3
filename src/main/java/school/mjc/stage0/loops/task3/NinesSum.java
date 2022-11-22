package school.mjc.stage0.loops.task3;

public class NinesSum {

    public void calculateSum(int lengthOfLastNumber) {
        int sum = 9;
        int constNum = 9;
        int cur = 9;
        int multplyBy = 10;
        if (lengthOfLastNumber <= 0){
            sum = 0;
        }
        for (int i = 1; i<lengthOfLastNumber; i++){
            cur = (cur * multplyBy) + constNum;
            sum += cur;

        }
        System.out.println(sum);
    }

}
