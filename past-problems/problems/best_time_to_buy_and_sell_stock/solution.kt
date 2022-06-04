class Solution {
    fun maxProfit(prices: IntArray): Int {
        var max = 0
        var profit = 0
        var min = Integer.MAX_VALUE
        for (i in 0 until prices.size-1) {
            if(prices[i] < min){
                min = prices[i]
            }
            profit = prices[i+1] - min
            max = Math.max(profit,max)
        }
        return max
    }
}