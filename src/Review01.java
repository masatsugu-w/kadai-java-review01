
public class Review01 {

    public static void main(String[] args) {
        int price = 100;  //商品価格
        int tax = 10;  //消費税率%
        int salesTax = getSalesTax(price, tax);  //消費税
        int incTax = price + salesTax;  //税込価格
       
        System.out.print(price + "円の");
        System.out.print("商品の税込価格は" + incTax + "円");
        System.out.print("(消費税は" + salesTax + "円)です。");
    }

    public static int getSalesTax(int price, int tax){
        int result = price * tax / 100;
        return result;
        
    }
}
