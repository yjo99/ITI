import java.util.*;
import javax.swing.*;
import java.awt.BorderLayout;


class DateTimeApp1 extends JFrame{

	Thread th;
	Date d = new Date();
	JLabel timeLabel = new JLabel();
	
	public DateTimeApp1(){

		this.setTitle("Date & Time Application Animations");
		timeLabel.setHorizontalAlignment(JLabel.CENTER);
		timeLabel.setText(d.toString());

		this.add(timeLabel,BorderLayout.CENTER);
		th = new Thread(new dateTimeThread1());
		th.start();
	}

	public static void main(String args[]){

		DateTimeApp1 app = new DateTimeApp1();
		app.setBounds(50,50,600,400);
		app.setVisible(true);
	
	}

	class dateTimeThread1 implements Runnable{

		public void run(){

			while(true){
				d = new Date();
				timeLabel.setText(d.toString());
				int x = 0;
				int y = 0;
				int maxX = 300;
				int maxY = 400;
				boolean inscr = true;
				while(true){
					if(inscr){
						timeLabel.setLocation(x,y);
						x += 10;
					} else {
						timeLabel.setLocation(x,y);
						x -=10;
					}
					if(x < maxX){
						inscr = true;
						
					}else {inscr = false; x = (-400);}
					try{
						Thread.sleep(100);	
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				}
				
			}
	
		}

	}


}