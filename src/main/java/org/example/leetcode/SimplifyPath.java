package org.example.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class SimplifyPath {
    public static String simplifyPath(String path) {
        StringTokenizer tokenizer = new StringTokenizer(path, "/");
        Deque<String> deque = new ArrayDeque<>();

        //StringTokenizer vs String[]
        //StringTokenizer: Time O(n) , Space O(1) takes only one string
        //String[]: Time O(n) , Space O(n) array with all strings
        while (tokenizer.hasMoreTokens()) {
            String dir = tokenizer.nextToken();
            if (dir.equals("..")) {
                if (!deque.isEmpty()) deque.pollLast();
            } else if (!dir.isEmpty() && !dir.equals(".")) {
                deque.add(dir);
            }
        }
        if (deque.isEmpty()) return "/";

        //deque.pollFirst() remove elements from deque and reduce memory consumption for next path
        StringBuilder builder = new StringBuilder();
        while (!deque.isEmpty()) {
            builder.append("/").append(deque.pollFirst());
        }

        return builder.toString();
    }
}
