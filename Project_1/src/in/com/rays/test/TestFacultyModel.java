package in.com.rays.test;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.com.rays.bean.FacultyBean;

import in.com.rays.model.FacultyModel;

public class TestFacultyModel {

	public static void main(String[] args) throws Exception {
		// testAdd();
		// testUpdate();
		// testDelete() ;
		// testFindByPk();
		// testFindByEmail();
		testSearch();

	}

	public static void testAdd() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		FacultyBean bean = new FacultyBean();
		bean.setFirstName("Anshul");
		bean.setLastName("Sir");
		bean.setDob(sdf.parse("23/12/1990"));
		bean.setGender("Male");
		bean.setMobileNo("9812654376");
		bean.setEmail("anshul@gmail.com");
		bean.setCollegeId(101);
		bean.setCollegeName("Rays");
		bean.setCourseId(1101);
		bean.setCourseName("Java development");
		bean.setSubjectId(11101);
		bean.setSubjectName("Java");
		bean.setCreatedBy("ADMIN");
		bean.setModifiedBy("ADMIN");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		FacultyModel model = new FacultyModel();
		model.add(bean);
	}

	public static void testUpdate() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		FacultyBean bean = new FacultyBean();
		bean.setId(1);
		bean.setFirstName("Savan");
		bean.setLastName("Sir");
		bean.setDob(sdf.parse("23/12/1990"));
		bean.setGender("Male");
		bean.setMobileNo("9812654376");
		bean.setEmail("anshul@gmail.com");
		bean.setCollegeId(101);
		bean.setCollegeName("Rays");
		bean.setCourseId(1101);
		bean.setCourseName("Java development");
		bean.setSubjectId(11101);
		bean.setSubjectName("Java");
		bean.setCreatedBy("ADMIN");
		bean.setModifiedBy("ADMIN");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		FacultyModel model = new FacultyModel();
		model.update(bean);
	}

	public static void testDelete() throws Exception {

		FacultyModel model = new FacultyModel();
		model.delete(1);
	}

	public static void testFindByPk() throws Exception {

		FacultyModel model = new FacultyModel();
		FacultyBean bean = model.findByPk(1);

		if (bean != null) {
			System.out.print("\t" + bean.getId());
			System.out.print("\t" + bean.getFirstName());
			System.out.print("\t" + bean.getLastName());
			System.out.print("\t" + bean.getDob());
			System.out.print("\t" + bean.getGender());
			System.out.print("\t" + bean.getMobileNo());
			System.out.print("\t" + bean.getEmail());
			System.out.print("\t" + bean.getCollegeId());
			System.out.print("\t" + bean.getCollegeName());

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

	public static void testFindByEmail() throws Exception {

		FacultyModel model = new FacultyModel();
		FacultyBean bean = model.findByEmail("anshul@gmail.com");

		if (bean != null) {
			System.out.print("\t" + bean.getId());
			System.out.print("\t" + bean.getFirstName());
			System.out.print("\t" + bean.getLastName());
			System.out.print("\t" + bean.getDob());
			System.out.print("\t" + bean.getGender());
			System.out.print("\t" + bean.getMobileNo());
			System.out.print("\t" + bean.getEmail());
			System.out.print("\t" + bean.getCollegeId());
			System.out.print("\t" + bean.getCollegeName());

			System.out.print("\t" + bean.getCourseId());
			System.out.print("\t" + bean.getCourseName());
			System.out.print("\t" + bean.getSubjectId());
			System.out.print("\t" + bean.getSubjectName());
			System.out.print("\t" + bean.getCreatedBy());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());
		} else {
			System.out.println("Email id doesn't exists");
		}
	}

	public static void testSearch() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		FacultyBean bean = new FacultyBean();
		// bean.setId(1);
		// bean.setFirstName("Savan");
		// bean.setLastName("Sir");
		// bean.setDob(sdf.parse("23/12/1990"));
		// bean.setGender("Male");
		// bean.setMobileNo("9812654376");
		// bean.setEmail("anshul@gmail.com");
		// bean.setCollegeId(101);
		// bean.setCollegeName("Rays");
		// bean.setCourseId(1101);
		// bean.setCourseName("Java development");
		// bean.setSubjectId(11101);
		// bean.setSubjectName("Java");
		// bean.setCreatedBy("ADMIN");
		// bean.setModifiedBy("ADMIN");
		// bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		// bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		FacultyModel model = new FacultyModel();
		List list = model.search(bean, 1, 5);

		Iterator it = list.iterator();

		while (it.hasNext()) {
			bean = (FacultyBean) it.next();

			System.out.print("\t" + bean.getId());
			System.out.print("\t" + bean.getFirstName());
			System.out.print("\t" + bean.getLastName());
			System.out.print("\t" + bean.getDob());
			System.out.print("\t" + bean.getGender());
			System.out.print("\t" + bean.getMobileNo());
			System.out.print("\t" + bean.getEmail());
			System.out.print("\t" + bean.getCollegeId());
			System.out.print("\t" + bean.getCollegeName());
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
