package in.com.rays.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.com.rays.bean.CourseBean;
import in.com.rays.model.CourseModel;

public class TestCourseModel {
	public static void main(String[] args) throws Exception {
		// testAdd();
		// testUpadte();
		// testDelete();
		// testFindByPk();
		// testFindByName();
		testSearch();

	}

	public static void testAdd() throws Exception {
		CourseBean bean = new CourseBean();
		bean.setName("ABC");
		bean.setDuration("6 Months");
		bean.setDescription("XYZ is the course");
		bean.setCreatedBy("ADMIN");
		bean.setModifiedBy("ADMIN");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		CourseModel model = new CourseModel();
		model.add(bean);

	}

	public static void testUpadte() throws Exception {

		CourseBean bean = new CourseBean();
		bean.setId(2);
		bean.setName("PQR");
		bean.setDuration("6 Months");
		bean.setDescription("XYZ is the course");
		bean.setCreatedBy("ADMIN");
		bean.setModifiedBy("ADMIN");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		CourseModel model = new CourseModel();
		model.update(bean);

	}

	public static void testDelete() throws Exception {

		CourseModel model = new CourseModel();
		model.delete(2);
	}

	public static void testFindByPk() throws Exception {

		CourseModel model = new CourseModel();
		CourseBean bean = model.findByPk(1);

		if (bean != null) {
			System.out.print("\t" + bean.getId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getDuration());
			System.out.print("\t" + bean.getDescription());

			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());
		} else {
			System.out.println("id doesnt exist...!");
		}

	}

	public static void testFindByName() throws Exception {

		CourseModel model = new CourseModel();
		CourseBean bean = model.findByName("XYZ");

		if (bean != null) {
			System.out.print("\t" + bean.getId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getDuration());
			System.out.print("\t" + bean.getDescription());

			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());
		} else {
			System.out.println("id doesnt exist...!");
		}

	}

	public static void testSearch() throws Exception {

		CourseBean bean = new CourseBean();
		// bean.setId(1);
		// bean.setName("SVCE");
		// bean.setDuration("address of SVCE");
		// bean.setDescription("Indore");
		// bean.setCreatedBy("ADMIN");
		// bean.setModifiedBy("ADMIN");
		// bean.setCreatedDatetime();
		// bean.setModifiedDatetime();

		CourseModel model = new CourseModel();
		List list = model.search(bean, 1, 1);

		Iterator it = list.iterator();

		while (it.hasNext()) {
			bean = (CourseBean) it.next();

			System.out.print("\t" + bean.getId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getDuration());
			System.out.print("\t" + bean.getDescription());

			System.out.print("\t" + bean.getCreatedBy());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());

		}
	}

}
