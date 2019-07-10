package ru.job4j.array;

/**
 * Обертка над строкой.
 *
 * @author Дмитрий Калугин (kdn7777777@gmail.com).
 */
public class ArrayChar {

    /**
     * Проверяет. что слово начинается с префикса.
     * @param prefix префикс.
     * @return true если слово начинаеться с префикса, false если нет.
     */
    public boolean startsWith(String word, String prefix) {
        boolean result = true;
        char[] pref = prefix.toCharArray();
        char[] wrd = word.toCharArray();
        for(int i = 0; i < pref.length; i++) {
            if(pref[i] != wrd[i]) result = false;
        }
        return result;
    }
}
