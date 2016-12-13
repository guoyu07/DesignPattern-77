package io.github.xeyez.designpattern.bridge;

public class StringDisplayImpl implements DisplayImpl {

	private String str;
	private int width;
	
	public StringDisplayImpl(String str) {
		this.str = str;
		this.width = str.getBytes().length;
	}

	@Override
	public void rawOpen() {
		printLine();
	}

	@Override
	public void rawPrint() {
		System.out.println('|' + str + '|');
	}

	@Override
	public void rawClose() {
		printLine();
	}
	
	private void printLine() {
		StringBuilder sb = new StringBuilder();
		sb.append('+');
		for(int i=0 ; i<width ; i++) {
			sb.append('-');
		}
		sb.append('+');
		
		System.out.println(sb);
	}
}