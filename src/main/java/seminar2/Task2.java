package seminar2;

import java.util.Arrays;

/*
Это какой-то бессмысленный код
9‑й элемент массива все время делится на 0, массив не определен, я не совсем понимаю, что именно нужно здесь исправить,
и какой нужно получить результат?

Можно добавить проверку на деление на 0, и добавить инициализацию массива перед блоком try-catch,
но от деления на 0 мы не уйдём, также можно сделать проверку на NullPointerException,
но я все равно не понимаю - код бессмысленный из-за d = 0.
Проще тогда уж заменить его на throw new ArithmeticException()

правда double тип поддерживает бесконечность получающуюся при делении на 0
тогда этот код будет возвращать либо NaN, либо +-Infinity, либо NullPointerException

исправил так, как я это понял
* */
public class Task2 {
    public static void main(String[] args) {

//        Integer[] intArray = null;
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, null, 10};

        try {
            int d = 0;
            double catchedRes1 = (double) intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);

        } catch (NullPointerException e) {
            System.out.println("У вас NullPointerException: " + e + "\n>>> " + Arrays.toString(e.getStackTrace()));
        }
    }
}
