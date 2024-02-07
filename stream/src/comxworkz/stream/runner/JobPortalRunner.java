package comxworkz.stream.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Stream;

public class JobPortalRunner {

	public static void main(String[] args) {
		
		Collection<String> names=new ArrayList<String>();
		names.add("linkdin");
		names.add("nakuri");
		names.add("job search");
		
		//System.out.println(names);
		names.add("apnaapp");
		names.add("indeed");
		//names.addAll(names);
		
		System.out.println("job names are:"+names);
		
		System.out.println(names.size());
		
		names.forEach((ele)->System.out.println(ele));
		
		Iterator<String> iterator=names.iterator();
		//iterator.forEachRemaining((s)->System.out.println(s));
		
		while(iterator.hasNext()) {
			System.out.println("next elemnt is:"+iterator.next());
		}
		
		Stream<String> stream=names.stream();
		//System.out.println(stream.count());
		
		Long counts=stream.count();
		System.out.println(counts);
		
		stream.close();
		System.out.println(stream);
		
		
		
		
	}
}
