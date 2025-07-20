package in.com.rays.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.com.rays.bean.CollegeBean;
import in.com.rays.model.CollegeModel;

public class TestCollegeModel {
	public static void main(String[] args) throws Exception {

		// testAdd();
		// testUpdate();
		// testDelete();
		// testFindByPk();
		testSearch();

	}

	public static void testAdd() throws Exception {
		CollegeBean bean = new CollegeBean();

		bean.setName("SVCE");
		bean.setAddress("address of SVCE");
		bean.setState("MP");
		bean.setCity("Indore");
		bean.setPhoneNo("1212121212");
		bean.setCratedBy("ADMIN");
		bean.setModifiedBy("ADMIN");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		CollegeModel model = new CollegeModel();
		model.add(bean);
	}

	public static void testUpdate() throws Exception {

		CollegeBean bean = new CollegeBean();

		bean.setId(1);
		bean.setName("SVCE");
		bean.setAddress("address of SVCE");
		bean.setState("MP");
		bean.setCity("Indore");
		bean.setPhoneNo("1212121212");
		bean.setCratedBy("ADMIN");
		bean.setModifiedBy("ADMIN");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		CollegeModel model = new CollegeModel();
		model.update(bean);

	}

	public static void testDelete() throws Exception {

		CollegeModel model = new CollegeModel();
		model.delete(2);
	}

	public static void testFindByPk() throws Exception {
		CollegeModel model = new CollegeModel();
		CollegeBean bean = model.findByPk(1);

		if (bean != null) {
			System.out.print("\t" + bean.getId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getAddress());
			System.out.print("\t" + bean.getState());
			System.out.print("\t" + bean.getCity());
			System.out.print("\t" + bean.getPhoneNo());
			System.out.print("\t" + bean.getCratedBy());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());
		} else {
			System.out.println("id doesn't exists");
		}
	}

	public static void testSearch() throws Exception {

		CollegeBean bean = new CollegeBean();
		 //bean.setId(1);
		 //bean.setName("SVCE");
		 //bean.setAddress("address of SVCE");
		 //bean.setCity("Indore");
		// bean.setState("MP");
		// bean.setPhoneNo("1212121212");
		// bean.setCratedBy("ADMIN");
		// bean.setModifiedBy("ADMIN");
		// bean.setCreatedDatetime();
		// bean.setModifiedDatetime();

		CollegeModel model = new CollegeModel();
		List list = model.search(bean, 1, 1);

		Iterator it = list.iterator();

		while (it.hasNext()) {
			bean = (CollegeBean) it.next();

			System.out.print("\t" + bean.getId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getAddress());
			System.out.print("\t" + bean.getState());
			System.out.print("\t" + bean.getCity());
			System.out.print("\t" + bean.getPhoneNo());
			System.out.print("\t" + bean.getCratedBy());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());

		}

	}

}
