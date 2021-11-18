package com.hz;

import java.util.Arrays;
import java.util.List;

public class Adapter {
    private List<String> rightWords;
    private ConsoleReader reader;

    public Adapter(ConsoleReader reader){
        this.reader = reader;
        String[] trueWords = {"true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"};
        this.rightWords = Arrays.asList(trueWords);
    }

    public Boolean readLineBoolean(){
        String line = this.reader.readLine();
        return rightWords.contains(line);
    }
}
