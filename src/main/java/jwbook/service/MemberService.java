package jwbook.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jwbook.model.Member;

public class MemberService {
  Map<String, Member> members = new HashMap<>();
  
public MemberService() {
	Member m = new Member("hong", "hong@naver.com");
	members.put("hong", m);
	
	members.put("kim",new Member("kim", "kim@naver.com"));
	members.put("wang",new Member("wang", "wang@naver.com"));
	members.put("Zang",new Member("zang", "Zang@naver.com"));
	members.put("lee",new Member("lee", "lee@naver.com"));
}
//상품리스트 출력
public List<Member> findAll(){
	return new ArrayList<>(members.values());
}
//id에 해당하는 상품 객체 출력
public Member find(String id) {
	return members.get(id);
}

}
