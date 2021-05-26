package com.jf.mine;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void main() {
        //数组中的逆序列
        int[] array = {1, 2, 3, 4, 5, 6, 7, 0};

        System.out.println(inversePairs(array) + "");
    }

    public int inversePairs(int[] array) {
        int p = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    p += 1;
                }
            }
        }
        return p % 1000000007;
    }
}