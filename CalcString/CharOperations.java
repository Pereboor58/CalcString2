package CalcString;

import static CalcString.Printer.printInQuotes;

public class CharOperations {
    public void checkAction(String exp) throws Exception {

        char action;
        String[] data;
        if (exp.contains("\"")) {
        if (exp.contains(" + ")) {
            data = exp.split(" \\+ ");
            action = '+';
        } else if (exp.contains(" - ")) {
            data = exp.split(" - ");
            action = '-';
        } else if (exp.contains(" * ")) {
            data = exp.split(" \\* ");
            action = '*';
        } else if (exp.contains(" / ")) {
            data = exp.split(" / ");
            action = '/';
        }else{
            throw new Exception("Некорректный знак действия");
        }
        if (action == '*' || action == '/') {
            if (data[1].contains("\"")) throw new Exception("Строчку можно делить или умножать только на число");
        }
        for (int i = 0; i < data.length; i++) {
            data[i] = data[i].replace("\"", "");
        } if (data[0].length()>10){
           throw new Exception("Слишком много символов в строке 1");
       } if (data[1].length()>10){
            throw new Exception("Слишком много символов в строке 2");
        }
        if (action == '+') {
            printInQuotes(data[0] + data[1]);
        } else if (action == '*') {
            int sign = Integer.parseInt(data[1]);
            String result = "";
            for (int i = 0; i < sign; i++) {
                result+= data[0];
            }
            printInQuotes(result);
        } else if (action == '-') {
            int index = data[0].indexOf(data[1]);
            if(index == -1){
                printInQuotes(data[0]);
            }else{
                String result = data[0].substring(0, index);
                result+= data[0].substring(index+ data[1].length());
                printInQuotes(result);
            }
        }else{
            int newLen = data[0].length()/Integer.parseInt(data[1]);
            String result = data[0].substring(0,newLen);
            printInQuotes(result);
        }
    } else {
            throw new Exception("Строчки пишутся только в кавычках!");
        }
    }
}
