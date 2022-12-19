import java.util.*;
import javax.swing.*;
import java.awt.BorderLayout;


class DateTimeApp2 extends JFrame{

	Thread th;
	JLabel timeLabel = new JLabel();
	
	public DateTimeApp2(){

		this.setTitle("Date & Time Application Animations2");
		timeLabel.setHorizontalAlignment(JLabel.LEFT);
		timeLabel.setText("***");

		this.add(timeLabel,BorderLayout.CENTER);
		th = new Thread(new dateTimeThread2());
		th.start();
	}

	public static void main(String args[]){

		DateTimeApp2 app = new DateTimeApp2();
		app.setBounds(50,50,600,400);
		app.setVisible(true);
	
	}

	class dateTimeThread2 implements Runnable{

		public void run(){

			while(true){
				
				int x = 0;
				int y = 200;
				
					while(true){
					if((x >= 0 && x < 300) && (y>= 200 && y< 400)){
						timeLabel.setLocation(x,y);
						x +=10;
						y +=10;
					} else if((x >= 300 && x <= 600) && (y<= 400 && y>= 200)){
						timeLabel.setLocation(x,y);
						x +=10;
						y -=10;
					}else if((300<=x  && x <= 600) && (y>= 0 && y<= 400)){
						timeLabel.setLocation(x,y);
						x -=10;
						y +=10;
					}else if((0<=x  && x <= 300) && (y>= 0 && y<=200)){
						timeLabel.setLocation(x,y);
						x -=10;
						y -=10;
					}
					
					
											
					try{
						Thread.sleep(100);	
					}catch(InterruptedException e){
						e.printStackTrace();
					}}
				}
				
			
	
		}

	}


}