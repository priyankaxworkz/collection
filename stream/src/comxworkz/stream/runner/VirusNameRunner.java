package comxworkz.stream.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Stream;

public class VirusNameRunner {

	public static void main(String[] args) {
		
		Collection<String> virusName=new ArrayList<String>();
		virusName.add("dengue");
		virusName.add("malaria");
		virusName.add("corona");
		virusName.add("HIV");
		virusName.add("typoid");
		virusName.add("HEV");
		
		System.out.println("virusName is:"+virusName);
		
		System.out.println(virusName.size());
		
		virusName.forEach((e)->System.out.println(e));
		
		Iterator<String> iterator=virusName.iterator();
		//iterator.forEachRemaining((r)->System.out.println(r));
		
		while(iterator.hasNext()) {
			System.out.println("next element is:"+iterator.next());
		}
		
		Stream<String> streams=virusName.stream();
		System.out.println(streams.count());
		streams.close();
		System.out.println(streams);
	}
}
