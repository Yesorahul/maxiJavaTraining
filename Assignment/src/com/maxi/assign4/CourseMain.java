package com.maxi.assign4;

public class CourseMain {

	public static void main(String[] args) {
		Trainer trainer = new Trainer();
		String[] result = trainer.showCourses();
		for (String a : result)
			System.out.println("Course Name : "+ a);
		trainer.showTrainer("TechIn","Sripriya");
	}

}
