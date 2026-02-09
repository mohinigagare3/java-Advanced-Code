import javax.swing.*;

public class Practical5 {
	JFrame F;
	JPanel P;
	JLabel lblGender;
	JLabel lblDocs;
	// JRadioButton rbMale, rbFemale, rbOthers;
	ButtonGroup bg;
	JCheckBox chkAadhar, chkPan, chkLC, chkTC;

	public Practical5() {
		F = new JFrame();
		P = new JPanel();
		bg = new ButtonGroup();

		lblGender = new JLabel("Select the Gender :");
		JRadioButton rbMale = new JRadioButton("Male");
		JRadioButton rbFemale = new JRadioButton("Female");
		JRadioButton rbOthers = new JRadioButton("Others");

		lblDocs = new JLabel("Select the Documents :");
		chkAadhar = new JCheckBox("Aadhar");
		chkPan = new JCheckBox("Pan");
		chkLC = new JCheckBox("L.C");
		chkTC = new JCheckBox("T.C");

		F.setSize(300, 300);
		F.setLocation(100, 100);
		F.setTitle("GUI Demo");
		F.setVisible(true);

		P.setLayout(null);
		F.add(P);

		lblGender.setBounds(20, 20, 150, 30);
		P.add(lblGender);

		rbMale.setBounds(20, 60, 60, 30);
		P.add(rbMale);
		rbFemale.setBounds(90, 60, 80, 30);
		P.add(rbFemale);
		rbOthers.setBounds(180, 60, 100, 30);
		P.add(rbOthers);

		bg.add(rbMale);
		bg.add(rbFemale);
		bg.add(rbOthers);

		lblDocs.setBounds(20, 110, 150, 30);
		P.add(lblDocs);

		chkAadhar.setBounds(20, 150, 100, 30);
		P.add(chkAadhar);
		chkPan.setBounds(130, 150, 100, 30);
		P.add(chkPan);
		chkLC.setBounds(20, 190, 100, 30);
		P.add(chkLC);
		chkTC.setBounds(130, 190, 100, 30);
		P.add(chkTC);
	}

	public static void main(String args[]) {
		new Practical5();
	}
}