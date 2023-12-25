public class Ternary {
    public static void main(String[] args) {
        /*
        * عملگر ternary operation جاوا تنها عملگر شرطی است که سه عملوند می گیرد.
        * این یک جایگزین یک خطی برای عبارت if-then-else است و در برنامه نویسی جاوا بسیار استفاده می شود.
        * می توانیم از عملگر سه تایی به جای شرایط if-else استفاده کنیم.
        *  اگرچه عملگر شرطی از همان الگوریتم دستور if-else پیروی می کند،
        *اما عملگر شرطی فضای کمتری می گیرد و کمک می کند تا دستورات if-else را به کوتاه ترین شکل ممکن بنویسید.*/

        int n1 = 5;
        int n2 = 10;
        int max;

        System.out.println("First num: " + n1);
        System.out.println("Second num: " + n2);

        max = (n1 > n2) ? n1 : n2;

        System.out.println("Maximum is = " + max);
    }
}
