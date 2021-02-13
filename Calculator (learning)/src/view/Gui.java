package view;

import javax.swing.JFrame;

public class Gui extends JFrame {
	
	
	private static final long serialVersionUID = 1L;

	//constructor
	public Gui() {
		
		this.setSize(200, 200);
		this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		//test git
	}
	
	//constructor
		public Gui(String s) {
			
			JFrame f = new JFrame (s);
			f.setSize(200, 200);
			f.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
			f.setVisible(true);
			//bla
		}
		
		//
	
     
}
