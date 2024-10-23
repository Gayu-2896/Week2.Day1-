package week2.day3;

public class Elements extends Button {

	public static void main(String[] args) {
		
		Elements obj = new Elements();
		obj.click();
		obj.setText("Hii");
		obj.submit();
	
		TextField TF = new TextField();
		TF.getText();
		
		RadioButton RB = new RadioButton();
		RB.selectRadioButton();
		
		CheckBoxButton CB = new CheckBoxButton();
		CB.clickCheckButton();
	}

}
