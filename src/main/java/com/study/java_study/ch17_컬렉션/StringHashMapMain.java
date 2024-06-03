package com.study.java_study.ch17_컬렉션;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringHashMapMain {

    public static void main(String[] args) {
        HashMap<Integer, String> strMap = new HashMap<>();

        strMap.put(0, "김준일");
        strMap.put(1, "김준이");
        strMap.put(2, "김준삼");
        strMap.put(3, "김준사");

        System.out.println(strMap);

        System.out.println(strMap.get(11));
        
        Map<String , String> lang = Map.of(
                "java", "자바",
                "c", "C",
                "python", "파이썬",
                "js", "자바스크립트"
        );

        System.out.println(lang);

        System.out.println(lang.get("java"));

        Set<Map.Entry<String , String>> entries = lang.entrySet(); // entry도 제네릭 타입
        // set 이랑 entrySet 다름 entrySet() 메서드를 호출하여 맵의 키-값을 쌍으로 Set으로 반환

        for(Map.Entry<String , String> entry: entries){
            System.out.println("key : " + entry.getKey());
            System.out.println("key : " + entry.getValue());
        }

        // of 로 만들면 고정된 데이터를 만듬(수정이 안댐)
        //List<> = ArrayList , linkedList (List에 포함)
        // set<> = hashSet ,
        // Map<> =

    }

}
