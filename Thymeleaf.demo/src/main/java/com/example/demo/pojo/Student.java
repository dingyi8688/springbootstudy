package com.example.demo.pojo;

public class Student {
	   
	    private Integer id;
	    private String name;   


		public Integer getId() {
			return id;
		}


		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public Student(String name, Integer id) {
	        this.name = name;
	        this.id = id;
	    }
	    public Student()
	    {

	    }

	    public Student(Integer id)
	    {
	    	 this.id = id;
	    }
		

}
