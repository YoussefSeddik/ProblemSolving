class Solution {
    fun maxProfit(prices: IntArray): Int {
        var maxprofit = 0
        for (i in 1 until prices.size) {
            if (prices[i] > prices[i-1])
                maxprofit += prices[i] - prices[i-1]
        }
        return maxprofit
    }
}