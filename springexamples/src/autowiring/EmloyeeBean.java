package autowiring;

public class EmloyeeBean {

	private String fullname;
	private DepartmentBean departmentBean;
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public DepartmentBean getDepartmentBean() {
		return departmentBean;
	}
	public void setDepartmentBean(DepartmentBean departmentBean) {
		this.departmentBean = departmentBean;
	}
	public EmloyeeBean(DepartmentBean departmentBean) {
		super();
		this.departmentBean = departmentBean;
	}
	
}
