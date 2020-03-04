package com.training.abstractfactory;

public abstract class Robot {
	RobotAssembler assembler;
	private String modelType;
	private String sexType;
	
	private Model model;
	private Sex sex;
	private Chipset chipset;
	private ThreeLaws threeLaws;
	private Status status;
	
	public RobotAssembler getAssembler() {
		return assembler;
	}
	public void setAssembler(RobotAssembler assembler) {
		this.assembler = assembler;
	}
	public Model getModel() {
		return model;
	}
	public void setModel(Model model) {
		this.model = model;
	}
	public Sex getSex() {
		return sex;
	}
	public void setSex(Sex sex) {
		this.sex = sex;
	}
	public Chipset getChipset() {
		return chipset;
	}
	public void setChipset(Chipset chipset) {
		this.chipset = chipset;
	}
	public ThreeLaws getThreeLaws() {
		return threeLaws;
	}
	public void setThreeLaws(ThreeLaws threeLaws) {
		this.threeLaws = threeLaws;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
	public String getModelType() {
		return modelType;
	}
	public void setModelType(String modelType) {
		this.modelType = modelType;
	}
	public String getSexType() {
		return sexType;
	}
	public void setSexType(String sexType) {
		this.sexType = sexType;
	}
	public  void assemble() {
		this.chipset = assembler.createChipSet(this.sexType);
		this.sex = assembler.createSex(this.sexType);
		this.model = assembler.assignModel(this.modelType);
		this.threeLaws = assembler.programLaws();
	}
	/**
	 * 
	 */
    public boolean testChipset() {
    	boolean ok = false;
    	String kernel="";
    	if(chipset!=null)
    	 kernel = chipset.getData().substring(chipset.getData().indexOf("KERNEL-"), chipset.getData().length());
    	ok = kernel.contains("1");
    	return ok;
    }
	public boolean testThreeLaws() {
		boolean ok = false;
		if(this.threeLaws.getData().length == assembler.programLaws().getData().length) {
			int hints = 0;
			for(String bl:assembler.programLaws().getData()) {
				for(String rl:threeLaws.getData()) {
					if(rl.equalsIgnoreCase(bl)) {
						hints++;
						if(hints==3) {
							ok = true;
							break;
						}
					
						}
				}
			}
		}
		return ok;
	}
	
	public void prepareForDelivery() {
		System.out.println("Packaging ROBOT: " + model.getData() + " SEX:" + sex.getData() +" for delivery");
		
	}
	
}
