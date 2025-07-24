package in.co.rays.test;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

public class TestUserModel {
	public static void main(String[] args) throws Exception {
		// testAdd();
		// testUpdate();
		// testDelete();
		// testFindByPk();
		// testFindByLoginId()
		//testSearch();

	}

	public static void testAdd() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		UserBean bean = new UserBean();
		bean.setFirstName("Ajay");
		bean.setLastName("Pratap");
		bean.setLogin("ajay@121");
		bean.setPassword("222");
		bean.setDob(sdf.parse("17/07/1992"));
		bean.setMobileNo("+919755244937");
		bean.setRoleId(1);
		bean.setGender("Male");
		bean.setCreatedBy("ADMIN");
		bean.setModifiedBy("ADMIN");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		UserModel model = new UserModel();
		model.add(bean);

	}

	public static void testUpdate() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		UserBean bean = new UserBean();
		bean.setId(2);
		bean.setFirstName("Rohan");
		bean.setLastName("Upadhya");
		bean.setLogin("UserRohan");
		bean.setPassword("555");
		bean.setDob(sdf.parse("23/12/2001"));
		bean.setMobileNo("5555555555");
		bean.setRoleId(1);
		bean.setGender("Male");
		bean.setCreatedBy("ADMIN");
		bean.setModifiedBy("ADMIN");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		UserModel model = new UserModel();
		model.update(bean);

	}

	public static void testDelete() throws Exception {

		UserModel model = new UserModel();
		model.delete(3);
	}

	public static void testFindByPk() throws Exception {
		UserModel model = new UserModel();
		UserBean bean = model.findByPk(6);

		if (bean != null) {
			System.out.print("\t" + bean.getId());
			System.out.print("\t" + bean.getFirstName());
			System.out.print("\t" + bean.getLastName());
			System.out.print("\t" + bean.getLogin());
			System.out.print("\t" + bean.getPassword());
			System.out.print("\t" + bean.getDob());
			System.out.print("\t" + bean.getMobileNo());
			System.out.print("\t" + bean.getRoleId());
			System.out.print("\t" + bean.getGender());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());
		} else {
			System.out.println("id doesnt exist...!");
		}
	}

	public static void testFindByLoginId() throws Exception {

		UserModel model = new UserModel();
		UserBean bean = model.findByLoginId("");

		if (bean != null) {
			System.out.print("\t" + bean.getId());
			System.out.print("\t" + bean.getFirstName());
			System.out.print("\t" + bean.getLastName());
			System.out.print("\t" + bean.getLogin());
			System.out.print("\t" + bean.getPassword());
			System.out.print("\t" + bean.getDob());
			System.out.print("\t" + bean.getMobileNo());
			System.out.print("\t" + bean.getRoleId());
			System.out.print("\t" + bean.getGender());
			System.out.print("\t" + bean.getCreatedBy());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());

		} else {
			System.out.println("LoginId not found...!");
		}

	}

	public static void testSearch() throws Exception {

		UserBean bean = new UserBean();
		// bean.setId(1);
		// bean.setFirstName("Rohan");
		// bean.setLastName("Upadhaya");
		// bean.setLogin("UserAniket");
		// bean.setPassword("222");
		// bean.setDob();
		// bean.setMobileNo();
		// bean.setRoleId();
		// bean.setGender("Male");
		bean.setCreatedBy("Admin");
		// bean.setModifiedBy();
		// bean.setCreatedDatetime();
		// bean.setModifiedDatetime();

		UserModel model = new UserModel();
		List list = model.search(bean, 1, 5);

		Iterator it = list.iterator();

		while (it.hasNext()) {
			bean = (UserBean) it.next();

			System.out.print("\t" + bean.getId());
			System.out.print("\t" + bean.getFirstName());
			System.out.print("\t" + bean.getLastName());
			System.out.print("\t" + bean.getLogin());
			System.out.print("\t" + bean.getPassword());
			System.out.print("\t" + bean.getDob());
			System.out.print("\t" + bean.getMobileNo());
			System.out.print("\t" + bean.getRoleId());
			System.out.print("\t" + bean.getGender());
			System.out.print("\t" + bean.getCreatedBy());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());

		}

	}

}
