package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addName = new JButton();
	JButton viewNames = new JButton();
	ArrayList<String> list = new ArrayList<String>();

	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

	public void initialize() {
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

		addName.setText("Add Name");
		addName.addActionListener(this);
		viewNames.setText("View Names");
		viewNames.addActionListener(this);

		panel.add(addName);
		panel.add(viewNames);
		frame.add(panel);
		frame.pack();
	}

	public static void main(String[] args) {
		GuestBook asdf = new GuestBook();
		asdf.initialize();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == addName) {
			System.out.println("Adding Name...");
			String input = JOptionPane.showInputDialog("Who would you like to add to the guest list?");
			list.add(input);
			System.out.println(list.remove(2));
		} else {
			System.out.println("Viewing Names...");
			for(int i = 0; i < list.size() ; i++) {
				System.out.println("Guest #" + (i+1) + ": " + list.get(i));
			}
			
		}
	}
}
