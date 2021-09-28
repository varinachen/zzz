package test1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class q6 {
	public static void main(String[]args) {
		int count;
		for(count=1;count<=1000;count++) {
		List<String> list1 = Arrays.asList("鼠","牛","虎","兔","龍","蛇","馬","羊","猴","雞","狗","豬"); 
		int index1 = (int) (Math.random()* list1.size()); 
		List<String> list2 = Arrays.asList("牡羊座","金牛座","雙子座","巨蟹座","獅子座","處女座","天秤座","天蠍座","射手座","摩羯座","水瓶座","雙魚座"); 
		int index2 = (int) (Math.random()* list2.size()); 
		System.out.println("("+list1.get(index1)+","+list2.get(index2)+")"); 
		List<String> list = Arrays.asList(list1.get(index1)+list2.get(index2));
		int countA=Collections.frequency(list, "鼠");
		System.out.println(countA); 

		
/*		private static List<A> setRepeatedObjectCount(List<A> list){
			Map<Integer, Integer> object_count = new HashMap<Integer, Integer>();
			for (A l : list) {
				Integer count = 1;
				if(object_count.get(l.hashCode()) != null) {//如果存在则count数加1
					count = object_count.get(l.hashCode()) + 1;
				}
				object_count.put(l.hashCode(), count);//map可以替换原来的，保证hascode唯一
			}
			System.out.println(object_count); //这个map存放着对象的hascode值和重复次数
			
			Set<Integer> keys=object_count.keySet();//key值的集合，就是对象的 hascode的值
			
			for (Integer key : keys) {
				for (A l : list) {
					if(key==l.hashCode()){//如果key值 和对象的hascode值相同，则设置出现次数设置vlaue
						l.setCishu(object_count.get(key));
					}
				}
			}
			
			return list;
*/
	/*
		Map<String, Integer> map = new HashMap<String, Integer>(1000);
		for(String item: list1){
			if(map.containsKey(item)){
				map.put(item, map.get(item).intValue() + 1);
		}else{
			map.put(item, new Integer(1));}
		}
		
		Iterator<String> keys = map.keySet().iterator();
		
		while(keys.hasNext()){
			String key = keys.next();
			System.out.println(key + ":" + map.get(key).intValue() + ", ");
*/
/*
		Map<String,String> map = new HashMap<String,String>();
		Set<String> set = map.keySet();
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String key = (String) iterator.next();
			String value = (String) map.get(key);
			System.out.println(key + " = " + value);
*/
		}
		
	}
}
