package com.cisc181.core;

import java.util.UUID;

public class Section {
	
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;
	
	public Section(UUID courseID, UUID semesterID, int roomID) {
		this.CourseID = courseID;
		this.SemesterID = semesterID;
		SectionID = UUID.randomUUID();
		this.RoomID = roomID;
	}
	
	public UUID getCourseID(){
		return CourseID;
	}
	
	public UUID getSectionID(){
		return SectionID;
	}

	public int getRoomID() {
		return RoomID;
	}

	public void setRoomID(int roomID) {
		RoomID = roomID;
	}

	
}
