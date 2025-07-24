package in.co.rays.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.bean.CollegeBean;
import in.co.rays.bean.MarksheetBean;
import in.co.rays.model.CollegeModel;
import in.co.rays.model.MarksheetModel;

public class TestMarksheetModel {

	public static void main(String[] args) throws Exception {
		 testAdd();
		//testUpdate();
		// testDelete();
		// testFindByPk();
		// testFindByRollNO();
		// testSearch();

	}

	public static void testAdd() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		bean.setRollNo("101");
		bean.setStudentId(1);
		bean.setPhysics(66);
		bean.setChemistry(77);
		bean.setMaths(88);
		bean.setCreatedBy("ADMIN");
		bean.setModifiedBy("ADMIN");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		MarksheetModel model = new MarksheetModel();
		model.add(bean);
	}

	public static void testUpdate() throws Exception {

		MarksheetBean bean = new MarksheetBean();

		bean.setId(1);
		bean.setRollNo("1303101");
		bean.setStudentId(111);
		bean.setName("Aniket Rajput");
		bean.setPhysics(66);
		bean.setChemistry(77);
		bean.setMaths(88);
		bean.setCreatedBy("ADMIN");
		bean.setModifiedBy("ADMIN");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		MarksheetModel model = new MarksheetModel();
		model.update(bean);

	}

	public static void testDelete() throws Exception {

		MarksheetModel model = new MarksheetModel();
		model.delete(3);
	}

	public static void testFindByPk() throws Exception {
		MarksheetModel model = new MarksheetModel();
		MarksheetBean bean = model.findByPk(1);

		if (bean != null) {
			System.out.print("\t" + bean.getId());
			System.out.print("\t" + bean.getRollNo());
			System.out.print("\t" + bean.getStudentId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getPhysics());
			System.out.print("\t" + bean.getChemistry());
			System.out.print("\t" + bean.getMaths());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());
		} else {
			System.out.println("id doesnt exist...!");
		}

	}

	public static void testFindByRollNO() throws Exception {

		MarksheetModel model = new MarksheetModel();
		MarksheetBean bean = model.findByRollNo("1303101");

		if (bean != null) {
			System.out.print("\t" + bean.getId());
			System.out.print("\t" + bean.getRollNo());
			System.out.print("\t" + bean.getStudentId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getPhysics());
			System.out.print("\t" + bean.getChemistry());
			System.out.print("\t" + bean.getMaths());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());
		} else {
			System.out.println("id doesnt exist...!");
		}

	}

	public static void testSearch() throws Exception {

		MarksheetBean bean = new MarksheetBean();
		// bean.setId(1);
		// bean.setRollNo("");
		// bean.setStudentId();
		// bean.setName("");
		// bean.setPhysics();
		// bean.setChemistry();
		// bean.setMaths();
		// bean.setCreatedBy("ADMIN");
		// bean.setModifiedBy("ADMIN");
		// bean.setCreatedDatetime();
		// bean.setModifiedDatetime();

		MarksheetModel model = new MarksheetModel();
		List list = model.search(bean, 1, 1);

		Iterator it = list.iterator();

		while (it.hasNext()) {
			bean = (MarksheetBean) it.next();

			System.out.print("\t" + bean.getId());
			System.out.print("\t" + bean.getRollNo());
			System.out.print("\t" + bean.getStudentId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getPhysics());
			System.out.print("\t" + bean.getChemistry());
			System.out.print("\t" + bean.getMaths());
			System.out.print("\t" + bean.getCreatedBy());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());

		}

	}

}
