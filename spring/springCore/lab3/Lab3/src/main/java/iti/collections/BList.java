package iti.collections;

import java.util.List;

public class BList {

    private List<Integer> numbers;

    public BList() {
    }

    public BList(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }
    
}
