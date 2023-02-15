package iti.collections;

import java.util.List;

public class AList extends BList {
    
    private String text;

    public AList(){
        
    }
    public AList(List<Integer> numbers, String text) {
        super(numbers);
        this.text = text;
    }

    public AList(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
