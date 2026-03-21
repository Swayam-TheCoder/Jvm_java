package leetcode;

public class q_121 {

    public int maxProfit(int[] prices) {
        int largest = prices[0];
        int smallest = prices[0];
        int profit = 0;
        for(int i=0; i<prices.length; i++){
            if(prices[i] > largest){
                largest = prices[i];
            }
            if(prices[i] < smallest){
                smallest = prices[i];
            }
        }
        profit = largest - smallest;
        return profit;
    }

    public static void main(String[] args) {
        q_121 qu = new q_121();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(qu.maxProfit(prices));
    }
}
