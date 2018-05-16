import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo {
	public static void main(String[] args) throws Exception {

		User user = new User();

		// Getin name and superClass name
		Class userClass = user.getClass();
		System.out.println(userClass.getName());
		System.out.println(userClass.getSuperclass());

		// Getin all Constructors
		Constructor[] constr = userClass.getConstructors();
		for (Constructor c : constr) {
			System.out.println(c);
		}
		// Getin all Methods + what throws
		Method[] methods = userClass.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
		// Get method setUserName
		Method callMethod = userClass.getDeclaredMethod("setUserName", String.class);
		// Invoke this method on user with param - "root"
		callMethod.invoke(user, "root");
		// when print we see that the name is root
		System.out.println(user);

		// getDeclaredField is used to get a private field
		Field privateField = userClass.getDeclaredField("userName");
		// make the variable accessible !!
		privateField.setAccessible(true);
		privateField.set(user, "toor");
		// When we print we see that we changed userName to "toor"
		System.out.println(user);
	}
}
