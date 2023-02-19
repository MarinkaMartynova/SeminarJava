/**
 * Написать метод который приводит сторку к нормальному виду строка на вход 
 * Добрый день Как дела Все хорошо
 * выход
 * Добрый день. Как дела. Все хорошо.
 */
public class homeworkByLesson2 {
    public static void main(String[] args) {
        String input = "   Добрый   день Как    дела Все хорошо   ";
        System.out.println("Входящий запрос:" + input);
        //System.out.println("Ставим точки: " + addDots(input));           
        String input2 = addDots(input);
        //System.out.println("Точка в конце строки:" + addPeriod(input2));
        String input3 = addPeriod(input2);
        //System.out.println("удаление точки в начале строки:" + removePeriodAtBeginning(input3));
        String input4 = removePeriodAtBeginning(input3);
        //System.out.println("удаление пробелов в строке:" + removeExtraSpaces(input4));
        String input5 = removeExtraSpaces(input4);
        System.out.println("Удаление пробелов перед точками строки:" + removeSpaceBeforePeriod(input5));

        
    } 
        
    public static String addDots(String input) {
        StringBuilder output = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) {
                output.append(". ").append(c);
            } else {
                output.append(c);
            }
            
        }
        return output.toString();

    }
    public static String addPeriod(String input2) {
        return input2.trim() + ".";
    }

    public static String removePeriodAtBeginning(String input3) {
        return input3.replaceFirst("^\\.", " ");
    }
    
    public static String removeExtraSpaces(String input4) {
        return input4.replaceAll("\\s+", " ").trim();
                
    }
    
    public static String removeSpaceBeforePeriod(String input5) {
        return input5.replaceAll("\\s+\\.", ".");
    }    
    
}





