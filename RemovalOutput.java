package JUNIT.test;

public class RemovalOutput {
	String remove(String input){
		String output = input;
		int length = input.length();
		if(length>=2) {
			if(input.charAt(0) == 'A' && input.charAt(1) == 'A')
				output = output.substring(2);
			else if(input.charAt(0) == 'A' && input.charAt(1) != 'A')
				output = output.substring(1);
			else if(input.charAt(0) != 'A' && input.charAt(1) == 'A')
				output = output.substring(0,1) + output.substring(2);
		}
		else if(length == 1) {
			output = input.charAt(0) == 'A' ? "" : output; 
		}
		return output;
		
	}
}
