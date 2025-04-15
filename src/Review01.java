
public class Review01 {

    public static void main(String[] args) {
        int price = 1500;  //商品価格
        int consumptionTaxRate = 10;  //消費税率%
        int salesTax = tax(price, consumptionTaxRate);  //消費税
        int incTax = price + salesTax;  //税込価格
       
        System.out.print(price + "円の");
        System.out.print("商品の税込価格は" + incTax + "円");
        System.out.print("(消費税は" + salesTax + "円)です。");
    }

    public static int tax(int price, int consumptionTaxRate){
        int result = price * consumptionTaxRate / 100;
        return result;
        
    }
}
