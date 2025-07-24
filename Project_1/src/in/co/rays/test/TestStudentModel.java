package in.co.rays.test;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.bean.StudentBean;
import in.co.rays.model.StudentModel;

public class TestStudentModel {
	public static void main(String[] args) throws Exception {

		 testAdd();
		// testUpdate();
		// testDelete();
		// testFindByPk();
		//testFindByEmailId();
		 //testSearch();

	}

	public static void testAdd() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		StudentBean bean = new StudentBean();
		bean.setFirstName("Rohan");
		bean.setLastName("Upadhya");
		bean.setDob(sdf.parse("12/12/1997"));
		bean.setGender("Male");
		bean.setMobileNo("2112211221");
		bean.setEmail("rohan@gmail.com");
		bean.setCollegeId(1);
		//bean.setCollegeName("BANSAL");
		bean.setCreatedBy("ADMIN");
		bean.setModifiedBy("ADMIN");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		StudentModel model = new StudentModel();
		model.add(bean);
	}

	public static void testUpdate() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		StudentBean bean = new StudentBean();
		bean.setId(1);
		bean.setFirstName("Malay");
		bean.setLastName("Rajput");
		bean.setDob(sdf.parse("12/12/1997"));
		bean.setGender("Male");
		bean.setMobileNo("2112211221");
		bean.setEmail("aniket@gmail.com");
		bean.setCollegeId(1);
		bean.setCollegeName("BANSAL");
		bean.setCreatedBy("ADMIN");
		bean.setModifiedBy("ADMIN");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		StudentModel model = new StudentModel();
		model.update(bean);

	}

	public static void testDelete() throws Exception {

		StudentModel model = new StudentModel();
		model.delete(2);
	}

	public static void testFindByPk() throws Exception {

		StudentModel model = new StudentModel();
		StudentBean bean = model.findByPk(1);

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
			System.out.print("\t" + bean.getCreatedBy());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());
		} else {
			System.out.println("id doesn't exists");
		}
	}

	public static void testFindByEmailId() throws Exception {

		StudentModel model = new StudentModel();
		StudentBean bean = model.findByEmailId("rohan@gmail.com");

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
			System.out.print("\t" + bean.getCreatedBy());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());
		} else {
			System.out.println("id doesn't exists");
		}

	}

	public static void testSearch() throws Exception {

		StudentBean bean = new StudentBean();
		// bean.setId(1);
		// bean.setFirstName("Aniket");
		// bean.setLastName("Rajput");
		// bean.setDob();
		// bean.setGender("Male");
		// bean.setMobileNo();
		// bean.setEmail("UserAniket");
		// bean.setCollegeId("222");
		// bean.setCollegeName();
		// bean.setCreatedBy("Admin");
		// bean.setModifiedBy();
		// bean.setCreatedDatetime();
		// bean.setModifiedDatetime();

		StudentModel model = new StudentModel();
		List list = model.search(bean, 1, 5);

		Iterator it = list.iterator();

		while (it.hasNext()) {
			bean = (StudentBean) it.next();

			System.out.print("\t" + bean.getId());
			System.out.print("\t" + bean.getFirstName());
			System.out.print("\t" + bean.getLastName());
			System.out.print("\t" + bean.getDob());
			System.out.print("\t" + bean.getGender());
			System.out.print("\t" + bean.getMobileNo());
			System.out.print("\t" + bean.getEmail());
			System.out.print("\t" + bean.getCollegeId());
			System.out.print("\t" + bean.getCollegeName());
			System.out.print("\t" + bean.getCreatedBy());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());

		}

	}

}
