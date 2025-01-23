public class SalaryCalculator {
    
    public double finalSalary (int daysSkipped, int productsSold) {
        double totalSalary = getBonusAmount(productsSold) + getSalaryAmount(daysSkipped);
        return totalSalary > 2000 ? 2000 : totalSalary;
    }
    
    private double getBonusAmount (int productsSold) {
        return bonusForProductsSold(productsSold);
    }
    
    private double getSalaryAmount (int daysSkipped) {
        return 1000 * salaryMultiplier(daysSkipped);
    }
    
    public double bonusForProductsSold (int productsSold) {
        return bonusMultiplier(productsSold) * productsSold;
    }
    
    public double salaryMultiplier (int daysSkipped) {
        return daysSkipped >= 5 ? 0.85 : 1;
    }
    
    public int bonusMultiplier (int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }
}
