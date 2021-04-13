package extendent.collections.list;

import static org.junit.Assert.assertTrue;

import java.util.function.BiConsumer;

import org.junit.Test;

public class CallBackedJavaArrayListTest {

	@Test
	public void addSingleItem_emptyList_listSizeShouldBeIncreased() {
		CallBackedJavaArrayList<Integer> cb = new CallBackedJavaArrayListImpl<Integer>();
		cb.add(100, new BiConsumer<Integer, Boolean>() {
			public void accept(Integer item, Boolean result) {
				System.out.println(item +" is added to calbacked list with "+result+" result");
			}
		});
		assertTrue(cb.size() > 0);
	}

}
