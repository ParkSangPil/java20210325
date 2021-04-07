package p06.lecture.p3constructor;

public class Computer {
	String model;
	int memory;
	String cpu;
	int ssd;
	
	Computer(String medel,int memory,String cpu,int ssd){
		this.model = model;
		this.memory = memory;
		this.cpu = cpu;
		this.ssd = ssd;
	}
	
	Computer(String medel,int memory,String cpu){
		this.model = model;
		this.memory = memory;
		this.cpu = cpu;
		this.ssd = 128;
	}
	
	Computer(String medel,int memory){
		this.model = model;
		this.memory = memory;
		this.cpu = "intel";
		this.ssd = 16;
	}
	
	Computer(String medel){
		this.model = model;
		this.memory = 4;
		this.cpu = "intel";
		this.ssd = 128;
	}
	
	// 생성자의 이름으로 구별할 순 없어서 파라미터로 구분해야 하는데
	//String으로 똑같아서 못함
	/*
	Computer(String cpu){
		this.model = "hp";
		this.memory = 4;
		this.ssd = 128;
	}
	*/
	// 이것도 마찬가지로 ㅠㅠ
	/*
	Computer(String cpu,int ssd){

	}
	*/
	// 얜 가능!
	Computer(int memory,String model){
		
	}
}
