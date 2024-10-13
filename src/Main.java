import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        char[] alphabet = {
                'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й',
                'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф',
                'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я'
        };

        System.out.println("Введите текст: ");
        String inputText = myObj.nextLine();

        StringBuilder output = new StringBuilder();
        StringBuilder outputIndex = new StringBuilder();

        for (char ch : inputText.toCharArray()) {
            output.append(ch);
            if (ch != ' ') {
                output.append("  ");
            }

            for (int j = 0; j < alphabet.length; j++) {
                if (alphabet[j] == Character.toUpperCase(ch)) {
                    outputIndex.append(j+1);
                    break;
                }

            }
            outputIndex.append(' ');
        }

        System.out.println(output);
        System.out.println(outputIndex);
    }
}