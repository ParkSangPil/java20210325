package p06.lecture.p9encapsulation;

public class MyClass1 {
	private String str;
	private int memory;
	private boolean on;
	private String model;
	private int ssd;
//	한번에 하려면 여기까지 작성하고 Source 랑 gennerator getters and...
	// 하셈 ㅋ
	
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public boolean isOn() {
		return on;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSsd() {
		return ssd;
	}
	public void setSsd(int ssd) {
		this.ssd = ssd;
	}
	
}
