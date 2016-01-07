package cn.hp.demo;

/**
 * 岗位类
 * @author RocHuang
 *
 */
public class Role {

	private Long id;
	private String name; // 岗位名称
	private String desc; // 岗位说明

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", desc=" + desc + "]";
	}

}
