package Collection_Usage;
import java.util.*;
import java.util.Map.Entry;

/*TreeMap은 이진탐색트리의 문제점을 보완한 레드-블랙 트리(Red-Black Tree)로 이루어져 있습니다. 
일반적인 이진 탐색 트리는 트리의 높이만큼 시간이 필요합니다. 값이 전체 트리에 잘 분산되어 있다면 효율성에 있어 
크게 문제가 없으나 데이터가 들어올 때 값이 한쪽으로 편향되게 들어올 경우 한쪽 방면으로 크게 치우쳐진 트리가 되어 
굉장히 비효율적인 퍼포먼스를 냅니다. 이 문제를 보완하기 위해 레드 블랙 트리가 등장하였습니다. 
레드 블랙 트리는 부모 노드보다 작은 값을 가지는 노드는 왼쪽 자식으로, 큰 값을 가지는 노드는 오른쪽 자식으로 
배치하여 데이터의 추가나 삭제 시 트리가 한쪽으로 치우쳐지지 않도록 균형을 맞추어줍니다.*/

public class _TreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> map1 = new TreeMap<Integer,String>();//TreeMap생성
		TreeMap<Integer,String> map2 = new TreeMap<>();//new에서 타입 파라미터 생략가능
		TreeMap<Integer,String> map3 = new TreeMap<>(map1);//map1의 모든 값을 가진 TreeMap생성
		TreeMap<Integer,String> map6 = new TreeMap<Integer,String>(){{//초기값 설정
		    put(1,"a");
		}};
		
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();//TreeMap생성
		map.put(1, "사과");//값 추가
		
		map.remove(1); //key값 1 제거
		map.clear(); //모든 값 제거
		
		map.put(2, "복숭아");
		map.put(3, "수박");
		
		System.out.println(map); //전체 출력 : {1=사과, 2=복숭아, 3=수박}
		System.out.println(map.get(1));//key값 1의 value얻기 : 사과
		System.out.println(map.firstEntry());//최소 Entry 출력
		System.out.println(map.firstKey());//최소 Key 출력 
		System.out.println(map.lastEntry());//최대 Entry 출력
		System.out.println(map.lastKey());//최대 Key 출력 : 3
		
		//entrySet() 활용
		for (Entry<Integer, String> entry : map.entrySet()) {
		    System.out.println("[Key]:" + entry.getKey() + " [Value]:" + entry.getValue());
		}
		

		//KeySet() 활용
		for(Integer i : map.keySet()){ //저장된 key값 확인
		    System.out.println("[Key]:" + i + " [Value]:" + map.get(i));
		}
		
		Iterator<Entry<Integer, String>> entries = map.entrySet().iterator();
		while(entries.hasNext()){
		    Entry<Integer, String> entry = entries.next();
		    System.out.println("[Key]:" + entry.getKey() + " [Value]:" +  entry.getValue());
		}

				
		//keySet().iterator()
		Iterator<Integer> keys = map.keySet().iterator();
		while(keys.hasNext()){
		    int key = keys.next();
		    System.out.println("[Key]:" + key + " [Value]:" +  map.get(key));
		}
	

	}

}
