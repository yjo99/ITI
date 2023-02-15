package iti.Autowiring;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// @Data
// @AllArgsConstructor
// @NoArgsConstructor
public class Wire1 {

    private String text;
    private Wire2 w2;
    private Wire2 w2copy;
	public Wire1() {
	}
	public Wire1( Wire2 w2, Wire2 w2copy, String text) {
		this.text = text;
		this.w2 = w2;
		this.w2copy = w2copy;
	}


    public void init(){
        System.out.println("This is init method wire1");
    }

    public void des(){
        System.out.println("This is des method wire1");
    }

	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Wire2 getW2() {
		return w2;
	}
	public void setW2(Wire2 w2) {
		this.w2 = w2;
	}
	public Wire2 getW2copy() {
		return w2copy;
	}
	public void setW2copy(Wire2 w2copy) {
		this.w2copy = w2copy;
	}

    
    
}
