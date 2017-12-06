package mybatis;
//运用OOP编程思想，给xml做过改进 --- 接口编程
public interface UserImp {
	//定义方法，interface 只能定义方法，无法实现方法体。
	public User getUserById(Integer id);
}
