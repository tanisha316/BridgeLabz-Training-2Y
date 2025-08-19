public class ProfitLoss {
    public static void main(String[] args) {
        double Cp = 129;
        double Sp = 191;
        double profit = Sp - Cp;
        double profit_per = (profit / Cp) * 100;
        System.out.println("The Cost Price is INR " + Cp + " and Selling Price in INR " + Sp+"\n The Profit is INR " + profit + " and the Profit Percentage is " + profit_per);
    }
}
