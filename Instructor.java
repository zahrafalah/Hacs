package hacs;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 *
 * @author Zhang ji Zhu Wei
 * @version 1.0
 */

public class Instructor extends Person {
	public Instructor() {
		type = 1;// type=1 :instructor
	}

	public CourseMenu CreateCourseMenu(Course theCourse, int theLevel) {
		// 0: Highlevel defined in CourseSeletDlg.
		if (theLevel == 0) {
			theCourseMenu = new HighLevelCourseMenu();
			// 1: LowLevel
		} else {
			theCourseMenu = new HighLevelCourseMenu();
		}
		return theCourseMenu;
	}

	public boolean ShowMenu() {
		super.ShowMenu();
		showAddButton();
		showViewButtons();
		showComboxes();
		showRadios();
		show();
		return ifLogout();
	}
}