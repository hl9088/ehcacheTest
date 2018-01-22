package ehcacheTest;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

public class CacheTest {

	public static void main(String[] args) throws Exception {
//		CacheManager cm = new CacheManager("src/main/resources/ehcache.xml");
//		CacheManager cm = CacheManager.create("src/main/resources/ehcache.xml");
//		Cache c = cm.getCache("a");
//		Element e = new Element("firstCacheData", "testValue");
//		Element e1 = new Element("firstCacheData1", "testValue1");
//		c.put(e);
//		c.put(e1);
//		Element element = c.get("firstCacheData");
//		
//		for (int i = 0; i < 100; i++) {
//			Element e = new Element(i, i);
//			c.put(e);
//		}
//		
//		Thread.sleep(1000);
//		
//		for (int i = 100; i < 200; i++) {
//			
//			Element e = new Element(i, i);
//			c.put(e);
//		}
//		
//		Thread.sleep(1000);
//		
//		for (int i = 0; i < 200; i++) {
//			System.out.println(i+" : "+c.get(i));
//		}
//		cm.shutdown();
		
		int i=2,a,b,c;
		int v = (a=i++) + (b=i++) * (c=i++); //1 2 3
		System.out.println(v);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("Ide zji"+i);
		
	}
}
