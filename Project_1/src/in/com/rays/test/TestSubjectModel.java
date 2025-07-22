package in.com.rays.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.com.rays.bean.CourseBean;
import in.com.rays.bean.SubjectBean;
import in.com.rays.model.CourseModel;
import in.com.rays.model.SubjectModel;

public class TestSubjectModel {
	public static void main(String[] args) throws Exception {

		// testAdd();
		// testUpdate();
		// testDelete();
		// testFindByPk();
		// testFindByName();
		testSearch();

	}

	public static void testAdd() throws Exception {

		SubjectBean bean = new SubjectBean();
		bean.setName("Chemistry");
		bean.setCourseId(102);
		bean.setCourseName("FSD");
		bean.setDescription("Full Stack Developer");
		bean.setCreatedBy("ADMIN");
		bean.setModifiedBy("ADMIN");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		SubjectModel model = new SubjectModel();
		model.add(bean);
	}

	public static void testUpdate() throws Exception {

		SubjectBean bean = new SubjectBean();

		bean.setId(1);
		bean.setName("Physics");
		bean.setCourseId(101);
		bean.setCourseName("FSD");
		bean.setDescription("Full Stack Developer");
		bean.setCreatedBy("ADMIN");
		bean.setModifiedBy("ADMIN");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		SubjectModel model = new SubjectModel();
		model.update(bean);

	}

	public static void testDelete() throws Exception {

		SubjectModel model = new SubjectModel();
		model.delete(3);
	}

	public static void testFindByPk() throws Exception {

		SubjectModel model = new SubjectModel();
		SubjectBean bean = model.findByPk(1);

		if (bean != null) {
			System.out.print("\t" + bean.getId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getCourseId());
			System.out.print("\t" + bean.getCourseName());
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

		SubjectModel model = new SubjectModel();
		SubjectBean bean = model.findByName("Physics");

		if (bean != null) {
			System.out.print("\t" + bean.getId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getCourseId());
			System.out.print("\t" + bean.getCourseName());
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

		SubjectBean bean = new SubjectBean();
		// bean.setId(1);
		// bean.setName("SVCE");
		// bean.setCourseId();
		// bean.setCourseName("SVCE");

		// bean.setDescription("Indore");
		// bean.setCreatedBy("ADMIN");
		// bean.setModifiedBy("ADMIN");
		// bean.setCreatedDatetime();
		// bean.setModifiedDatetime();

		SubjectModel model = new SubjectModel();
		List list = model.search(bean, 1, 1);

		Iterator it = list.iterator();

		while (it.hasNext()) {
			bean = (SubjectBean) it.next();

			System.out.print("\t" + bean.getId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getCourseId());
			System.out.print("\t" + bean.getCourseName());
			System.out.print("\t" + bean.getDescription());

			System.out.print("\t" + bean.getCreatedBy());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());

		}
	}

}
