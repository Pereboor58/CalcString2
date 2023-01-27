package CalcString;

public class Printer {
    static void printInQuotes(String text){
       if (text.length()>=40){
           text = text.substring(0, Math.min(text.length(), 40));
           System.out.println("\""+text+"\""+"...");
       } else
            System.out.println("\""+text+"\"");

}
}