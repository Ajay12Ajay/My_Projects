package in.co.rays.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.bean.RoleBean;
import in.co.rays.model.RoleModel;

public class TestRoleModel {
	public static void main(String[] args) throws Exception {
		testAdd();
		// testUpdate();
		// testDelete();
		// testFindByPk();
		// testFindByName();
		// testSearch();

	}

	public static void testAdd() throws Exception {

		RoleBean bean = new RoleBean();
		bean.setName("Admin");
		bean.setDescription("He is an Admin ");
		bean.setCreatedBy("ADMIN");
		bean.setModifiedBy("ADMIN");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		RoleModel model = new RoleModel();
		model.add(bean);

	}

	public static void testUpdate() throws Exception {
		RoleBean bean = new RoleBean();
		bean.setId(4);
		bean.setName("Front-End Developer");
		bean.setDescription("testing row ");
		bean.setCreatedBy("ADMIN");
		bean.setModifiedBy("ADMIN");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		RoleModel model = new RoleModel();
		model.update(bean);

	}

	public static void testDelete() throws Exception {

		RoleModel model = new RoleModel();
		model.delete(4);
	}

	public static void testFindByPk() throws Exception {
		RoleModel model = new RoleModel();
		RoleBean bean = model.findByPk(2);

		if (bean != null) {
			System.out.print("\t" + bean.getId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getDescription());
			System.out.print("\t" + bean.getCreatedBy());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());
		} else {
			System.out.println("id doesn't exists");
		}
	}

	public static void testFindByName() throws Exception {
		RoleModel model = new RoleModel();
		RoleBean bean = model.findByName("Tester");

		if (bean != null) {
			System.out.print("\t" + bean.getId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getDescription());
			System.out.print("\t" + bean.getCreatedBy());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());
		} else {
			System.out.println("id doesn't exists");
		}
	}

	public static void testSearch() throws Exception {
		RoleBean bean = new RoleBean();
		// bean.setId(2);
		// bean.setName("HR");
		// bean.setDescription();
		// bean.setCreatedBy("ADMIN");
		// bean.setModifiedBy();
		// bean.setCreatedDatetime();
		// bean.setModifiedDatetime();

		RoleModel model = new RoleModel();
		List list = model.search(bean, 1, 5);

		Iterator it = list.iterator();

		while (it.hasNext()) {
			bean = (RoleBean) it.next();
			System.out.print("\t" + bean.getId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getDescription());
			System.out.print("\t" + bean.getCreatedBy());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());
		}
	}

}
