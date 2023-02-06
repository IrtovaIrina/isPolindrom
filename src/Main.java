public class Main {
    public static void main(String[] args){
        String text = "Я с уколов - еле волокуся";
        String textFromLettersAndNumbers = "";
        String reverseTextFromLettersAndNumbers = "";
        for (char ch : text.toLowerCase().toCharArray()){
            if (Character.isLetterOrDigit(ch)){
                textFromLettersAndNumbers += ch;
                reverseTextFromLettersAndNumbers = reverseTextFromLettersAndNumbers + ch;
            }
        }
        System.out.println(reverseTextFromLettersAndNumbers.equals(textFromLettersAndNumbers));
    }
}