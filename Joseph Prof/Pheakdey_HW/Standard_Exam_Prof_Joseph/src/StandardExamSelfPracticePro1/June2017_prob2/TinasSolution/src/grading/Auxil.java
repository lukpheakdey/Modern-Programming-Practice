package grading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

public class Auxil {
	public static boolean sameElements(List<?> list1, List<?> list2) {
		if(list1 == null && list2 == null) return true;
		if(list1 == null || list2 == null) return false;
		if(list1.size() != list2.size()) return false;
		for(Object ob : list1) {
			if(!list2.contains(ob)) return false;
		}
		return true;
	}
	
	//Returns true if cl1 inherits from cl2
	public static boolean inheritsFrom(Class<?> cl1, Class<?> cl2) {
		return cl2.isAssignableFrom(cl1);
	}
	
	public static boolean containsInstVariable(Class<?> cl, String vbleName) {
		List<Field> declaredFields = Arrays.asList(cl.getDeclaredFields());
		for(Field f: declaredFields) {
			if(f.getName().equals(vbleName)) return true;
		}
		return false;
	}
	
	/**
	 * Logic: Checks that all fields found are synthetic fields 
	 */
	public static boolean containsNoInstVariable(Class<?> cl) {
		List<Field> declaredFields = Arrays.asList(cl.getDeclaredFields());
		for(Field f: declaredFields) {
			if(!f.isSynthetic()) return false;
		}
		return true;
	}
	
	public static boolean containsInstVariableType(Class<?> cl, Class<?> type) {
		List<Field> declaredFields = Arrays.asList(cl.getDeclaredFields());
		for(Field f: declaredFields) {
			if(f.getType() == type) return true;
		}
		return false;
	}
	
	public static boolean containsMethod(Class<?> cl, String methodName) {
		List<Method> declaredMethods = Arrays.asList(cl.getDeclaredMethods());
		for(Method f: declaredMethods) {
			if(f.getName().equals(methodName)) return true;
		}
		return false;
		
	}
	
	/**
	 * Usage: Call containsMethod before calling this one. This method returns
	 * false if method is not found. Also returns false if method found but not
	 * declared abstract.
	 */
	public static boolean methodIsAbstract(Class<?> cl, String methodName) {
		List<Method> declaredMethods = Arrays.asList(cl.getDeclaredMethods());
		Method theMethod = null;
		for(Method m: declaredMethods) {
			if(m.getName().equals(methodName)) theMethod = m;
		}
		if(theMethod == null) return false;
		return Modifier.toString(theMethod.getModifiers()).contains("abstract");
		
	}
	
	/**
	 * Usage: Call containsMethod before calling this one. This method returns
	 * false if method is not found. Also returns false if method found but not
	 * declared public. Must pass in types as static variables belonging to Type
	 */
	public static boolean methodHasCorrectArguments(Class<?> cl, String methodName, Class<?>[] types, String[] primitives) {
		List<Method> declaredMethods = Arrays.asList(cl.getDeclaredMethods());
		Method theMethod = null;
		for(Method m: declaredMethods) {
			if(m.getName().equals(methodName)) theMethod = m;
		}
		if(theMethod == null) return false;
		Class<?>[] parameterTypes = theMethod.getParameterTypes();
		if (parameterTypes.length != types.length) return false;
		
		//to check parameter types, in case primitives are used, we need
		//to make use of primitives array - 
		for(int i = 0; i < parameterTypes.length; ++i) {
			boolean accum;
			//if types[i] is ordinary object or a wrapper type, usual comparison of classes
			accum = (parameterTypes[i] == types[i]);
			
			//if types[i] is a primitive use primitives array -- e.g. compare "double" with parameterTypes[i].toString()
			accum |= (primitives[i] != null && primitives[i].equals(parameterTypes[i].toString()));
			if(!accum) return false;
		}
		return true;	
	}
	
	public static boolean methodHasCorrectArguments(Class<?> cl, String methodName, Class<?>[] types) {
		return methodHasCorrectArguments(cl, methodName, types, null);
	}
	
	/**
	 * Usage: Call containsMethod before calling this one. This method returns
	 * false if method is not found. Also returns false if method found but not
	 * declared public.
	 */
	public static boolean methodIsPublic(Class<?> cl, String methodName) {
		List<Method> declaredMethods = Arrays.asList(cl.getDeclaredMethods());
		Method theMethod = null;
		for(Method m: declaredMethods) {
			if(m.getName().equals(methodName)) theMethod = m;
		}
		if(theMethod == null) return false;
		return Modifier.toString(theMethod.getModifiers()).contains("public");
	}
	/**
	 * Usage: Call containsMethod before calling this one. This method returns
	 * false if method is not found. Also returns false if method found but return type
	 * is incorrect
	 */
	public static boolean methodHasCorrectReturnType(Class<?> cl, String methodName, Class<?> returnType) {
		List<Method> declaredMethods = Arrays.asList(cl.getDeclaredMethods());
		Method theMethod = null;
		for(Method m: declaredMethods) {
			if(m.getName().equals(methodName)) theMethod = m;
		}
		if(theMethod == null) return false;
		return (theMethod.getReturnType() == returnType);
	}
	/**
	 * 
	 * @param pathFromSrcDir - example:  "\\src\\prob1\\RemoveDups.java"
	 * @return
	 */
	public static boolean usesForLoop(String pathFromSrcDir) {
			final String FOR = "for";
			String path = System.getProperty("user.dir") + pathFromSrcDir;
			File f = new File(path);
			String line = null;
			boolean forLoopFound = false;
			try(FileReader fileread = new FileReader(f)) {
				try(BufferedReader bufread = new BufferedReader(fileread)) {
					while( (line = bufread.readLine()) != null ) {
						if(line.contains(FOR)) forLoopFound = true;
					}
				}
			} catch(Exception e) {
				System.out.println("Warning: Unable to read student file");
			}
			
			return forLoopFound;
	}
	
	/**
	 * 
	 * @param pathFromSrcDir - example:  "\\src\\prob1\\RemoveDups.java"
	 * @return
	 */
	public static boolean usesWhileLoop(String pathFromSrcDir) {
			final String WHILE = "while";
			String path = System.getProperty("user.dir") + pathFromSrcDir;
			File f = new File(path);
			String line = null;
			boolean whileLoopFound = false;
			try(FileReader fileread = new FileReader(f)) {
				try(BufferedReader bufread = new BufferedReader(fileread)) {
					while( (line = bufread.readLine()) != null ) {
						if(line.contains(WHILE)) whileLoopFound = true;
					}
				}
			} catch(Exception e) {
				System.out.println("Warning: Unable to read student file");
			}
			
			return whileLoopFound;
	}
	
	public static boolean containsConstructor(Class<?> cl, String constructorName) {
		List<Constructor<?>> constructors = Arrays.asList(cl.getDeclaredConstructors());
		for(Constructor<?> c: constructors) {
			if(c.getName().contains(constructorName)) return true;
		}
		return false;
	}
	
	public static boolean constructorHasCorrectNumParams(Class<?> cl, String constructorName, int numParams) {
		List<Constructor<?>> constructors = Arrays.asList(cl.getDeclaredConstructors());
		for(Constructor<?> c: constructors) {
			if(c.getName().contains(constructorName)) {
				return (numParams == c.getParameterTypes().length);
			}
		}
		return false;
	}
}
