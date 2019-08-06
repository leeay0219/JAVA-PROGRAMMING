package exam05;

import exam05.CheckBox.OnSelectListener;

public class CheckBoxExample {

	public static void main(String[] args) {
		CheckBox checkBox = new CheckBox();
		checkBox.setOnSelectListener(new OnSelectListener() {
			@Override
			public void onSelect() {
				System.out.println("change bg"); 
			}
		}
		);
		checkBox.select();	
	}
}
