package Stream.Stream;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Arrays;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.List;
import java.util.stream.Collectors;

import Stream.Stream.Employee.Gender;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

		List<Employee>person1 = Employee.persons(); 
    	List<String> femaleList= person1.stream()
    				.filter(Employee::isFemale)
    				.map(Employee::toString)
    				//.forEach(System.out::println);
    				.collect(Collectors.toList());
    		System.out.println(femaleList);
    		long femaleCount = Employee.persons().stream()
    				.filter(Employee::isFemale).count();
    		System.out.println("No of Female : "+femaleCount);
    	
    	List<String> maleList= person1.stream()
    				.filter(Employee::isMale)
    				.map(Employee::toString)
    				//.forEach(System.out::println);
    				.collect(Collectors.toList());
    		System.out.println(maleList);
    	long maleCount = Employee.persons().stream()
    				.filter(Employee::isMale).count();
    		System.out.println("No of Male : "+maleCount);
    		
    	long personCount = Employee.persons().stream().count();
    		System.out.println("No of Person : "+personCount);
    	
    		double sum = Employee.persons()
    				.stream()
    				.map(Employee::getId)
    				.reduce(0,Integer::sum);
    		System.out.println("Caculate total id number : "+sum);
    		

    				
    		
    }
}
