package in.co.rays.test;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.bean.StudentBean;
import in.co.rays.bean.TimetableBean;
import in.co.rays.model.StudentModel;
import in.co.rays.model.TimetableModel;

public class TestTimetableModel {
	public static void main(String[] args) throws Exception {
		testAdd();
		//testUpdate();
		//testDelete();
		//testFindByPk();
		//testSearch();
		

	}

	public static void testAdd() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		TimetableBean bean = new TimetableBean();
		
		bean.setSemester("Semester 1");
		bean.setDescription("timetable for semester 1");
		bean.setExamDate(sdf.parse("22/07/2025"));
		bean.setExamTime("8:00 AM -10:00 AM");
		bean.setCourseId(1);
		
		bean.setSubjectId(1);
		
		bean.setCreatedBy("ADMIN");
		bean.setModifiedBy("ADMIN");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		TimetableModel model = new TimetableModel();
		model.add(bean);

	}

	public static void testUpdate() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		TimetableBean bean = new TimetableBean();
		bean.setId(1);
		bean.setSemester("Semester 2");
		bean.setDescription("timetable for semester 1");
		bean.setExamDate(sdf.parse("22/07/2025"));
		bean.setExamTime("8:00 AM -10:00 AM");
		bean.setCourseId(1);
		bean.setCourseName("XYZ");
		bean.setSubjectId(1);
		bean.setSubjectName("Physics");
		bean.setCreatedBy("ADMIN");
		bean.setModifiedBy("ADMIN");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		TimetableModel model = new TimetableModel();
		model.update(bean);

	}

	public static void testDelete() throws Exception {

		TimetableModel model = new TimetableModel();
		model.delete(2);
	}

	public static void testFindByPk() throws Exception {

		TimetableModel model = new TimetableModel();
		TimetableBean bean = model.findByPk(1);

		if (bean != null) {
			System.out.print("\t" + bean.getId());
			System.out.print("\t" + bean.getSemester());
			System.out.print("\t" + bean.getDescription());
			System.out.print("\t" + bean.getExamDate());
			System.out.print("\t" + bean.getExamTime());
			System.out.print("\t" + bean.getCourseId());
			System.out.print("\t" + bean.getCourseName());
			System.out.print("\t" + bean.getSubjectId());
			System.out.print("\t" + bean.getSubjectName());
			System.out.print("\t" + bean.getCreatedBy());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());
		} else {
			System.out.println("id doesn't exists");
		}
	}

	public static void testSearch() throws Exception {

		TimetableBean bean = new TimetableBean();
		// bean.setId(1);
		// bean.setSemester("");
		// bean.setDescription("Rajput");
		// bean.setExamDate();
		// bean.setExamTime("");
		// bean.setCourseId(courseId);
		// bean.setCourseName();
		// bean.setSubjectId(subjectId);
		// bean.setSubjectName();
		// bean.setCreatedBy("Admin");
		// bean.setModifiedBy();
		// bean.setCreatedDatetime();
		// bean.setModifiedDatetime();

		TimetableModel model = new TimetableModel();
		List list = model.search(bean, 1, 5);

		Iterator it = list.iterator();

		while (it.hasNext()) {
			bean = (TimetableBean) it.next();

			System.out.print("\t" + bean.getId());
			System.out.print("\t" + bean.getSemester());
			System.out.print("\t" + bean.getDescription());
			System.out.print("\t" + bean.getExamDate());
			System.out.print("\t" + bean.getExamTime());
			System.out.print("\t" + bean.getCourseId());
			System.out.print("\t" + bean.getCourseName());
			System.out.print("\t" + bean.getSubjectId());
			System.out.print("\t" + bean.getSubjectName());
			System.out.print("\t" + bean.getCreatedBy());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());

		}

	}

}
