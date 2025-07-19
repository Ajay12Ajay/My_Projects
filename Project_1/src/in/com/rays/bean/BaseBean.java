package in.com.rays.bean;

import java.sql.Timestamp;

public class BaseBean {

	private long id;
	private String cratedBy;
	private String modifiedBy;
	private Timestamp createdDatetime;
	private Timestamp modifiedDatetime;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCratedBy() {
		return cratedBy;
	}

	public void setCratedBy(String cratedBy) {
		this.cratedBy = cratedBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Timestamp getCreatedDatetime() {
		return createdDatetime;
	}

	public void setCreatedDatetime(Timestamp createdDatetime) {
		this.createdDatetime = createdDatetime;
	}

	public Timestamp getModifiedDatetime() {
		return modifiedDatetime;
	}

	public void setModifiedDatetime(Timestamp modifiedDatetime) {
		this.modifiedDatetime = modifiedDatetime;
	}

}
