package comxworkz.stream.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

public class NamesRunner {

	public static void main(String[] args) {
		
		Collection<String> names=new ArrayList<String>();
		names.add("Vani");
		names.add("Priyanaka");
		names.add("vanitha");
		names.add("Nayana");
		names.add("Ramya");
		names.add("Vani");
		
		Stream<String> streams=names.stream().filter(value->value.contains("a"));
		System.out.println(streams);
		streams.forEach((s)->System.out.println(s));
		
		System.out.println("skip method");
		names.stream().skip(2).forEach(val->System.out.println(val));
		
		System.out.println("limit method");
		names.stream().limit(3).forEach(e->System.out.println(e));
		
		System.out.println("sorted");
		names.stream().sorted().forEach(m->System.out.println(m));
		
		System.out.println("unordered");
		names.stream().unordered().forEach(a->System.out.println(a));
		
		System.out.println("equals method");
		names.stream().filter(values->values.equals("Nayana")).forEach(p->System.out.println(p));
		
		System.out.println("distinct method");
	names.stream().distinct().forEach((g)->System.out.println(g));
	
	System.out.println("all the method");
	names.stream().filter(val->val.contains("a"))
	.sorted()
	.skip(1)
	.limit(2)
	.distinct()
	.forEach(x->System.out.println(x));
	
		
		
	}
}
