package comxworkz.stream.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Stream;

public class ShoppingMallsRunner {

	public static void main(String[] args) {
		
		Collection<String> malls=new ArrayList<String>();
		malls.add("orion");
		malls.add("lulu");
		malls.add("forum");
		malls.add("UBcity");
		malls.add("Phenoxi");
		malls.add("VegaCity");
		
		System.out.println("malls name is:"+malls);
		
		System.out.println("size is:"+malls.size());
		malls.forEach((q)->System.out.println(q));
		Iterator<String> iterator=malls.iterator();
		//iterator.forEachRemaining((p)->System.out.println(p));
		
		while(iterator.hasNext()) {
			System.out.println("next element is:"+iterator.next());
		}
		
		Stream<String> streams=malls.stream();
		Long counts=streams.count();
		System.out.println("count is:"+counts);
		
		streams.close();
		System.out.println(streams);
		
		
	}
}
