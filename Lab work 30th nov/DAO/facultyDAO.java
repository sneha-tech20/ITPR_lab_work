//package com.knmodi.collage.dao;
//
//public interface facultyDAO {
	package com.knmodi.collage.dao;
	import com.knmodi.collage.model.faculty;
	import java.util.ArrayList;
	public interface facultyDAO 
	{
		//method for inserting new faculty data
		int save(faculty courseData);
		
		//method to fetch all faculty list
		ArrayList<faculty> findAll();
		
		//method to fetch a particular faculty
		faculty findByfacultyId(String facultyId);
		
	}

