package in.com.rays.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import in.com.rays.bean.StudentBean;
import in.com.rays.util.JDBCDataSource;

public class StudentModel {

	public static Integer getNextPk() throws Exception {
		int pk = 0;
		Connection conn = JDBCDataSource.getConnection();
		PreparedStatement pstmt = conn.prepareStatement("select max(id) from st_student");
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			pk = (rs.getInt(1));
		}
		return pk + 1;

	}

	public void add(StudentBean bean) throws Exception {

		/*
		 * RoleBean beanExists = findByName(bean.getName());
		 * 
		 * if (beanExists != null) { throw new Exception("Name already exist");
		 * 
		 * }
		 */

		int pk = getNextPk();

		Connection conn = null;

		try {

			conn = JDBCDataSource.getConnection();

			conn.setAutoCommit(false);

			PreparedStatement pstmt = conn.prepareStatement("insert into st_student values(?,?,?,?,?,?,?,?,?,?,?,?,?)");

			pstmt.setLong(1, pk);
			pstmt.setString(2, bean.getFirstName());
			pstmt.setString(3, bean.getLastName());
			pstmt.setDate(4, new java.sql.Date(bean.getDob().getTime()));
			pstmt.setString(5, bean.getGender());
			pstmt.setString(6, bean.getMobileNo());
			pstmt.setString(7, bean.getEmail());
			pstmt.setLong(8, bean.getCollegeId());
			pstmt.setString(9, bean.getCollegeName());
			pstmt.setString(10, bean.getCratedBy());
			pstmt.setString(11, bean.getModifiedBy());
			pstmt.setTimestamp(12, bean.getCreatedDatetime());
			pstmt.setTimestamp(13, bean.getModifiedDatetime());
			int i = pstmt.executeUpdate();
			System.out.println("Data Inserted : " + i);

			conn.commit();
		} catch (Exception e) {

			conn.rollback();
			System.out.println(e.getMessage());

		} finally {
			conn.close();

		}

	}

	public void update(StudentBean bean) throws Exception {

		/*
		 * RoleBean beanExists = findByName(bean.getName()); if (beanExists != null &&
		 * bean.getId() == beanExists.getId()) {
		 * 
		 * throw new Exception("Name already exists");
		 * 
		 * }
		 */

		Connection conn = null;

		try {
			conn = JDBCDataSource.getConnection();
			conn.setAutoCommit(false);
			PreparedStatement pstmt = conn.prepareStatement(
					"update st_student set first_name= ?, last_name= ?, dob= ?, gender= ?, mobile_no= ?, email= ? ,college_id= ?, college_name= ? , created_by= ?, modified_by= ?, created_datetime= ?, modified_datetime= ? where id= ?");

			pstmt.setString(1, bean.getFirstName());
			pstmt.setString(2, bean.getLastName());
			pstmt.setDate(3, new java.sql.Date(bean.getDob().getTime()));
			pstmt.setString(4, bean.getGender());
			pstmt.setString(5, bean.getMobileNo());
			pstmt.setString(6, bean.getEmail());
			pstmt.setLong(7, bean.getCollegeId());
			pstmt.setString(8, bean.getCollegeName());
			pstmt.setString(9, bean.getCratedBy());
			pstmt.setString(10, bean.getModifiedBy());
			pstmt.setTimestamp(11, bean.getCreatedDatetime());
			pstmt.setTimestamp(12, bean.getModifiedDatetime());
			pstmt.setLong(13, bean.getId());

			int i = pstmt.executeUpdate();
			System.out.println("Data Update : " + i);

			conn.commit();

		} catch (Exception e) {
			conn.rollback();
			System.out.println(e.getMessage());

		} finally {
			conn.close();

		}

	}

	public void delete(int id) throws Exception {
		Connection conn = JDBCDataSource.getConnection();
		PreparedStatement pstmt = conn.prepareStatement("delete from st_student where id = ?");
		pstmt.setLong(1, id);

		int i = pstmt.executeUpdate();
		System.out.println("Data Deleted : " + i);

	}

	public StudentBean findByPk(int id) throws Exception {
		Connection conn = JDBCDataSource.getConnection();
		PreparedStatement pstmt = conn.prepareStatement("select * from st_student where id = ?");
		pstmt.setLong(1, id);

		ResultSet rs = pstmt.executeQuery();
		StudentBean bean = null;
		while (rs.next()) {
			bean = new StudentBean();
			bean.setId(rs.getInt(1));
			bean.setFirstName(rs.getString(2));
			bean.setLastName(rs.getString(3));
			bean.setDob(rs.getDate(4));
			bean.setGender(rs.getString(5));
			bean.setMobileNo(rs.getString(6));
			bean.setEmail(rs.getString(7));
			bean.setCollegeId(rs.getLong(8));
			bean.setCollegeName(rs.getString(9));
			bean.setCratedBy(rs.getString(10));
			bean.setModifiedBy(rs.getString(11));
			bean.setCreatedDatetime(rs.getTimestamp(12));
			bean.setModifiedDatetime(rs.getTimestamp(13));

		}

		return bean;

	}

	public List search(StudentBean bean, int pageNo, int pageSize) throws Exception {

		Connection conn = JDBCDataSource.getConnection();

		StringBuffer sql = new StringBuffer("select * from st_student where 1=1 ");

		if (bean != null) {

			if (bean.getId() > 0) {
				sql.append(" and id =" + bean.getId());
			}
			if (bean.getFirstName() != null) {
				sql.append(" and first_name like '" + bean.getFirstName() + "%'");
			}
			if (bean.getLastName() != null) {
				sql.append(" and last_name like '" + bean.getLastName() + "%'");
			}
			if (bean.getDob() != null) {
				sql.append(" and dob like '" + new java.sql.Date(bean.getDob().getTime()) + "%'");
			}
			if (bean.getGender() != null) {
				sql.append(" and gender like '" + bean.getGender() + "%'");
			}
			if (bean.getMobileNo() != null) {
				sql.append(" and mobile_no like '" + bean.getMobileNo() + "%'");
			}
			if (bean.getEmail() != null) {
				sql.append(" and email like '" + bean.getEmail() + "%'");
			}
			if (bean.getCollegeId() < 0) {
				sql.append(" and college_id =" + bean.getCollegeId());
			}
			if (bean.getCollegeName() != null) {
				sql.append(" and college_name like '" + bean.getCollegeName() + "%'");
			}
			if (bean.getCratedBy() != null) {
				sql.append(" and created_by like '" + bean.getCratedBy() + "%'");
			}
			if (bean.getModifiedBy() != null) {
				sql.append(" and modified_by like '" + bean.getModifiedBy() + "%'");
			}
			if (bean.getCreatedDatetime() != null) {
				sql.append(" and created_datetime like '" + bean.getCreatedDatetime() + "%'");
			}
			if (bean.getModifiedDatetime() != null) {
				sql.append(" and modified_by like '" + bean.getModifiedDatetime() + "%'");
			}

		}

		if (pageSize > 0) {
			pageNo = (pageNo - 1) * pageSize;
			sql.append(" limit " + pageNo + "," + pageSize);
		}

		System.out.println("sql => " + sql);

		PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		ResultSet rs = pstmt.executeQuery();

		List list = new ArrayList();
		while (rs.next()) {
			bean = new StudentBean();
			bean.setId(rs.getLong(1));
			bean.setFirstName(rs.getString(2));
			bean.setLastName(rs.getString(3));
			bean.setDob(rs.getDate(4));
			bean.setGender(rs.getString(5));
			bean.setMobileNo(rs.getString(6));
			bean.setEmail(rs.getString(7));
			bean.setCollegeId(rs.getLong(8));
			bean.setCollegeName(rs.getString(9));
			bean.setCratedBy(rs.getString(10));
			bean.setModifiedBy(rs.getString(11));
			bean.setCreatedDatetime(rs.getTimestamp(12));
			bean.setModifiedDatetime(rs.getTimestamp(13));

			list.add(bean);
		}

		return list;

	}

}
