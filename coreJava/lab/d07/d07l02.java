import java.util.*;
import javax.swing.*;
import java.awt.BorderLayout;


class DateTimeApp extends JFrame{

	Thread th;
	Date d = new Date();
	JLabel timeLabel = new JLabel();
	
	public DateTimeApp(){

		this.setTitle("Date & Time Application");
		timeLabel.setHorizontalAlignment(JLabel.CENTER);
		timeLabel.setText(d.toString());

		this.add(timeLabel,BorderLayout.CENTER);
		th = new Thread(new dateTimeThread());
		th.start();
	}

	public static void main(String args[]){

		DateTimeApp app = new DateTimeApp();
		app.setBounds(50,50,600,400);
		app.setVisible(true);
	
	}

	class dateTimeThread implements Runnable{

		public void run(){

			while(true){
				d = new Date();
				timeLabel.setText(d.toString());
				try{
					Thread.sleep(1000);	
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
	
		}

	}


}