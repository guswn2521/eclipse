package chap05;

public class SearchService {
	Member[] members = new Member[5];
	public SearchService() {
		members[0] = new Member("오정원", 167,77, "대한민군");
		members[1] = new Member("James", 184, 67, "미국");
		members[2] = new Member("가루상", 166, 57, "일본");
		members[3] = new Member("홍금보", 177, 80, "중국");
		members[4] = new Member("간디", 190, 77, "인도");
	}
	boolean searchMember(String name) {
		boolean searchResult = false;
		for(int i=0;i<members.length;i++) {
			String nameArr = members[i].getName();
			if(nameArr.equals(name)) {
				searchResult = true;
				//printInfo(members[i]);
				return searchResult;
			}
		}
		return searchResult;
	}
	
	Member searchMember2(String name) {
		Member member = null;
		for(int i=0;i<members.length;i++) {
			String nameArr = members[i].getName();
			if(nameArr.equals(name)) {
				member = members[i];
			}
		}
		return member;
	}
	
	public void printInfo(Member member) {
		System.out.println("Name:"+member.getName());
		System.out.println("height : " + member.getHeight());
		System.out.println("weight : " + member.getWeight());
		System.out.println("naiont : " + member.getNation());
	}
}
