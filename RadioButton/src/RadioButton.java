import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

//RadioButton goes into the JFrame
public class RadioButton extends JFrame {

	// RadioButton class contains three buttons
	public RadioButton() {
		JRadioButton Small = new JRadioButton("Small");
		JRadioButton Medium = new JRadioButton("Medium");
		JRadioButton Large = new JRadioButton("Large");

		// Buttons are grouped together and added into the JFrame
		ButtonGroup group = new ButtonGroup();
		group.add(Small);
		group.add(Medium);
		group.add(Large);
		add(Small);
		add(Medium);
		add(Large);

		// Sets small button as default selection
		Small.setSelected(true);

		// Sets size of JFrame
		setLayout(new GridLayout(3, 2));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		pack();
		setLocationRelativeTo(null);
	}

	// Runs on Main class
	public static void main(String[] args) {
		RadioButton rb = new RadioButton();
	}
}
